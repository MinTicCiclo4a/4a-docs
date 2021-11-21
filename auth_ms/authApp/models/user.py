from django.db import models
from django.contrib.auth.models import AbstractBaseUser, PermissionsMixin, BaseUserManager
from django.contrib.auth.hashers import make_password

class UserManager(BaseUserManager):
    def create_user(self, document, password=None):
        """
        Creates and saves a user with the given username and password.
        """
        if not document:
            raise ValueError('Users must have an username')
        user = self.model(username=document)
        user.set_password(password)
        user.save(using=self._db)
        return user

    def create_superuser(self, username, password):
        """
        Creates and saves a superuser with the given username and password.
        """
        user = self.create_user(
            username=username,
            password=password,
        )
        user.is_admin = True
        user.save(using=self._db)
        return user

class User(AbstractBaseUser, PermissionsMixin):
    document = models.IntegerField(primary_key=True)
    name = models.CharField( max_length = 30)
    last_name= models.CharField( max_length = 30)
    password = models.CharField(max_length = 256)
    email = models.EmailField( max_length = 100)
    phone=models.IntegerField
    date_of_birth= models.DateField ()
    address=models.CharField( max_length = 30)
    city=models.CharField( max_length = 30)

    def save(self, **kwargs):
        some_salt = 'mMUj0DrIK6vgtdIYepkIxN' 
        self.password = make_password(self.password, some_salt)
        super().save(**kwargs)

    objects = UserManager()
    USERNAME_FIELD = 'document'

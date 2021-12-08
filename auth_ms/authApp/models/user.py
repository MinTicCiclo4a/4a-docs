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

    def create_superuser(self, document, password):
        """
        Creates and saves a superuser with the given username and password.
        """
        user = self.create_user(
            username=document,
            password=password,
        )
        user.is_admin = True
        user.save(using=self._db)
        return user

class User(AbstractBaseUser, PermissionsMixin):
    id= models.BigAutoField(primary_key=True)
    document = models.IntegerField (unique=True)
    password = models.CharField(max_length = 256)
    name = models.CharField( max_length = 30)
    email = models.EmailField( max_length = 100)
    
    #last_name= models.CharField( max_length = 30)
    #phone=models.IntegerField
    #date_of_birth= models.DateField ()
    #address=models.TextField()
    #city=models.CharField( max_length = 30)

    def save(self, **kwargs):
        some_salt = 'mMUj0DrIK6vgtdIYepkIxN' 
        self.password = make_password(self.password, some_salt)
        super().save(**kwargs)

    objects = UserManager()
    USERNAME_FIELD = 'document'

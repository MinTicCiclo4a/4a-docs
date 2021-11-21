from rest_framework import serializers
from authApp.models.user import User

class UserSerializer(serializers.ModelSerializer):
    class Meta:
        model = User
        fields = ['document', 'name', 'last_name', 'password', 'email','phone',
                  'date_of_birth','address','city']
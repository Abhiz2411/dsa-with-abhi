# List of common errors in Java
- 1. You Cannot make a static reference to the non-static method
--> So basically you can't call a non-static method from inside the static method unitl and unless
    you create an object of the class to which the non static method belongs. If you don't want to 
    create an object and still call the non static method then make the non static method static.
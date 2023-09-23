# Class-and-Objects
- In this repo, I've covered topics related to class and objects.
- How to create objects of a class.
- How to create array of objects.
- Constructors, various questions on Constructors.
- Data hiding.
- And much more.

# Class
- A class — in the context of Java — is a template used to create objects and to define object data types and methods.
- A class is not a real world entity.
- It is defined as blueprint of objects.
- Class may contain methods, constructors or can be empty.
- More about classes will be in another repository where details about abstarct classes is provided.
- Defining a class :-
- ```
    access_modifier class class_name
    {
        //body of class
        //may contain methods, constructors.
    }
  ```

# Object
- An object is a real world entity.
- A Java object is a member (also called an instance) of a Java class. Each object has an identity, a behavior and a state.
- Objects are created in heap memory via constructors.
- To access the methods of a class, we have to create object of that class.
- Objects are created by using the keyword new.
- Syntax to create an object:-
  ```
    class_name object_name = new constructor_of_that_class;
  ```

# Example of defining a class and creating its object
  ```
  class MyClass{
      int a=10;
      public void display()
      {
          System.out.println("Hello Folks");
      }
  }

  public class Test{
      public static void main(String []args)
      {
          MyClass m=new Myclass() //creating object of class MyClass using default constructor.
          m.display() //this will call the display method.
      }
  }
  ```

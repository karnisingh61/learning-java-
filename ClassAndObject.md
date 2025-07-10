# 🧱 Java: Class and Object

## 🔸 What is a Class?
A **class** is a blueprint for creating objects. It defines the **structure and behavior** (i.e., fields and methods) that the objects created from the class will have.

### ✅ Syntax:
```java
class ClassName {
    // fields (variables)
    // methods
}
🔸 What is an Object?
An object is an instance of a class. It has a state (defined by variables) and behavior (defined by methods).

✅ Syntax:
ClassName objName = new ClassName();
📌 Example:
// Class definition
public class Student {
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Creating Object
        Student s1 = new Student();

        // Assigning values
        s1.name = "karni";
        s1.age = 21;

        // Calling method
        s1.displayInfo();
    }
}
📘 Output:
Name: karni
Age: 21


🔹 Key Points:
A class is like a template.

An object is a real instance of that template.

You can create multiple objects from a single class.

Use the new keyword to create an object.

💡 Real-Life Analogy:

Class: Car design

Object: A real car built using that design.
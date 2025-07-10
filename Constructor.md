# 🚧 Java: Constructor

## 🔸 What is a Constructor?
A **constructor** in Java is a special method that is used to **initialize objects**. It is called **automatically when an object is created**.

---

## 🔹 Features of Constructor:
- Has the **same name as the class**.
- Does **not have a return type** (not even `void`).
- Is **automatically invoked** when an object is created.

---

## ✅ Types of Constructors:

### 1. **Default Constructor**
- Provided by Java if no constructor is defined.
- No parameters.

```java
class Car {
    Car() {
        System.out.println("Default Constructor Called");
    }
    
    public static void main(String[] args) {
        Car c1 = new Car(); // Constructor called automatically
    }
}

2. Parameterized Constructor
Accepts parameters to initialize object fields.
class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Hemant", 21);
        s1.display();
    }
}



3. Constructor Overloading
Multiple constructors with different parameter lists in the same class.

class Rectangle {
    int length;
    int width;

    // Constructor 1
    Rectangle() {
        length = 0;
        width = 0;
    }

    // Constructor 2
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);
        r1.area();  // Output: Area: 0
        r2.area();  // Output: Area: 50
    }
}



4. Copy Constructor (Manual in Java)
Java doesn’t have a built-in copy constructor, but you can create one manually to copy values from another object.
class Book {
    String title;
    String author;

    // Parameterized Constructor
    Book(String t, String a) {
        title = t;
        author = a;
    }

    // Copy Constructor
    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Karni Singh");
        Book b2 = new Book(b1); // Copy constructor called

        b1.display();
        b2.display();
    }
}






💡 Why Use Constructor?
To automatically set initial values when object is created.

Improves code readability and object initialization.

🧠 Interview Tip:
Constructor can't be abstract, final, static, or synchronized.

You can call one constructor from another using this() keyword.
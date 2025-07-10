class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Not Set";
        age = 0;
        System.out.println("Default Constructor called");
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor called");
    }

    // Overloaded Constructor
    Student(String name) {
        this.name = name;
        this.age = 18;
        System.out.println("Overloaded Constructor (Name only) called");
    }

    // Copy Constructor
    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        System.out.println("Copy Constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("----------------------------");
    }
}

// ✅ Main class must be named 'Constructor'
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();               // Default
        s1.display();

        Student s2 = new Student("Hemant", 21);   // Parameterized
        s2.display();

        Student s3 = new Student("Karni");        // Overloaded
        s3.display();

        Student s4 = new Student(s2);             // Copy
        s4.display();
    }
}

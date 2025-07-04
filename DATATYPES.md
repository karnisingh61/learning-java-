## 📚 Java Data Types

In Java, data types are used to define the type of data a variable can hold. They are broadly categorized into:

---

### 🔹 1. Primitive Data Types

Java has 8 built-in primitive data types:

| Data Type | Size     | Description                                      | Example             |
|-----------|----------|--------------------------------------------------|---------------------|
| `byte`    | 1 byte   | Stores whole numbers from -128 to 127            | `byte b = 100;`     |
| `short`   | 2 bytes  | Stores whole numbers from -32,768 to 32,767      | `short s = 5000;`   |
| `int`     | 4 bytes  | Stores whole numbers from -2^31 to 2^31-1        | `int i = 100000;`   |
| `long`    | 8 bytes  | Stores very large whole numbers (add `L`)        | `long l = 100000L;` |
| `float`   | 4 bytes  | Stores decimal numbers (add `f`)                 | `float f = 5.6f;`   |
| `double`  | 8 bytes  | Stores large and precise decimal numbers         | `double d = 19.99;` |
| `char`    | 2 bytes  | Stores a single character                        | `char c = 'A';`     |
| `boolean` | ~1 bit   | Stores `true` or `false`                         | `boolean b = true;` |

---

### 🔹 2. Non-Primitive (Reference) Data Types

These are not built into the language and are based on classes. They store memory addresses (references), not actual values.

- **Examples:** `String`, `Array`, `Class`, `Object`, `Interface`

```java
String name = "Hemant";
int[] scores = {95, 87, 78};

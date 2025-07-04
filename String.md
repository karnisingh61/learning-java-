# 📘 Java Strings

In Java, a **String** is a sequence of characters. It is not a primitive data type — it's an object of the `String` class located in the `java.lang` package.

---

## 🔹 How to Declare a String

```java
String name = "Hemant";                   // Using string literal
String city = new String("Pilani");      // Using new keyword
| Method                  | Description                                   | Example                         | Output      |
| ----------------------- | --------------------------------------------- | ------------------------------- | ----------- |
| `length()`              | Returns the length of the string              | `"Hemant".length()`             | `6`         |
| `charAt(index)`         | Returns character at specified index          | `"Hemant".charAt(0)`            | `'H'`       |
| `toUpperCase()`         | Converts all characters to uppercase          | `"Hemant".toUpperCase()`        | `"HEMANT"`  |
| `toLowerCase()`         | Converts all characters to lowercase          | `"Hemant".toLowerCase()`        | `"hemant"`  |
| `contains(str)`         | Checks if string contains the given substring | `"Hemant".contains("man")`      | `true`      |
| `equals(str)`           | Compares content (case-sensitive)             | `"abc".equals("ABC")`           | `false`     |
| `equalsIgnoreCase(str)` | Compares content (case-insensitive)           | `"abc".equalsIgnoreCase("ABC")` | `true`      |
| `replace(old, new)`     | Replaces all occurrences of old with new      | `"abc abc".replace("a", "x")`   | `"xbc xbc"` |
| `substring(start, end)` | Returns substring from start to end-1         | `"Hello".substring(1, 4)`       | `"ell"`     |
| `trim()`                | Removes spaces from beginning and end         | `"  Hemant  ".trim()`           | `"Hemant"`  |



🔹 String is Immutable
Java Strings are immutable, meaning once a string is created, it cannot be changed. Any string operation returns a new string.
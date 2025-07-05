➕ Java Operators:-

📌 What are Operators?
>In Java, operators are special symbols used to perform operations on variables and values.
>Example: +, -, *, /, =, ==, &&, etc.

🧠 Types of Operators in Java:
1. Arithmetic Operators

| Operator | Meaning        | Example  | Result |
| -------- | -------------- | -------- | ------ |
| `+`      | Addition       | `10 + 5` | `15`   |
| `-`      | Subtraction    | `10 - 5` | `5`    |
| `*`      | Multiplication | `10 * 5` | `50`   |
| `/`      | Division       | `10 / 5` | `2`    |
| `%`      | Modulus        | `10 % 3` | `1`    |


2. Assignment Operators

| Operator | Example  | Meaning       |
| -------- | -------- | ------------- |
| `=`      | `x = 5`  | Assign 5 to x |
| `+=`     | `x += 3` | `x = x + 3`   |
| `-=`     | `x -= 2` | `x = x - 2`   |
| `*=`     | `x *= 4` | `x = x * 4`   |
| `/=`     | `x /= 2` | `x = x / 2`   |


3. Relational (Comparison) Operators
>Used to compare two values.

| Operator | Meaning             | Example  | Result |
| -------- | ------------------- | -------- | ------ |
| `==`     | Equal to            | `5 == 5` | `true` |
| `!=`     | Not equal to        | `5 != 3` | `true` |
| `>`      | Greater than        | `5 > 3`  | `true` |
| `<`      | Less than           | `3 < 5`  | `true` |
| `>=`     | Greater or equal to | `5 >= 5` | `true` |
| `<=`     | Less or equal to    | `3 <= 5` | `true` |


4. Logical Operators
>Used to combine multiple conditions.

| Operator | Meaning     | Example            | Result     |          |   |          |        |
| -------- | ----------- | ------------------ | ---------- | -------- | - | -------- | ------ |
| `&&`     | Logical AND | `(5 > 2 && 4 > 3)` | `true`     |          |   |          |        |
| \`       |             | \`                 | Logical OR | \`(5 < 2 |   | 4 > 3)\` | `true` |
| `!`      | Logical NOT | `!(5 == 5)`        | `false`    |          |   |          |        |


5. Unary Operators
>Work with a single operand.

| Operator | Meaning       | Example | Result      |
| -------- | ------------- | ------- | ----------- |
| `+`      | Positive sign | `+a`    | same as `a` |
| `-`      | Negative sign | `-a`    | negative a  |
| `++`     | Increment     | `a++`   | a = a + 1   |
| `--`     | Decrement     | `a--`   | a = a - 1   |
| `!`      | Logical NOT   | `!true` | `false`     |


6. Bitwise Operators (Advanced)
>Used to perform operations at bit level.

| Operator | Meaning            |            |
| -------- | ------------------ | ---------- |
| `&`      | Bitwise AND        |            |
| \`       | \`                 | Bitwise OR |
| `^`      | Bitwise XOR        |            |
| `~`      | Bitwise Complement |            |
| `<<`     | Left shift         |            |
| `>>`     | Right shift        |            |


<EXAMPLE:-
public class OperatorExample {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Equal? " + (a == b));
        System.out.println("AND: " + (a > 5 && b < 10));
    }
}

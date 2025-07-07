# 🔁 Loops in Java

Loops in Java are used to **execute a block of code multiple times**, depending on a condition. This helps reduce repetition and write efficient code.

---

## 🌀 Types of Loops

---

## 1. 🔄 **For Loop**

The `for` loop is used when the **number of iterations is known**.

### ✅ Syntax:
```java
for (initialization; condition; update) {
    // code to be executed
}
>> EXAMPLE:->
for (int i = 1; i <= 5; i++) {
    System.out.println("For Loop Count: " + i);
}



while (condition) {
    // code to be executed
}
>> EXAMPLE:->
int i = 1;
while (i <= 5) {
    System.out.println("While Loop Count: " + i);
    i++;
}


do {
    // code to be executed
} while (condition);

>> EXAMPLE:->
int i = 1;
do {
    System.out.println("Do-While Loop Count: " + i);
    i++;
} while (i <= 5);

 **Difference Table:

| Feature         | for loop    | while loop      | do-while loop     |
| --------------- | ----------- | --------------- | ----------------- |
| Condition Check | Beginning   | Beginning       | End (after block) |
| Guaranteed Run? | No          | No              | At least once     |
| Use Case        | Fixed count | Condition-based | Must run once     |




✅ Summary
Use for when the number of repetitions is known.

Use while when you want to repeat until a condition becomes false.

Use do-while when you want the loop to run at least once, even if condition fails.

Practice all three loops to master control flow in Java! 💪
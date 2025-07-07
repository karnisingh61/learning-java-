public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = -a;  // Unary minus
        boolean flag = true;

        // Unary minus
        System.out.println("a = " + a);
        System.out.println("Unary minus of a = " + b); // -10

        // Unary NOT
        System.out.println("flag = " + flag);
        System.out.println("!flag = " + (!flag)); // false

        // Increment and Decrement
        int x = 5;
        System.out.println("x = " + x);
        System.out.println("Post-increment x++ = " + (x++)); // 5 (then x becomes 6)
        System.out.println("After post-increment x = " + x); // 6

        System.out.println("Pre-increment ++x = " + (++x)); // 7

        System.out.println("Post-decrement x-- = " + (x--)); // 7 (then x becomes 6)
        System.out.println("After post-decrement x = " + x); // 6

        System.out.println("Pre-decrement --x = " + (--x)); // 5
    }
}

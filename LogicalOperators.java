public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND (&&)
        System.out.println("a && b = " + (a && b)); // false

        // Logical OR (||)
        System.out.println("a || b = " + (a || b)); // true

        // Logical NOT (!)
        System.out.println("!a = " + (!a)); // false
        System.out.println("!b = " + (!b)); // true

        // Example with expressions
        int x = 5, y = 10;
        System.out.println("(x < y) && (x > 2) = " + ((x < y) && (x > 2))); // true
        System.out.println("(x == 5) || (y == 5) = " + ((x == 5) || (y == 5))); // true
        System.out.println("!(x < y) = " + (!(x < y))); // false
    }
}

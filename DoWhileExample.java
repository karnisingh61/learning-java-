import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number (0 to exit): ");
            number = scanner.nextInt();

            if (number != 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is even.");
                } else {
                    System.out.println(number + " is odd.");
                }
            }

        } while (number != 0);

        System.out.println("Program exited.");
        scanner.close();
    }
}

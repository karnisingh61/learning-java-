public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        // Bitwise AND
        System.out.println("a & b = " + (a & b)); // 0101 & 0011 = 0001 → 1

        // Bitwise OR
        System.out.println("a | b = " + (a | b)); // 0101 | 0011 = 0111 → 7

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b)); // 0101 ^ 0011 = 0110 → 6

        // Bitwise Complement
        System.out.println("~a = " + (~a)); // ~0101 → 1010 (in 2's complement = -6)

        // Left Shift
        System.out.println("a << 1 = " + (a << 1)); // 0101 << 1 = 1010 → 10

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1)); // 0101 >> 1 = 0010 → 2
    }
}

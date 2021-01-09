import java.util.Scanner;

public class Fibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void Fibonacci(int limit) {
        if (limit > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            Fibonacci(limit - 1);
        }
    }

    public static void main(String args[]) {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter the limit of Fibonacci series : ");
        int limit = readInput.nextInt();
        System.out.print(n1 + " " + n2);
        Fibonacci(limit - 2);
    }

}

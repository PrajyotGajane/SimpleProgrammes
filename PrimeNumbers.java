import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int userInput = readInput.nextInt();
        boolean isPrimeNumber = isPrime(userInput);

        if (isPrimeNumber) {
            System.out.println("\nNumber is prime");
        } else {
            System.out.println("\nNumber is not prime");
        }
    }

    public static boolean isPrime(int input) {
        if (input <= 1) {
            return false;
        }
        for (int iteration = 2; iteration <= input / 2; ++iteration) {
            if (input % iteration == 0) {
                return false;
            }
        }
        return true;
    }
}

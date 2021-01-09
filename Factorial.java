import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number to find factorial : ");
        int factorial = userInput.nextInt();
        System.out.println("Factorial of " + factorial + " is : " + findFactorial(factorial));    }

    private static int findFactorial(int input) {
        if(input == 0 && input == 1)
            return input;
        int factorial = 1;
        for (int index = input; index > 0; index--)
        {
            factorial = index * factorial;
        }
        return factorial;
    }
}

import java.util.Scanner;

public class SwapThreeVariable {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter the first value A : ");
        int firstVariable = readInput.nextInt();
        System.out.print("\nEnter the second value B : ");
        int secondVariable = readInput.nextInt();
        int thirdVariable;

        thirdVariable = firstVariable;
        firstVariable = secondVariable;
        secondVariable = thirdVariable;

        System.out.println("\nAfter swapping " + "\nA : " + firstVariable + "\nB : " + secondVariable);
    }

}

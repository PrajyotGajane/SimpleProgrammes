import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter the string you want to reverse : ");
        String inputString = readInput.nextLine();
        char[] reverseString = new char[inputString.length()];
        int reverseIndex = 0;
        for (int index = inputString.length() - 1; index >= 0 ; index--)
        {
            reverseString[reverseIndex] = inputString.charAt(index);
            reverseIndex++;
        }

        System.out.println("\nReverse string is : " + toString(reverseString));
    }

    public static String toString(char[] reverseArray)
    {
        String reverseString = String.valueOf(reverseArray);
        return reverseString;
    }
}

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int inputArraySize = userInput.nextInt();
        int[] toSortArray = new int[inputArraySize];
        System.out.println("Enter elements : ");
        for (int index = 0; index < inputArraySize; index++) {
            toSortArray[index] = userInput.nextInt();
        }

        System.out.print("Unsorted array : ");
        for (int eachValue : toSortArray) {
            System.out.print(" " + eachValue);
        }

        for (int index = 0; index < inputArraySize - 1; index++) {
            if (toSortArray[index] > toSortArray[index + 1]) {
                int temp = toSortArray[index];
                toSortArray[index] = toSortArray[index + 1];
                toSortArray[index + 1] = temp;
                index = -1;
            }
        }

        System.out.print("\nSorted array : ");
        for (int eachValue : toSortArray) {
            System.out.print(" " + eachValue);
        }
    }
}

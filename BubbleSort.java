import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

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

        bubbleSort(toSortArray);

        System.out.println("\nArray After Bubble Sort");
        for (int index = 0; index < toSortArray.length; index++) {
            System.out.print(toSortArray[index] + " ");
        }
    }
}
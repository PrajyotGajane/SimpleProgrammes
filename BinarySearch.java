import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int[] sortedArray = new int[]{10, 21, 34, 45, 56, 63, 90};
        System.out.println("Given array is ");
        for (int index = 0; index < sortedArray.length; index++)
            System.out.print(" " + sortedArray[index]);
        System.out.print("\nEnter the number you want to check in the array : ");
        int find = readInput.nextInt();
        int found = binarySearch(sortedArray, find, 0, sortedArray.length - 1);
        if (found == -1) {
            System.out.println("Element is not present");
        } else {
            System.out.println("Element " + find + " is present at index : " + found);
        }
    }

    private static int binarySearch(int[] array, int find, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == find)
                return mid;
            if (array[mid] > find)
                return binarySearch(array, find, left, mid - 1);
            return binarySearch(array, find, mid + 1, right);
        }
        return -1;
    }
}

import java.util.Scanner;

public class MergeSort {
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
        printArray(toSortArray);
        Sort(toSortArray, 0, toSortArray.length - 1);
        System.out.println("After applying merge sort");
        printArray(toSortArray);


    }

    private static void Sort(int[] toSortArray, int left, int right) {
        if (left < right)
        {
            int mid = (left + right) / 2;
            Sort(toSortArray, left, mid);
            Sort(toSortArray, mid + 1, right);
            Merge(toSortArray, left, mid, right);
        }
    }

    private static void Merge(int[] toSortArray, int left, int mid, int right) {
        int mLeft = mid - left  + 1;
        int mRight = right - mid;

        int[] leftArray = new int[mLeft];
        int[] rightArray = new int[mRight];

        for (int index = 0; index < mLeft; ++index)
            leftArray[index] = toSortArray[left + index];
        for (int index = 0; index < mRight; ++index)
            rightArray[index] = toSortArray[mid + 1 + index];
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = mLeft;
        while (i < mLeft && j < mRight) {
            if (leftArray[i] <= rightArray[j]) {
                toSortArray[k] = leftArray[i];
                i++;
            }
            else {
                toSortArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < mLeft) {
            toSortArray[k] = leftArray[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < mRight) {
            toSortArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] toSortArray)
    {
        for (int eachValue : toSortArray) {
            System.out.print(" " + eachValue);
        }
    }
}

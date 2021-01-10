import java.util.Scanner;

public class MergeSort {

    private void sort(int[] array, int lower, int upper) {
        if (lower < upper) {
            int mid = (lower + upper) / 2;
            sort(array, lower, mid);
            sort(array, mid + 1, upper);
            merge(array, lower, mid, upper);
        }
    }

    private void merge(int[] array, int lower, int mid, int upper) {

        int[] temp = new int[upper + 1];
        int i = lower;
        int j = mid + 1;
        int k = lower;

        while (i <= mid && j <= upper) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= upper) {
                temp[k] = array[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                temp[k] = array[i];
                k++;
                i++;
            }
        }

        for (i = lower; i <= upper; i++) {
            array[i] = temp[i];
        }
    }

    private void display(int[] array) {
        System.out.println("Sorted Array : ");
        for( int i = 0; i < array.length; i++){
            System.out.println("array[" + i +"] = " + array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MergeSort mergeObject = new MergeSort();
        int[] array = new int[5];

        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        mergeObject.sort(array, 0, array.length - 1);
        mergeObject.display(array);
    }
}
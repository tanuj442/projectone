import java.util.*;

 class msort {
    public static void main(String args[]) {
        int[] arr = {5, 2, 7, 3, 6, 1, 4};
        System.out.println("Original array: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

     void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int middle = (left + right) / 2;
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);
        merge(arr, left, middle, right);
    }

     void merge(int[] arr, int left, int middle, int right) {
        int[] temp = Arrays.copyOfRange(arr, left, right + 1);
        int i = 0, j = middle - left + 1, k = left;
        while (i <= middle - left && j <= right - left) {
            arr[k++] = temp[i] <= temp[j] ? temp[i++] : temp[j++];
        }
        while (i <= middle - left) {
            arr[k++] = temp[i++];
        }
    }
}


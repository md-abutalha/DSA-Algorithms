public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {4, 6, 9, 3, 5, 1};

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;  // Fix: Change arr[j] to arr[j + 1]
        }

        for (int num : arr) {
            System.out.print( num +" ");  // Fix: Change "short" to "sort"
        }
    }
}

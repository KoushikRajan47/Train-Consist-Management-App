package UC16;

public class SortingService {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Outer loop (passes)
        for (int i = 0; i < n - 1; i++) {

            // Inner loop (comparison)
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if out of order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

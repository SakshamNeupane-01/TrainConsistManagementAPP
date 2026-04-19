
public class UC16 {

    // Bubble Sort Method (Reusable for test cases)
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Optimization: stop if already sorted
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break; // already sorted
        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC16 - Manual Sorting using Bubble Sort ");
        System.out.println("========================================\n");

        int[] capacities = {72, 56, 24, 70, 60};

        // Original
        System.out.println("Original Capacities:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // Sort
        bubbleSort(capacities);

        // Sorted
        System.out.println("\n\nSorted Capacities (Ascending):");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}
import java.util.Arrays;

public class UC19 {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("==========================================\n");

        // Create array
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure sorted (important!)
        Arrays.sort(bogieIds);

        String key = "BG309";

        // Display bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        boolean found = binarySearch(bogieIds, key);

        if (found) {
            System.out.println("\nBogie " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + key + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }

    // 🔥 Binary Search Method (important for test)
    public static boolean binarySearch(String[] arr, String key) {

        if (arr == null || arr.length == 0) return false;

        Arrays.sort(arr); // ensure sorted

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) {
                return true;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
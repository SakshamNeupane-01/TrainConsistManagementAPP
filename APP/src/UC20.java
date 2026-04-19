public class UC20 {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("==========================================\n");

        // Empty bogie list (fail case)
        String[] bogieIds = {};

        String searchId = "BG101";

        // 🔥 FAIL-FAST VALIDATION
        if (bogieIds.length == 0) {
            throw new IllegalStateException(
                    "No bogies available in train. Cannot perform search."
            );
        }

        // SEARCH LOGIC (only runs if not empty)
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie " + searchId + " found.");
        } else {
            System.out.println("Bogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC20 execution completed...");
    }

    // 🔥 METHOD FOR TEST CASES
    public static boolean searchBogie(String[] bogieIds, String searchId) {

        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException(
                    "No bogies available in train. Cannot perform search."
            );
        }

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }

        return false;
    }
}
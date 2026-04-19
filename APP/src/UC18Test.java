import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC18Test {

    @Test
    void testSearch_BogieFound() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(UC18.searchBogie(arr, "BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertFalse(UC18.searchBogie(arr, "BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {
        String[] arr = {"BG101", "BG205", "BG309"};
        assertTrue(UC18.searchBogie(arr, "BG101"));
    }

    @Test
    void testSearch_LastElementMatch() {
        String[] arr = {"BG101", "BG205", "BG309"};
        assertTrue(UC18.searchBogie(arr, "BG309"));
    }

    @Test
    void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};
        assertTrue(UC18.searchBogie(arr, "BG101"));
    }
}
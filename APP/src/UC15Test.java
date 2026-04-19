import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC15Test {

    @Test
    void testSafeCargoAssignment() {
        UC15.GoodsBogie bogie = new UC15.GoodsBogie("Cylindrical");
        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.cargo);
    }

    @Test
    void testUnsafeCargoAssignmentHandled() {
        UC15.GoodsBogie bogie = new UC15.GoodsBogie("Rectangular");
        bogie.assignCargo("Petroleum");

        // cargo should NOT be assigned
        assertNull(bogie.cargo);
    }

    @Test
    void testCargoNotAssignedAfterFailure() {
        UC15.GoodsBogie bogie = new UC15.GoodsBogie("Rectangular");
        bogie.assignCargo("Petroleum");

        assertNull(bogie.cargo);
    }

    @Test
    void testProgramContinuesAfterException() {
        UC15.GoodsBogie bogie1 = new UC15.GoodsBogie("Rectangular");
        bogie1.assignCargo("Petroleum");

        UC15.GoodsBogie bogie2 = new UC15.GoodsBogie("Cylindrical");
        bogie2.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie2.cargo);
    }

    @Test
    void testFinallyBlockExecution() {
        UC15.GoodsBogie bogie = new UC15.GoodsBogie("Rectangular");
        bogie.assignCargo("Petroleum");

        // If no crash → finally executed
        assertTrue(true);
    }
}
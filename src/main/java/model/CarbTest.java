package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CarbTest {

    private Carb carbUnderTest;

    @BeforeEach
    void setUp() {
        carbUnderTest = new Carb();
    }

    @Test
    void testEquals() {
        // Setup

        // Run the test
        final boolean result = carbUnderTest.equals("o");

        // Verify the results
        assertTrue(result);
    }

    @Test
    void testHashCode() {
        // Setup

        // Run the test
        final int result = carbUnderTest.hashCode();

        // Verify the results
        assertEquals(0, result);
    }

    @Test
    void testToString() {
        // Setup

        // Run the test
        final String result = carbUnderTest.toString();

        // Verify the results
        assertEquals("result", result);
    }

    @Test
    void testCanEqual() {
        // Setup

        // Run the test
        final boolean result = carbUnderTest.canEqual("other");

        // Verify the results
        assertTrue(result);
    }
}

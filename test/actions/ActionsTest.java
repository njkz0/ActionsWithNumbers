package actions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActionsTest {

    @Test
    void sumOfIndividualNumbersWithReminder() {
        int result = Actions.sumOfIndividualNumbersWithReminder(12345);
        assertEquals(15, result);
    }

    @Test
    void sumOfIndividualNumbersWithChar() {
        int result = Actions.sumOfIndividualNumbersWithChar(12345);
        assertEquals(15, result);
    }
}
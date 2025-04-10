package Test;

import org.jfree.chart.date.SpreadsheetDate;
import static org.junit.Assert.*;

import org.junit.Test;

public class SpreadsheetDateLogicTestEquals {

	@Test
    public void testEquals_t0() {
		SpreadsheetDate date1 = new SpreadsheetDate(1, 1, 2025);
		SpreadsheetDate date2 = new SpreadsheetDate(1, 1, 2025);

        boolean actual = date1.equals(date2);

        assertTrue(actual);
    }

    @Test
    public void testEquals_t1() {
    	SpreadsheetDate date1 = new SpreadsheetDate(1, 1, 2025);
    	SpreadsheetDate date2 = new SpreadsheetDate(2, 1, 2025);

        boolean actual = date1.equals(date2);

        assertFalse(actual);
    }

    @Test
    public void testEquals_t2() {
    	SpreadsheetDate date1 = new SpreadsheetDate(1, 1, 2025);

        boolean actual = date1.equals(null);

        assertFalse(actual);
    }

}

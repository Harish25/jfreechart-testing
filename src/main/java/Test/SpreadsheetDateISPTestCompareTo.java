package Test;

import org.jfree.chart.date.SpreadsheetDate;
import static org.junit.Assert.*;

import org.junit.Test;

public class SpreadsheetDateISPTestCompareTo {

	//serial < 0
    @Test
    public void testCompareToLess() {
    	SpreadsheetDate d1 = new SpreadsheetDate(1, 1, 2025);
    	SpreadsheetDate d2 = new SpreadsheetDate(15, 3, 2025);

        int actual = d1.compareTo(d2);

        assertTrue(actual < 0);
    }

    //serial == 0
    @Test
    public void testCompareToEqual() {
    	SpreadsheetDate d1 = new SpreadsheetDate(10, 5, 2025);
    	SpreadsheetDate d2 = new SpreadsheetDate(10, 5, 2025);

    	int expected = 0;
        int actual = d1.compareTo(d2);

        assertEquals(expected, actual);
    }

    //serial > 0
    @Test
    public void testCompareToGreater() {
    	SpreadsheetDate d1 = new SpreadsheetDate(15, 3, 2025);
    	SpreadsheetDate d2 = new SpreadsheetDate(1, 1, 2025);

        int actual = d1.compareTo(d2);

        assertTrue(actual > 0);
    }

}

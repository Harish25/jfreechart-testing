package Test;

import org.jfree.chart.date.SpreadsheetDate;
import static org.junit.Assert.*;

import org.junit.Test;

public class SpreadsheetDateISPTestIsOnOrAfter {

	//this.serial < other.serial
    @Test
    public void testIsOnOrAfterLess() {
    	SpreadsheetDate date1 = new SpreadsheetDate(1, 1, 2025);
    	SpreadsheetDate date2 = new SpreadsheetDate(2, 1, 2025);

        boolean actual = date1.isOnOrAfter(date2);

        assertFalse(actual);
    }

    //this.serial == other.serial
    @Test
    public void testIsOnOrAfterEqual() {
    	SpreadsheetDate date1 = new SpreadsheetDate(1, 1, 2025);
    	SpreadsheetDate date2 = new SpreadsheetDate(1, 1, 2025);

        boolean actual = date1.isOnOrAfter(date2);

        assertTrue(actual);
    }

    //this.serial > other.serial
    @Test
    public void testIsOnOrAfterGreater() {
    	SpreadsheetDate date1 = new SpreadsheetDate(2, 1, 2025);
    	SpreadsheetDate date2 = new SpreadsheetDate(1, 1, 2025);

        boolean actual = date1.isOnOrAfter(date2);

        assertTrue(actual);
    }

}

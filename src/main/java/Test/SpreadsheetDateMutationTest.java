package Test;

import org.jfree.chart.date.SpreadsheetDate;
import static org.junit.Assert.*;

import org.junit.Test;


public class SpreadsheetDateMutationTest {

	//Compare dates with a numeral
	@Test
	public void testCompare() {
		SpreadsheetDate date1 = new SpreadsheetDate(1, 5, 2025);
		SpreadsheetDate date2 = new SpreadsheetDate(1, 7, 2025);
		
		int originalDateSerial1 = 45778;
		assertEquals(originalDateSerial1, date1.toSerial());

		int originalDateSerial2 = 45839;
		assertEquals(originalDateSerial2, date2.toSerial());
		
		int expected = 61;
		
		int actual = date2.compare(date1);
		assertEquals(expected, actual);
	}

	//Ensure both days are not same
	@Test
	public void testIsOnFalse() {	
		SpreadsheetDate date1 = new SpreadsheetDate(1, 5, 2025);
		SpreadsheetDate date2 = new SpreadsheetDate(1, 9, 2025);
		
		boolean actual = date1.isOn(date2);
		assertFalse(actual);
	}
	
	//Ensure both days are same
	@Test
	public void testIsOnTrue() {
		SpreadsheetDate date2 = new SpreadsheetDate(1, 9, 2025);
		SpreadsheetDate date3 = new SpreadsheetDate(1, 9, 2025);
		
		boolean actual = date2.isOn(date3);
		assertTrue(actual);
	}

	//Test day 1 being before day 2
	@Test
	public void testIsBeforeTrue() {
		SpreadsheetDate date1 = new SpreadsheetDate(1, 5, 2025);
		SpreadsheetDate date2 = new SpreadsheetDate(1, 9, 2025);
		
		boolean actual = date1.isBefore(date2);
		assertTrue(actual);
	}
	
	//Test day 2 not being before day 1
	@Test
	public void testIsBeforeFalse() {
		SpreadsheetDate date1 = new SpreadsheetDate(1, 5, 2025);
		SpreadsheetDate date2 = new SpreadsheetDate(1, 9, 2025);
		
		boolean actual = date2.isBefore(date1);
		assertFalse(actual);
	}

}

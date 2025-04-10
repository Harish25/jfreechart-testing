package Test;

import org.jfree.chart.date.SpreadsheetDate;
import static org.junit.Assert.*;

import org.junit.Test;

public class SpreadsheetDateISPTestCalcSerial {

	//(1, 1, 1899)
	@Test(expected = IllegalArgumentException.class)
	public void testCalcSerial1() {
	    SpreadsheetDate date = new SpreadsheetDate(1, 1, 1899);
	}

	//(1, 1, 1900)
	@Test
	public void testCalcSerial2() {
	    SpreadsheetDate date = new SpreadsheetDate(1, 1, 1900);
	    
	    int expected = 2;
	    int actual = date.toSerial();
	    
	    assertEquals(expected, actual);
	}

	//(1, 1, 10000)
	@Test(expected = IllegalArgumentException.class)
	public void testCalcSerial3() {
	    SpreadsheetDate date = new SpreadsheetDate(1, 1, 10000);
	}

	//(1, 0, 1900)
	@Test(expected = IllegalArgumentException.class)
	public void testCalcSerial4() {
	    SpreadsheetDate date = new SpreadsheetDate(1, 0, 1900);
	}

	//(1, 1, 1900)
	@Test
	public void testCalcSerial5() {
	    SpreadsheetDate date = new SpreadsheetDate(1, 1, 1900);
	    
	    int expected = 2;
	    int actual = date.toSerial();
	    
	    assertEquals(expected, actual);
	}

	//(1, 15, 1900)
	@Test(expected = IllegalArgumentException.class)
	public void testCalcSerial6() {
	    SpreadsheetDate date = new SpreadsheetDate(1, 15, 1900);
	}

	//(0, 1, 1900)
	@Test(expected = IllegalArgumentException.class)
	public void testCalcSerial7() {
	    SpreadsheetDate date = new SpreadsheetDate(0, 1, 1900);
	}

	//(15, 1, 1900)
	@Test
	public void testCalcSerial8() {
	    SpreadsheetDate date = new SpreadsheetDate(15, 1, 1900);
	    
	    int expected = 16;
	    int actual = date.toSerial();
	    
	    assertEquals(expected, actual);
	}

	//(32, 1, 1900)
	@Test(expected = IllegalArgumentException.class)
	public void testCalcSerial9() {
	    SpreadsheetDate date = new SpreadsheetDate(32, 1, 1900);
	}

}

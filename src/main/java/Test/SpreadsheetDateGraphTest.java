package Test;

import org.jfree.chart.date.SpreadsheetDate;
import org.jfree.chart.date.SerialDate;
import static org.junit.Assert.*;

import org.junit.Test;

public class SpreadsheetDateGraphTest {

//	//TC1: include = 3 (INCLUDE_BOTH)
//    @Test
//    public void isInRangeTest_tc1() {
//    	SpreadsheetDate d1 = new SpreadsheetDate(1, 1, 2025);
//    	SpreadsheetDate d2 = new SpreadsheetDate(1, 5, 2025);
//    	SpreadsheetDate dateS = new SpreadsheetDate(1, 3, 2025);
//    	
//    	boolean actual = dateS.isInRange(d1, d2, SerialDate.INCLUDE_BOTH);
//
//        assertTrue(actual);
//    }
//
//    //TC2: include = 1 (INCLUDE_FIRST)
//    @Test
//    public void isInRangeTest_tc2() {
//    	SpreadsheetDate d1 = new SpreadsheetDate(1, 1, 2025);
//    	SpreadsheetDate d2 = new SpreadsheetDate(1, 5, 2025);
//    	SpreadsheetDate dateS = new SpreadsheetDate(1, 1, 2025);
//    	
//    	boolean actual = dateS.isInRange(d1, d2, SerialDate.INCLUDE_FIRST);
//
//        assertTrue(actual);
//    }
//
//    //TC3: include = 2 (INCLUDE_SECOND)
//    @Test
//    public void isInRangeTest_tc3() {
//    	SpreadsheetDate d1 = new SpreadsheetDate(1, 1, 2025);
//    	SpreadsheetDate d2 = new SpreadsheetDate(1, 5, 2025);
//    	SpreadsheetDate dateS = new SpreadsheetDate(1, 5, 2025);
//
//    	boolean actual = dateS.isInRange(d1, d2, SerialDate.INCLUDE_SECOND);
//    	
//        assertTrue(actual);
//    }
//
//    //TC4: include = 0
//    @Test
//    public void isInRangeTest_tc4() {
//    	SpreadsheetDate d1 = new SpreadsheetDate(1, 1, 2025);
//    	SpreadsheetDate d2 = new SpreadsheetDate(1, 5, 2025);
//    	SpreadsheetDate dateS = new SpreadsheetDate(1, 5, 2025);
//    	
//    	boolean actual = dateS.isInRange(d1, d2, 0);
//
//        assertFalse(actual);
//    }
    
//    //TC1
//    @Test
//    public void isOnOrBeforeTest_tc1() {
//        SerialDate date1 = new SpreadsheetDate(1, 1, 2025);
//        SerialDate date2 = new SpreadsheetDate(1, 5, 2025);
//        
//        boolean actual = date1.isOnOrBefore(date2);
//
//        assertTrue(actual);
//    }
//
//    //TC2
//    @Test
//    public void isOnOrBeforeTest_tc2() {
//        SerialDate date1 = new SpreadsheetDate(1, 5, 2025);
//        SerialDate date2 = new SpreadsheetDate(1, 1, 2025);
//        
//        boolean actual = date1.isOnOrBefore(date2);
//
//        assertFalse(actual);
//    }
 
	//TC1
    @Test
    public void isAfterTest_tc1() {
        SerialDate date1 = new SpreadsheetDate(10, 2, 2025);
        SerialDate date2 = new SpreadsheetDate(10, 9, 2025);
        
        boolean actual = date1.isAfter(date2);

        assertFalse(actual);
    }

    //TC2
    @Test
    public void isAfterTest_tc2() {
        SerialDate date1 = new SpreadsheetDate(10, 2, 2025);
        SerialDate date2 = new SpreadsheetDate(9, 1, 2025);
        
        boolean actual = date1.isAfter(date2);
        
        assertTrue(actual);
    }

}

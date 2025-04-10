package Test;

import org.jfree.chart.date.SpreadsheetDate;
import static org.junit.Assert.*;

import org.junit.Test;

public class SpreadsheetDateLogicTestConstructor1 {

    @Test
    public void spreadsheetDate1Test_t0() {
        SpreadsheetDate date = new SpreadsheetDate(5, 10, 1905);
        assertNotNull(date);
    }

    @Test(expected = IllegalArgumentException.class)
    public void spreadsheetDate1Test_t1() {
        new SpreadsheetDate(1, 1, 1800);
    }

    @Test(expected = IllegalArgumentException.class)
    public void spreadsheetDate1Test_t2() {
        new SpreadsheetDate(1, 13, 1900);
    }

    @Test(expected = IllegalArgumentException.class)
    public void spreadsheetDate1Test_t3() {
        new SpreadsheetDate(55, 10, 1900);
    }

    @Test(expected = IllegalArgumentException.class)
    public void spreadsheetDate1Test_t4() {
        new SpreadsheetDate(1, 13, 10000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void spreadsheetDate1Test_t5() {
        new SpreadsheetDate(1, 0, 1900);
    }

    @Test(expected = IllegalArgumentException.class)
    public void spreadsheetDate1Test_t6() {
        new SpreadsheetDate(0, 10, 1900);
    }

}

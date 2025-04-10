package Test;

import org.jfree.chart.date.SpreadsheetDate;
import static org.junit.Assert.*;

import org.junit.Test;

public class SpreadsheetDateLogicTestConstructor2 {

	@Test
    public void spreadsheetDate2Test_t0() {
        SpreadsheetDate date = new SpreadsheetDate(1000);
        assertNotNull(date);
        System.out.println("t0: toSerial() = " + date.toSerial());
    }

    @Test(expected = IllegalArgumentException.class)
    public void spreadsheetDate2Test_t1() {
        new SpreadsheetDate(1);
    }

    @Test
    public void spreadsheetDate2Test_t2() {
        SpreadsheetDate date = new SpreadsheetDate(1462);
        assertNotNull(date);
        System.out.println("t2: toSerial() = " + date.toSerial());
    }

    @Test(expected = IllegalArgumentException.class)
    public void spreadsheetDate2Test_t3() {
        new SpreadsheetDate(2959999);
    }

}

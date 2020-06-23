/**
 * 
 */
package testCalendar;

import static org.junit.Assert.*;

import calendar.CalendarBug1;
import org.junit.Test;

/**
 * @author Porfirio
 *
 */
public class TestBlackBoxCoperturaAdiacente {

	/**
	 * Test method for {@link calendario.CalendarioBug1#calend(int, String, int)}.
	 */
	@Test
	public void testCalend1() {
		assertEquals(CalendarBug1.calend(13,"aprile",2011),"Mercoledi");
	}
	@Test
	public void testCalend2() {
		assertEquals(CalendarBug1.calend(1,"aprile",1492),"Errore");
	}
	@Test
	public void testCalend3() {
		assertEquals(CalendarBug1.calend(1,"aprile",2118),"Errore");
	}
	@Test
	public void testCalend4() {
		assertEquals(CalendarBug1.calend(1,"brumaio",2011),"Errrore");
	}
	@Test
	public void testCalend5() {
		assertEquals(CalendarBug1.calend(0,"aprile",2011),"Errore");
	}
	@Test
	public void testCalend6() {
		assertEquals(CalendarBug1.calend(35,"aprile",2011),"Errore");
	}
}

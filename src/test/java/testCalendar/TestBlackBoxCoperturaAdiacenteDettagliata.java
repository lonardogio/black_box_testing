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
public class TestBlackBoxCoperturaAdiacenteDettagliata {

	/**
	 * Test method for {@link calendario.CalendarioBug1#calend(int, String, int)}.
	 */
	@Test
	public void testCalend1() {
		assertEquals(CalendarBug1.calend(13,"aprile",2011),"Mercoledi");
	}
	@Test
	public void testCalend2() {
		assertEquals(CalendarBug1.calend(1,"gennaio",1492),"Errore");
	}
	@Test
	public void testCalend3() {
		assertEquals(CalendarBug1.calend(1,"marzo",3000),"Errore");
	}
	@Test
	public void testCalend4() {
		assertEquals(CalendarBug1.calend(1,"brumaio",2011),"Errore");
	}
	@Test
	public void testCalend5() {
		assertEquals(CalendarBug1.calend(0,"maggio",2011),"Errore");
	}
	@Test
	public void testCalend6() {
		assertEquals(CalendarBug1.calend(35,"giugno",2011),"Errore");
	}
	@Test
	public void testCalend7() {
		assertEquals(CalendarBug1.calend(1,"luglio",2016),"Venerdi");
	}
	@Test
	public void testCalend8() {
		assertEquals(CalendarBug1.calend(1,"agosto",2016),"Lunedi");
	}
	@Test
	public void testCalend9() {
		assertEquals(CalendarBug1.calend(1,"settembre",2016),"Giovedi");
	}
	@Test
	public void testCalend10() {
		assertEquals(CalendarBug1.calend(1,"ottobre",2016),"Sabato");
	}
	@Test
	public void testCalend11() {
		assertEquals(CalendarBug1.calend(1,"novembre",2016),"Martedi");
	}
	@Test
	public void testCalend12() {
		assertEquals(CalendarBug1.calend(1,"dicembre",2016),"Giovedi");
	}

}

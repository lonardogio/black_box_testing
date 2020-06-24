package testCalendar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import calendar.CalendarBug1;

/**
 * @author Gioacchino Lonarco
 * @website https://medium.com/@lonardogio
 */

@DisplayName("Test Black Box Adjacent Detailed Coverage")
public class TestBlackBoxAdjacentDetailedCoverage {

	@Test
	@DisplayName("TC1")
	public void testCalend1() {
		assertEquals("tuesday", CalendarBug1.calend(1,"january",1980));
	}

	@Test
	@DisplayName("TC2")
	public void testCalend2() {
		assertEquals("error", CalendarBug1.calend(1,"february",1492));
	}

	@Test
	@DisplayName("TC3")
	public void testCalend3() {
		assertEquals("error", CalendarBug1.calend(1,"march",2118));
	}

//	@Test
//	@DisplayName("TC4")
//	public void testCalend4() {
//		assertEquals("Errore", CalendarBug1.calend(1,"april",twothousand));
//	}

	@Test
	@DisplayName("TC5")
	public void testCalend5() {
		assertEquals("error", CalendarBug1.calend(1,"danuary",1980));
	}

	@Test
	@DisplayName("TC6")
	public void testCalend6() {
		assertEquals("error", CalendarBug1.calend(0,"may",1980));
	}

	@Test
	@DisplayName("TC7")
	public void testCalend7() {
		assertEquals("friday", CalendarBug1.calend(35,"june",1980));
	}

//	@Test
//	@DisplayName("TC8")
//	public void testCalend8() {
//		assertEquals("Lunedi", CalendarBug1.calend(first,"july",1980));
//	}

	@Test
	@DisplayName("TC9")
	public void testCalend9() {
		assertEquals("thursday", CalendarBug1.calend(1,"august",1980));
	}

	@Test
	@DisplayName("TC10")
	public void testCalend10() {
		assertEquals("saturday", CalendarBug1.calend(1,"september",1980));
	}

	@Test
	@DisplayName("TC11")
	public void testCalend11() {
		assertEquals("tuesday", CalendarBug1.calend(1,"october",1980));
	}

	@Test
	@DisplayName("TC12")
	public void testCalend12() {
		assertEquals("thursday", CalendarBug1.calend(1,"november",1980));
	}
}

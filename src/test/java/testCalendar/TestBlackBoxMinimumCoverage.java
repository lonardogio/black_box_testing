/**
 * @author Gioacchino Lonarco
 * @website https://medium.com/@lonardogio
 */

package testCalendar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import calendar.CalendarBug1;

@DisplayName("Test Black Box Minimum Coverage")
public class TestBlackBoxMinimumCoverage {

	@Test
	@DisplayName("TC1")
	public void testCalend1() {
		//assertEquals(expected, actual)
		assertEquals("wednesday", CalendarBug1.calend(1,"january",1980));
	}
	@Test
	@DisplayName("TC2")
	public void testCalend2() {
		assertEquals("error", CalendarBug1.calend(0,"danuary",1492));
	}
	@Test
	@DisplayName("TC3")
	public void testCalend3() {
		assertEquals("error", CalendarBug1.calend(35,"january",2118));
	}
//	@Test
//	@DisplayName("TC4")
//	public void testCalend3() {
//		Assertions.assertEquals(CalendarBug1.calend(first,"january","twothousand"),"Errore");
//	}
}

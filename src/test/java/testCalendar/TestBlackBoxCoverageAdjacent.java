/**
 * @author Gioacchino Lonarco
 * @website https://medium.com/@lonardogio
 */

package testCalendar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import calendar.CalendarBug1;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test Black Box Coverage Adjacent")
public class TestBlackBoxCoverageAdjacent {

	@Test
	@DisplayName("TC1")
	public void testCalend1() {
		assertEquals("tuesday", CalendarBug1.calend(1,"january",1980));
	}

	@Test
	@DisplayName("TC2")
	public void testCalend2() {
		assertEquals("error", CalendarBug1.calend(1,"january",1492));
	}

	@Test
	@DisplayName("TC3")
	public void testCalend3() {
		assertEquals("error", CalendarBug1.calend(1,"january",2118));
	}

	//static analysis already makes me realize that I put a string instead of a number
//	@Test
//	@DisplayName("TC4")
//	public void testCalend4() {
//		assertEquals("error", CalendarBug1.calend(1,"jaunary",twothasend));
//	}

	@Test
	@DisplayName("TC5")
	public void testCalend5() {
		assertEquals("error", CalendarBug1.calend(1,"daunary",1980));
	}

	@Test
	@DisplayName("TC6")
	public void testCalend6() {
		assertEquals("error", CalendarBug1.calend(0,"january",1980));
	}

	@Test
	@DisplayName("TC7")
	public void testCalend7() {
		assertEquals("error", CalendarBug1.calend(35,"january",1980));
	}

	//static analysis already makes me realize that I put a string instead of a number
//	@Test
//	@DisplayName("TC8")
//	public void testCalend8() {
//		assertEquals(CalendarBug1.calend("first","jaunary",1980),"error");
//	}
}

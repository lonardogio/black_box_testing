package testCalendar;

import static org.junit.Assert.*;

import calendar.CalendarBug1;
import org.junit.*;




public class tobiasCombinatorio 
 {

    @Test
 	public void testSequence_1() 
{ String s = CalendarBug1.calend(0,"febbraio",1000) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_2() 
{ String s = CalendarBug1.calend(0,"febbraio",2016) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_3() 
{ String s = CalendarBug1.calend(0,"febbraio",3000) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_4() 
{ String s = CalendarBug1.calend(0,"brumaio",1000) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_5() 
{ String s = CalendarBug1.calend(0,"brumaio",2016) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_6() 
{ String s = CalendarBug1.calend(0,"brumaio",3000) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_7() 
{ String s = CalendarBug1.calend(15,"febbraio",1000) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_8() 
{ String s = CalendarBug1.calend(15,"febbraio",2016) ; assertEquals(s,"Lunedi");
    
			
  	}

    @Test
 	public void testSequence_9() 
{ String s = CalendarBug1.calend(15,"febbraio",3000) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_10() 
{ String s = CalendarBug1.calend(15,"brumaio",1000) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_11() 
{ String s = CalendarBug1.calend(15,"brumaio",2016) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_12() 
{ String s = CalendarBug1.calend(15,"brumaio",3000) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_13() 
{ String s = CalendarBug1.calend(40,"febbraio",1000) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_14() 
{ String s = CalendarBug1.calend(40,"febbraio",2016) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_15() 
{ String s = CalendarBug1.calend(40,"febbraio",3000) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_16() 
{ String s = CalendarBug1.calend(40,"brumaio",1000) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_17() 
{ String s = CalendarBug1.calend(40,"brumaio",2016) ; assertEquals(s,"Errore");
    
			
  	}

    @Test
 	public void testSequence_18() 
{ String s = CalendarBug1.calend(40,"brumaio",3000) ; assertEquals(s,"Errore");
    
			
  	}

}

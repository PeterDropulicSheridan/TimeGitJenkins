package time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTest {

	
	@Test
    public void testGetMilliseconds() {
        Time time = new Time();
        assertEquals(5, time.getMilliseconds("12:05:05:05"));
    }
	
	
    @Test
    public void testGetMillisecondsWithInvalidInput() {
        Time time = new Time();
        assertThrows(NumberFormatException.class, () -> time.getMilliseconds("invalidTime"));
    }

    @Test
    public void testGetMillisecondsLowerBoundary() {
        Time time = new Time();
        assertEquals(0, time.getMilliseconds("00:00:00:00"));
    }

    @Test
    public void testGetMillisecondsWithUpperBoundary() {
        Time time = new Time();
        assertEquals(999, time.getMilliseconds("23:59:59:999"));
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	@Test
	void testGetTotalSecondsGood() {
		int seconds = Time.getTotalSeconds("05:05:05");
		assertTrue("the seconds were not calculated properly", seconds ==18305);
		
	}
	
	
	@Test
	public void testGetTotalSecondsBad() {
		assertThrows(
				StringIndexOutOfBoundsException.class,
		()->{Time.getTotalSeconds("10:00:70");});
	}
	
	@Test
	void testGetSecondsGood() {
	    int seconds = Time.getSeconds("12:34:56");
	    assertEquals("Seconds were not extracted correctly", 56, seconds);
	}
	
	
	@Test
	void testGetSecondsBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getSeconds("12:54:70");
	    });
	}

	@Test
	void testGetTotalMinutesGood() {
	    int minutes = Time.getTotalMinutes("01:23:45");
	    assertEquals("Minutes were not calculated correctly", 23, minutes);
	}

	@Test
	void testGetTotalMinutesBad() {
	    assertThrows(StringIndexOutOfBoundsException.class, () -> {
	        Time.getTotalMinutes("01:23:45");
	    });
	}

	


	@ParameterizedTest
	@ValueSource(strings = { "05:00:00", "05:15:15", "05:59:59"})
	void testGetTotalHours(String candidate) {
		int hours = Time.getTotalHours(candidate);
		assertTrue("The hours were not calculated properly", hours ==5);
	}
	*/
	

}

package strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestsClassStringBuilder {
final StringBuilder strBuilder = new StringBuilder("I learn");
	@Test
	void testAppendString() {
		String str = " Java!"; 
		String expected = "I learn Java!";
		assertEquals(expected, strBuilder.append(str).toString());
	}

	@Test
	void testReplaceIntIntString() {
		assertEquals("I study", strBuilder.replace(2, 7, "study").toString());
		// V.R. The case strBuilder.replace(222, 777, "study") isn't checked
		// V.R. The case strBuilder.replace(2, 7, null) isn't checked
	}

	@Test
	void testInsertIntString() {
		assertEquals("I am learn", strBuilder.insert(2, "am ").toString());
		// V.R. The case strBuilder.insert(-2, "am ") isn't checked
	}

	@Test
	void testReverse() {
		StringBuilder stringBuilder1 = new StringBuilder("123456789");
		assertEquals("987654321", stringBuilder1.reverse().toString());
	}

}

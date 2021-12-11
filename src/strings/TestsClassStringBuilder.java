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
	}

	@Test
	void testInsertIntString() {
		assertEquals("I am learn", strBuilder.insert(2, "am ").toString());
	}

	@Test
	void testReverse() {
		StringBuilder stringBuilder1 = new StringBuilder("123456789");
		assertEquals("987654321", stringBuilder1.reverse().toString());
	}

}

package strings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.IllegalFormatException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestsClassString {
final static String str = "I learn Java";
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCharAt() {
		assertEquals('I', str.charAt(0));
		assertEquals('J', str.charAt(8));
		try {
			char t = str.charAt(-8);
			fail("There should be exception");
		} catch (StringIndexOutOfBoundsException e) {
			
		}
		try {
			char t = str.charAt(888);
			fail("There should be exception");
		} catch (StringIndexOutOfBoundsException e) {
			
		}
		/* V.R.
		 *  The cases  str.charAt(-8) and str.charAt(888) aren't tested
		 */
	}

	@Test
	void testEqualsIgnoreCase() {
		String str1 = "I learn Java";
		String str2 = "I LEARN JAVA";
		String str3 = "I LEARN JAV";
		assertEquals(true, str.equalsIgnoreCase(str1));
		assertEquals(true, str.equalsIgnoreCase(str2));
		assertEquals(false, str.equalsIgnoreCase(str3));
	}

	@Test
	void testCompareToIgnoreCase() {
		String str1 = "I learn Java";
		String str2 = "I LEARN JAVA";
		String str3 = "I lear Java";
		assertTrue(0 == str.compareToIgnoreCase(str1));
		assertTrue(0 == str.compareToIgnoreCase(str2));
		assertTrue(0 < str.compareToIgnoreCase(str3));
		// V.R. The method compareToIgnoreCase() isn't tested at all
	}

	@Test
	void testStartsWithStringInt() {
		assertEquals(true, str.startsWith("I l", 0));
		assertEquals(true, str.startsWith("Ja", 8));
		assertEquals(false, str.startsWith("I", 1));
	}

	@Test
	void testStartsWithString() {
		assertEquals(true, str.startsWith("I"));
		assertEquals(true, str.startsWith("I le"));
		assertEquals(false, str.startsWith("va"));
	}

	@Test
	void testEndsWith() {
		assertEquals(true, str.endsWith("Java"));
		assertEquals(true, str.endsWith("a"));
		assertEquals(false, str.endsWith("J"));
	}

	@Test
	void testIndexOfInt() {
		assertEquals(0, str.indexOf(73));
		assertEquals(-1, str.indexOf("Y"));
		assertEquals(8, str.indexOf(74));
	}

	@Test
	void testIndexOfIntInt() {
		assertEquals(-1, str.indexOf("j", 8));
		assertEquals(8, str.indexOf("J", 8));
		assertEquals(0, str.indexOf("I", 0));
	}

	@Test
	void testLastIndexOfIntInt() {
		assertEquals(11, str.lastIndexOf("a", 11));
		assertEquals(4, str.lastIndexOf("a", 8));
		assertEquals(-1, str.lastIndexOf("N", 10));
	}

	@Test
	void testIndexOfString() {
		assertEquals(2, str.indexOf("l"));
		assertEquals(0, str.indexOf("I"));
		assertEquals(-1, str.indexOf("H"));
	}

	@Test
	void testLastIndexOfString() {
		assertEquals(7, str.lastIndexOf(" "));
		assertEquals(11, str.lastIndexOf("a"));
		assertEquals(-1, str.lastIndexOf("!"));
	}

	@Test
	void testSubstringInt() {
		assertEquals("Java", str.substring(8));
		assertEquals("va", str.substring(10));
		// V.R. The cases str.substring(-5) and str.substring(77) aren't checked
		try {
			String t = str.substring(-5);
			fail("There should be exception");
		} catch (StringIndexOutOfBoundsException e) {
			
		}
		try {
			String t = str.substring(77);
			fail("There should be exception");
		} catch (StringIndexOutOfBoundsException e) {
			
		}
	}

	@Test
	void testSubstringIntInt() {
		assertEquals("Java", str.substring(8, 12));
		assertEquals("learn", str.substring(2, 7));
		// V.R. The cases str.substring(-5, 3) and str.substring(3, 77) aren't checked
		try {
			String t = str.substring(-5, 3);
			fail("There should be exception");
		} catch (StringIndexOutOfBoundsException e) {
			
		}
		try {
			String t = str.substring(3, 77);
			fail("There should be exception");
		} catch (StringIndexOutOfBoundsException e) {
			
		}
	}

	@Test
	void testContains() {
		assertTrue(str.contains("Java"));
		assertFalse(str.contains("Learn"));
	}

	@Test
	void testJoinCharSequenceCharSequenceArray() {
		String[] str1 = {"Hello", "my", "name", "is", "Kirill"};
		assertEquals("Hello my name is Kirill", str.join(" ", str1));
		// V.R. The case str.join(null, str1) isn't checked
		try {
			String t = String.join(null, str1);
			fail("There should be exception");
		} catch(NullPointerException e) {
			
		}
	}

	@Test
	void testToLowerCase() {
		assertEquals("i learn java", str.toLowerCase());
	}

	@Test
	void testTrim() {
		String str1 = " London is a capital of Great Britain ";
		assertEquals("London is a capital of Great Britain", str1.trim());
	}

	@Test
	void testToCharArray() {
		String str1 = "Tel-Ran";
		char[] expected = {'T', 'e', 'l', '-', 'R', 'a', 'n'};
		assertArrayEquals(expected, str1.toCharArray());
	}

	@Test
	void testFormatStringObjectArray() {
		String str1 = "I'm from %s-%s-%s";
		String[] obj = {"Rostov", "on", "Don"};
		assertEquals("I'm from Rostov-on-Don", str1.format(str1, obj));
		// V.R. The case with exception IllegalFormatException isn't checked.
		// For example,
		// String t = String.format("I said: %d", "Yes");
		try {
			String t = String.format("I said: %d", "Yes");
			fail("There should be exception");
		} catch (IllegalFormatException e) {
			
		}
	}

}

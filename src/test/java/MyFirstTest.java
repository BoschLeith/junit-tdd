import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
	@Test
	public void testStringEqual() {
		String expected = "Codeup";
		String actual = "Codeup";

		assertEquals(expected, actual);
	}

	@Test
	public void testArrayListEqual(){
		List<String> languages = new ArrayList<>();
		List<String> moreLanguages = new ArrayList<>();

		assertNotSame(languages, moreLanguages);
	}

	@Test
	public void testArraysEqual(){
		int[] numbers = {1, 2, 3};
		int[] otherNumbers = new int[3];
		otherNumbers[0] = 1;
		otherNumbers[1] = 2;
		otherNumbers[2] = 3;

		assertArrayEquals(numbers, otherNumbers);
	}

	@Test
	public void testTrueFalse(){
		String language = "PHP";
		// use assertTrue for this statement
		assertTrue(language.contains("H"));
		// use assertFalse for this statement
		assertFalse(language.contains("J"));
	}
}

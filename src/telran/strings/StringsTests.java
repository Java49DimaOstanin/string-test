package telran.strings;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class StringsTests {
	String telran = "Telran";
	String telran1 = "Telran";
	String semp    = "abcabcabc";
	@Test
     void  charAtTest() {
		assertEquals(telran.charAt(3),'r');
		assertEquals(telran.charAt(5),'n');
//		assertEquals('x', "".charAt(0));
//		assertEquals('x', "Java".charAt(-1));
//		assertEquals('x', "Java".charAt(7));
	 
     }
	@Test
	void  compareToTest() {
		assertEquals(telran.compareTo(telran1),0);
		assertTrue(telran.compareTo("Java")>0);
     }
	@Test
	void  compareToIgnoreCaseTest() {
		assertEquals(0,telran.compareToIgnoreCase("telRaN"));
		assertEquals(0,telran.compareToIgnoreCase("TELRAN"));
		assertEquals(0, "hello".compareToIgnoreCase("hello"));
     }
	@Test
    void  concatTest() {
		assertEquals(telran.concat(telran1),"TelranTelran");
		assertFalse(telran.concat("opa")== "justcheck");
		assertEquals("xxxx".concat(""),"".concat("xxxx"));
		
    }
	@Test
    void  startsWithTest() {
		assertTrue(telran.startsWith("Tel"));
		assertFalse(telran.startsWith("Tl"));
    }
	@Test
    void  endsWithTest() {
		assertTrue(telran.endsWith("ran"));
		assertFalse(telran.endsWith("ron"));
		assertTrue(telran1.startsWith(""));
    }
	@Test
    void  containsTest() {
		assertTrue(telran.contains("ran"));
		assertTrue(telran.contains("el"));
		assertFalse(telran.contains("TL"));
		assertTrue(telran1.endsWith(""));
    }
	@Test
    void  indexOfTest() {
		assertEquals(telran.indexOf("ra"),3);
		assertEquals(telran.indexOf("T"),0);
    }
	@Test
    void  lastIndexOfTest() {
		assertEquals(semp.lastIndexOf("a"),6);
		assertEquals(semp.lastIndexOf("bc"),7);
    }
}

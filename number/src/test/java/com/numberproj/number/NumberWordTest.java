package com.numberproj.number;

	

	import org.junit.*;

	import com.numberproj.number.*;

	public class NumberWordTest {
		private NumberWords numberWords ;
		
		@Before
		public void setup() {
			numberWords = new NumberWords() ;
		}

		@Test
		public void numberOutOfRangeReturnsError() {
			Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
		}

	}
	

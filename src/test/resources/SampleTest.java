import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public void test() {
		Sample s = new Sample();
		assertEquals(s.sample(), "sample");
	}

}

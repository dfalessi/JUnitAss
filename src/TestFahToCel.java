
import static org.junit.Assert.*;

import org.junit.Test;



public class TestFahToCel {
	@Test
	public void testFToC()
	{
		TempTrans Test1 = new TempTrans();
		double output = Test1.fToC(104);
		assertEquals(40, output, 0.1);
	}
	
}
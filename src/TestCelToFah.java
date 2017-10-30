
import static org.junit.Assert.*;

import org.junit.Test;



public class TestCelToFah {
	@Test
	public void testCToF()
	{
		TempTrans Test1 = new TempTrans();
		double output = Test1.cToF(40);
		assertEquals(104, output, 0.1);
	}
	
}

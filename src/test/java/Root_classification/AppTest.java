package Root_classification;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest 
{

	@Test
	public void testPartion1() 
	{
		//(0,1,2)
		App.calculate_roots(-2, 1, 2);
		
		String  root_expected = Root_Types.ERROR.toString();
		
		
		assertEquals(root_expected, App.root_types().toString());
	}

}

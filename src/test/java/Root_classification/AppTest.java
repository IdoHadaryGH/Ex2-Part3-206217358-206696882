package Root_classification;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

	@Test
	public void TC1_A_min() {
		App.calculate_roots(0, 5, 20);
		String root_expected = Root_Types.Not_quadratic.toString();
		assertEquals(root_expected, App.root_types().toString());
	}
	@Test
	public void TC2_A_minPlusOne() {
		App.calculate_roots(1, 5, 2);
		String root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, App.root_types().toString());
	}
	@Test
	public void TC3_A_nominal() {
		App.calculate_roots(25, 50, 25);
		String root_expected = Root_Types.Equal_roots.toString();
		assertEquals(root_expected, App.root_types().toString());
	}
	@Test
	public void TC4_A_max() {
		App.calculate_roots(100, 89, -390); 
		String root_expected = Root_Types.ERROR.toString();
		assertEquals(root_expected, App.root_types().toString());
	}
	@Test
	public void TC5_A_maxMinusOne() {
		App.calculate_roots(99, 11, 5);
		String root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, App.root_types().toString());
	}

}

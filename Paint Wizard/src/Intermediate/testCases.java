package Intermediate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testCases {

	@Test
	void test() {
		PaintWizard testing = new PaintWizard();
		assertEquals("AverageJoes", testing.cheapPaintOption(210));
		assertEquals("CheapoMax", testing.cheapPaintOption(200));
		assertEquals("AverageJoes", testing.cheapPaintOption(56));
	}

}

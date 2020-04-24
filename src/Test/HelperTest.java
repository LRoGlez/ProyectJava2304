package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Moto;
import Operations.Helper;

class HelperTest {

	@Test
	void testAcelerate() {
		Moto m1=new Moto("7854JKL", "Yamaha", "MT09", 896, 125, 0, "black");
		
		Helper.acelerate(m1, 50);
		assertEquals(50, m1.getSpeed());
	}

	@Test
	void testDecelerate() {
		Moto m1=new Moto("7854JKL", "Yamaha", "MT09", 896, 125, 50, "black");
		
		Helper.decelerate(m1, 30);
		assertEquals(20, m1.getSpeed());
	}

	@Test
	void testBrake() {
		Moto m2=new Moto("2577CHL", "Honda", "CBR", 1000, 190, 75, "red");
		Helper.brake(m2);
		assertEquals(0, m2.getSpeed());
	}
	
	@Test
	void paint() {
		Moto m2=new Moto("2577CHL", "Honda", "CBR", 1000, 190, 75, "red");
		
		Helper.paint(m2, "green");
		assertEquals("green", m2.getColour());
	}
	
	@Test
	void addCv() {
		Moto m2=new Moto("2577CHL", "Honda", "CBR", 1000, 100, 75, "red");
		
		Helper.addCv(m2, 27);
		assertEquals(127, m2.getCv());
	}

}

package Operations;

import Model.Moto;

public class Helper {
	public static void acelerate(Moto m, int v) {
		m.setSpeed(m.getSpeed()+v);
	}
	public static void decelerate(Moto m, int v) {
		m.setSpeed(m.getSpeed()-v);
	}
	public static void brake(Moto m) {
		m.setSpeed(0);
	}
	public static void paint(Moto m, String c) {
		m.setColour(c);
	}
	public static void addCv(Moto m, int c) {
		m.setCv(m.getCv()+c);
	}
}

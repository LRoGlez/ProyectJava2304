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
}

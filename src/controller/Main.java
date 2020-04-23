package controller;

import Model.Moto;
import Operations.Helper;

public class Main {

	public static void main(String[] args) {
		Moto m1=new Moto("7854JKL", "Yamaha", "MT09", 896, 125, 0, "black");
		Moto m2=new Moto("2577CHL", "Honda", "CBR", 1000, 190, 0, "red");
		
		Moto[]motos=new Moto[2];
		motos[0]=m1;
		motos[1]=m2;
		
		Helper.acelerate(m1, 20);
		Helper.acelerate(motos[1], 65);
		
		
		for(Moto m:motos) {
			System.out.println(m);
		}
		
		Helper.brake(m2);
		
		System.out.println("new speed: "+m2.getSpeed());
	}

}

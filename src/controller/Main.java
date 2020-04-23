package controller;

import Model.Moto;
import Operations.Helper;

public class Main {

	public static void main(String[] args) {
		Moto m1=new Moto("7854JKL", "Yamaha", "MT09", 896, 125, 0, "black");
		Moto m2=new Moto("2577CHL", "Honda", "CBR", 1000, 190, 0, "red");
		Moto m3=new Moto();
		
		Moto[]motos=new Moto[3];
		motos[0]=m1;
		motos[1]=m2;
		motos[2]=m3;
		
		m3.setBrand("Suzuki");
		m3.setId("5848LkQ");
		m3.setModel("GS500");
		m3.setCc(500);
		m3.setCv(68);
		m3.setColour("blue");
		m3.setSpeed(130);
		
		
		Helper.acelerate(m1, 20);
		Helper.acelerate(motos[1], 65);
		
		
		for(Moto m:motos) {
			System.out.println(m);
		}
		
		Helper.brake(m2);
		
		System.out.println("new speed: "+m2.getSpeed());
	}

}

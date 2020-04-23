package Model;

public class Moto {
	private String id;
	private String brand;
	private String model;
	private int cc;
	private int cv;
	private int speed;
	private String colour;
	
	public Moto() {
		
	}

	public Moto(String id, String brand, String model, int cc, int cv, int speed, String colour) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.cc = cc;
		this.cv = cv;
		this.speed = speed;
		this.colour = colour;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	

	@Override
	public String toString() {
		return "Moto [id=" + id + ", brand=" + brand + ", model=" + model + ", cc=" + cc + ", cv=" + cv + ", speed="
				+ speed + ", colour=" + colour + "]";
	}
	
	

	
	
	
}

package _06_minion;

public class Minion {
	
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	String getName() {
		return name;
	}
	
	int getEyes() {
		return eyes;
	}
	
	String getColor() {
		return color;
	}
	
	String getMaster() {
		return master;
	}
	
	void setMaster(String master) {
		this.master = master;
	}
	
	Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

}

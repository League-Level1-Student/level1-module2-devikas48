package _04_tea_maker;

public class TeaMakerRunner {
public static void main(String[] args) {
	
	TeaBag teabag = new TeaBag("Mint");
	System.out.println(teabag.getFlavor());
	
	Kettle kettle = new Kettle();
	kettle.boil();
	
	Cup cup = new Cup();
	
	cup.makeTea(teabag, kettle.getWater());
	
	
	
	
	
	
	
}
}

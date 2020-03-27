package _02_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		
	
	SeaCreature seacreature = new SeaCreature("Spongebob");
	SeaCreature seacreature2 = new SeaCreature("Patrick");
	SeaCreature seacreature3 = new SeaCreature("Squidward");
	seacreature.eat();
	seacreature.laugh();
	seacreature2.getName();
	seacreature3.getName();
	seacreature2.eat();
	seacreature3.eat();
	seacreature2.laugh();
	seacreature3.laugh();
	
	
}
}
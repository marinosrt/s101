package n3exercici1;

public class Motociclisme extends Noticia {
	
	private String team;
	
	public Motociclisme(String head, String team) {
		super(head);
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}
	
	@Override
	public String toString() {
		
		return "La noticia de motociclisme ''" + super.getHead() +
				"'', parla de l'equip " + getTeam() + ". " +
				calculatePunctuation() + calculateNewsPrice();
		
	}
	
	@Override
	public String calculatePunctuation() {
		super.punctuation = 3;
		
		if(team.equalsIgnoreCase("Ferrari") ||
				team.equalsIgnoreCase("Mercedes")) {
			punctuation += 2;
		}
		
		return "Aquesta noticia te " + punctuation + " punts.";
	}
	
	@Override
	public String calculateNewsPrice() {
		super.price = 100;
		
		if(team.equalsIgnoreCase("Honda") ||
				team.equalsIgnoreCase("Yamaha")) {
			price += 50;
		}
		
		return "Aquesta noticia te un preu de " + price + "€.";
	}

}
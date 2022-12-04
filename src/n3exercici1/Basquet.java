package n3exercici1;

public class Basquet extends Noticia {
	
	private String competition;

	private String club;
	
	public Basquet (String head, String competition, String club) {
		super(head);
		this.competition = competition;
		this.club = club;
	}

	public String getCompetition() {
		return competition;
	}

	public String getClub() {
		return club;
	}
	
	@Override
	public String toString() {
		
		return "La noticia de basquet ''" + super.getHead() +
				"'', parla de la competicio " + getCompetition() +
				", del club " + getClub() + ". " +
				calculatePunctuation() + calculateNewsPrice();
		
	}
	
	@Override
	public String calculatePunctuation() {
		super.punctuation = 4;
		
		if(competition.equalsIgnoreCase("Eurolliga")) {
			punctuation += 3;
		}
		
		if(competition.equalsIgnoreCase("ACB")) {
			punctuation += 2;
		}
		
		if (club.equalsIgnoreCase("Barca") || club.equalsIgnoreCase("Madrid")) {
			price += 75;
		}
		
		return "Aquesta noticia te " + punctuation + " punts.";
	}
	
	@Override
	public String calculateNewsPrice() {
		super.price = 250;
		
		if(competition.equalsIgnoreCase("Eurolliga")) {
			price += 75;
		}
		
		if (club.equalsIgnoreCase("Barca") || club.equalsIgnoreCase("Madrid")) {
			price += 75;
		}
		
		return "Aquesta noticia te un preu de " + price + "€.";
	}
	
	

}
package n3exercici1;

/*A més, de les notícies de futbol s’ha de saber a quina competició fa referència(String), 
a quin club(String) i a quin jugador(String).*/

public class Futbol extends Noticia{
	
	private String competition;
	private String club;
	private String player;
	
	public Futbol (String head, String competition, String club, String player) {
		super(head);
		this.competition = competition;
		this.club = club;
		this.player = player;
	}

	public String getCompetition() {
		return competition;
	}

	public String getClub() {
		return club;
	}

	public String getPlayer() {
		return player;
	}
	
	@Override
	public String toString() {
		
		return "La noticia de futbol ''" + super.getHead() +
				"'', parla de la lliga " + getCompetition() + 
				", del club " + getClub() + 
				" i del jugador " + getPlayer() + ". " +
				calculatePunctuation() + calculateNewsPrice();
		
	}
	
	@Override
	public String calculatePunctuation() {
		
		super.punctuation = 5;
		
		if(competition.equalsIgnoreCase("Lliga de Campions")) {
			price += 100;
			punctuation += 3;
		}
		
		if (competition.equalsIgnoreCase("Lliga")) {
			punctuation += 2;
		}
		
		if (club.equalsIgnoreCase("Barca") || club.equalsIgnoreCase("Madrid")) {
			price += 100;
			punctuation++;
		}
		
		if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
			price += 50;
			punctuation++;
		}
		
		return "Aquesta noticia te " + punctuation + " punts.";
	}
	
	@Override
	public String calculateNewsPrice() {
		super.price = 300;
		
		if(competition.equalsIgnoreCase("Lliga de Campions")) {
			price += 100;
		}
		
		if (club.equalsIgnoreCase("Barca") || club.equalsIgnoreCase("Madrid")) {
			price += 100;
		}
		
		if (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")) {
			price += 50;
		}
		
		return "Aquesta noticia te un preu de " + price + "€.";
	}

}
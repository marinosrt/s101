package n3exercici1;

import java.util.ArrayList;
import static n3exercici1.Tools.getString;

public class Tenis extends Noticia {
	
	private String competition;
	private ArrayList<String> playersList = new ArrayList<String>();
	
	public Tenis (String head, String competition) {
		super(head);
		this.competition = competition;
		addPlayers();
	}

	public String getCompetition() {
		return competition;
	}

	public void setCompetition(String competition) {
		this.competition = competition;
	}
	
	public void addPlayers() {
		
		String name = "";
		
		while (!name.equalsIgnoreCase("exit")) {
			name = getString("Quins jugadors apareixen? Exit per a sortir.");
			if (!name.equalsIgnoreCase("exit")) {
				playersList.add(name);
			}
		}
		
	}
	
	@Override
	public String toString() {
		
		String llistaNoms = playersList.get(0);
		
		for (int i = 1; i < playersList.size()-1; i++) {
			llistaNoms = llistaNoms + ", " + playersList.get(i);
		}
		
		return "La noticia de tenis ''" + super.getHead() +
				"'', parla de la competicio " + getCompetition() +
				" i dels jugadors " + llistaNoms + ". " +
				calculatePunctuation() + calculateNewsPrice();
		
	}
	
	@Override
	public String calculatePunctuation() {
		super.punctuation = 4;
		
		for (int i = 0; i < playersList.size(); i++) {
			if (playersList.get(i).equalsIgnoreCase("Federer") || 
					playersList.get(i).equalsIgnoreCase("Nadal") ||
					playersList.get(i).equalsIgnoreCase("Djokovic")) {
				punctuation += 100;
			}
		}
		
		return "Aquesta noticia te " + punctuation + " punts.";
	}
	
	@Override
	public String calculateNewsPrice() {
		super.price = 150;
		
		for (int i = 0; i < playersList.size(); i++) {
			if (playersList.get(i).equalsIgnoreCase("Federer") || 
					playersList.get(i).equalsIgnoreCase("Nadal") ||
					playersList.get(i).equalsIgnoreCase("Djokovic")) {
				price += 100;
			}
		}
		
		return "Aquesta noticia te un preu de " + price + "€";
	}
}
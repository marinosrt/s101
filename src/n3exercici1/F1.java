package n3exercici1;

public class F1 extends Noticia {
	
	private String escuderia;
	
	public F1 (String head, String escuderia) {
		super(head);
		this.escuderia = escuderia;
	}

	public String getEscuderia() {
		return escuderia;
	}
	
	@Override
	public String toString() {
		
		return "La noticia de F1 ''" + super.getHead() +
				"'', parla de l'escuderia " + getEscuderia() + ". " +
				calculatePunctuation() + calculateNewsPrice();
		
	}
	
	@Override
	public String calculatePunctuation() {
		super.punctuation = 4;
		
		if(escuderia.equalsIgnoreCase("Ferrari") ||
				escuderia.equalsIgnoreCase("Mercedes")) {
			punctuation += 2;
		}
		
		return "Aquesta noticia te " + punctuation + " punts.";
	}
	
	@Override
	public String calculateNewsPrice() {
		super.price = 100;
		
		if(escuderia.equalsIgnoreCase("Ferrari") ||
				escuderia.equalsIgnoreCase("Mercedes")) {
			price += 50;
		}
		
		return "Aquesta noticia te un preu de " + price + "€.";
	}
	
	

}
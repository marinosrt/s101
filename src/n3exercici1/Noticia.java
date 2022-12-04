package n3exercici1;

//Cada redactor pot treballar en més d’una notícia. 
//Les notícies han de tenir un titular, un text, una puntuació i un preu. 
//En el moment de crear-se, el text ha d’estar buit.


public abstract class Noticia {
	protected String head;
	protected String TEXT = "";
	protected int price = 0;
	protected int punctuation = 0;
	
	public Noticia (String head) {
		this.head = head;
	}

	public String getHead() {
		return head;
	}

	public String getTEXT() {
		return TEXT;
	}

	public void setTEXT(String text) {
		TEXT = text;
	}

	public int getPunctuation() {
		return punctuation;
	}

	public int getPrice() {
		return price;
	}
	
	public abstract String calculateNewsPrice();
	
	public abstract String calculatePunctuation();

	
}
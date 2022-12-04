package n2exercici1;

public class Telefon {
	
	protected String marca;
	protected String model;


	
	public String getMarca () {
		return marca;
	}
	
	public String getModel () {
		return model;
	}
	
	//STATIC pq tots rebran metode TAL QUAL	. si l'hem de modificar serà un public abstract i farem Override a la classe
	public void trucar(String numTelef) {
		System.out.println("Està trucant ");
	}

}

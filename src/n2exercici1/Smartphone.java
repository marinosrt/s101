package n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge{
	
	public Smartphone (String marca, String model) {
		super.marca = marca;
		super.model = model;
	}
	
	@Override
	public void trucar(String numTelef) {
		System.out.println("S'esta trucant al " + numTelef);
	}
	
	public void fotografiar() {
		System.out.println("S'esta fent una foto");
	}
	
	public void alarma() {
		System.out.println("Està sonant l'alarma");
	}
	
	

}

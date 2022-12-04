package n1exercici1;

public class Vent extends Instrument {
	
	public Vent (String name, double price) {
		super(name, price);
	}
	
	static {
		System.out.println("Està tocant un instrument de Vent");
	}
	
	{
		System.out.println("Està tocant un instrument de Vent");
	}
	
	@Override
	public void tocar() {
		System.out.println("Està tocant un instrument de Vent");
	}

}

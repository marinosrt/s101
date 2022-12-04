package n1exercici1;

public class Corda extends Instrument{
	
	public Corda (String name, double price) {
		super(name, price);
	}
	
	static {
		System.out.println("Està tocant un instrument de Corda");
	}
	
	{
		System.out.println("Està tocant un instrument de Corda");
	}
	
	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de Corda");
	}

}

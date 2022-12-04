package n1exercici1;

public class Percussio extends Instrument{
	
	public Percussio (String name, double price) {
		super(name, price);
	}
	
	static {
		System.out.println("Està tocant un instrument de Percussió");
	}
	
	{
		System.out.println("Està tocant un instrument de Percussió");
	}
	
	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de Percussió");
	}

}

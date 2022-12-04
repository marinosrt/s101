package n1exercici1;

public abstract class Instrument {
	
	protected String name;
	protected double price;
	
	public Instrument(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public abstract void tocar();

}

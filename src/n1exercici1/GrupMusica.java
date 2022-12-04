package n1exercici1;

public class GrupMusica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vent vent1 = new Vent("Trompet", 4300);
		Corda corda1 = new Corda ("Arp", 12.300);
		Percussio percu1 = new Percussio("Pandereta", 600);
		
		vent1.tocar();
		corda1.tocar();
		percu1.tocar();
	}

}

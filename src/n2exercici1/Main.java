package n2exercici1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String numTelef;
		
		Smartphone mobil = new Smartphone("Samsung", "A10");
		
		System.out.println("A qui vols trucar?");
		numTelef = sc.nextLine();
		
		mobil.trucar(numTelef);
		mobil.alarma();
		mobil.fotografiar();
	}

}

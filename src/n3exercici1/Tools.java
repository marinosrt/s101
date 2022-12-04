package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;



public class Tools {
	
	
	static String getString(String message){
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextLine();
	}
	
	static int getInt(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextInt();
	}
	
	static int getIndexRedactor(String nomRedactor, ArrayList<Redactor> llistaRedactors) {
		int indexRedactor = -1, i = 0;
		
		while (i < llistaRedactors.size()) {
			if (llistaRedactors.get(i).getName().equalsIgnoreCase(nomRedactor)) {
				indexRedactor = i;
				break;
			}
			i++;
		}
		
		return indexRedactor;
		
	}
	
	static int getIndexNew(int indexRedactor, String nomNoticia, ArrayList<Redactor> llistaRedactors) {
		int indexNoticia = -1, i = 0;
				
		while (i < llistaRedactors.size()) {
			if (llistaRedactors.get(indexRedactor).newsList.get(i).getHead().equalsIgnoreCase(nomNoticia)) {
				indexNoticia = i;
				break;
			}
			i++;
		}
		
		return indexNoticia;
		
	}
	
	
	
}
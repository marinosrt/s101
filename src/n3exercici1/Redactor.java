package n3exercici1;

import java.util.ArrayList;

public class Redactor {
	
	private String name;
	private final String dni;
	public static double SALARY = 1500;
	ArrayList<Noticia> newsList = new ArrayList<Noticia>();
	
	public Redactor (String name, String dni) {
		this.name = name;
		this.dni = dni;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDni() {
		return dni;
	}
	
	public Double getSalary() {
		return SALARY;
	}
	
	public void modifySalary(double newValue) {
		SALARY = newValue;
	}
	
	public String addNews(Noticia noticia1) {
		newsList.add(noticia1);
		
		return "Noticia afegida amb exit";
	}
	
	public void removeNews(int indexNew) {
		newsList.remove(indexNew);
	}
	
	public int getIndexNews(String headNew) {
		
		int indexNew = -1, i = 0;
		
		while (indexNew == -1 || i < newsList.size()){
			if (newsList.get(i).getHead().equalsIgnoreCase(headNew)){
				indexNew = i;
				break;
			}
			i++;
		}
		
		return indexNew;
		
	}

}
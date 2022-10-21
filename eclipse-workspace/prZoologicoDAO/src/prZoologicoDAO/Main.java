package prZoologicoDAO;

public class Main {

	public static void main(String[] args) {
		
		
		
		Animal a= new Animal ("Ardilla","Bosque",01.);
		AnimalDAO.insertAnimal(a);
		AnimalDAO.deleteAnimal();
	}

}

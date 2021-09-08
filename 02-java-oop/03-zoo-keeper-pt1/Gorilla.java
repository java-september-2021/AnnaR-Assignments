

public class Gorilla extends Mammal {	
	public void throwSomething() 
	{ 
		int energy = getEnergy();
		int decreaseUnit = 5;
		
		if ((energy - decreaseUnit) <= 0) {
			System.out.print("The gorilla is out of energy. ");
		}else {	
		energy-= decreaseUnit = 10;		
		System.out.print("The gorilla has thrown something. ");
		System.out.println(" Its energy level is down by 5.");
		setEnergy(energy);
		}	  
	}	
	
	public void eatBananas() 
	{ 
		int energy = getEnergy();
				
		if (energy > 0){ 
			energy+= 10;
			System.out.print("The gorilla is happy its ");
			System.out.println(" energy level is up by 10.");
			setEnergy(energy);
		}
	}	
	
	public void climb() 
	{ 
		int energy = getEnergy();
		int decreaseUnit = 10;
				
		if ((energy - decreaseUnit) <= 0) {
			System.out.print("The gorilla is out of energy. ");
		}else {	
			energy-= decreaseUnit;
			System.out.print("The gorilla has climbed a tree. ");
			System.out.println("Its energy level is down by 10.");
			setEnergy(energy);
		}	       
    }




}// Gorilla
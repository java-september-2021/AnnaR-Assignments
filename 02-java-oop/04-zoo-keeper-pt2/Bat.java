
public class Bat extends Mammal {	
	private int energy = 300;

	/*==============================*/
    // Method - fly()
    /*==============================*/
	public void fly() { 
		int energy = getEnergy();			
		int energyDecrease = 50;
		
		if ((energy - energyDecrease) <= 0) {
			System.out.print("The bat is out of energy. ");
		}else {	
		energy-= energyDecrease;		
		System.out.print("The bat is launching upward in flight....whoosh.... ");
		System.out.println(String.format(" energy level is down by %s", energyDecrease + "."));
		setEnergy(energy);
		}	  
	}//fly	


	/*==============================*/
    // Method - eatHumans()
    /*==============================*/
	public void eatHumans() { 
		int energyIncrease = 25;
		int energy = getEnergy() + energyIncrease;
		System.out.print("Oh well for the poor human...the gorilla is happy its ");
		System.out.println(String.format("energy level is up by %s", energyIncrease + "."));
		setEnergy(energy);
	}//eathumans	


	/*==============================*/
    // Method - attackTown()
    /*==============================*/
	public void attackTown() 
	{ 
		int energy = getEnergy();
		int energyDecrease = 100;
				
		if ((energy - energyDecrease) <= 0) {
			System.out.print("The bat is out of energy. ");
		}else {	
			energy-= energyDecrease;
			System.out.println("The bat is attacking the town.  The town is on fire...and the fire is crackling.... and building are collasping....crash...! ");
			System.out.println("The bat's energy level is down by " + energyDecrease + "." );
			setEnergy(energy);
		}	       
	}//attackTown


	/*========================================*/
    // Methods - getter and setter and display
    /*========================================*/
	public int getEnergy() 
	{ return this.energy; }

	public void setEnergy(int energy) 
	{ this.energy = energy; }

	public void displayEnergy() 
	{ System.out.println("Current energy level: " + this.energy); }

}// Bat
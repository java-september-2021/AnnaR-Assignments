
import java.util.*;

public class Mammal {
	
	private int energyLevel = 100;	
	
	public int getEnergy() 
	{ return energyLevel; }
	
	public void setEnergy(int energy) 
	{ energyLevel = energy; }
	
	public void displayEnergy() 
	{ System.out.println("Current energy level: " + energyLevel); }
}//Mammal



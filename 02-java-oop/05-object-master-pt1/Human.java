
import java.util.*;

public class Human {
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	private String name = " ";
	
	Human (String n){this.name = n;};

public void attack (Human h) {	  
	h.health = h.health - this.strength;	
	System.out.println(this.getName() + " is attacking "+ h.getName());
    }

public String getName () { return name; }

public void displayProperties() {
	String n = String.format("%s", name);   
	System.out.println("\n" + this.getName()  + "'s properties are: ");
	System.out.println("strength: "+ strength);
	System.out.println("stealth: "+ stealth);
	System.out.println("intelligence: "+ intelligence);
	System.out.println("health: "+ health + "\n");	  
	}
}

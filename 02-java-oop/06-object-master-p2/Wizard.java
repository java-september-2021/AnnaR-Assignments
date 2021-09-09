
// ----------  Wizard Class -----------//
public class Wizard extends Human2 {	
    private int health = 50;
    private int intelligence = 8; 
    private String name;
    private static int count = 0;

    //Constructor
    public Wizard (String name){ 
        this.setName(name);  
        count+=1; 
    } 

    /*==============================*/
    // Method - heal()
    /*==============================*/
    public void heal(Human2 h) 
    { 
        int temp = h.getHealth() + this.intelligence; 
        h.setHealth(temp);
        System.out.println (" *** " + this.name + " heals " + h.getName() + " *** "); 
    }

    /*==============================*/
    // Method - fireball()
    /*==============================*/
    public void fireball(Human2 h)  
    {     
        int temp = h.getHealth() - (intelligence * 3);
        h.setHealth(temp); 
        System.out.println (" *** " + this.name + " fireballed " + h.getName() + " *** ");    
    }


    /*==============================*/
    // Method - displayProperties()
    /*==============================*/  
    public void displayProperties() {  
        System.out.println("\n" + this.name + "'s properties are: ");
        System.out.println("intelligence: " + this.intelligence);
        System.out.println("health: "+ this.health + "\n");	  
    }


    // getters and setters
    public String getName(){ return this.name; }
    public int getHealth() { return this.health; }
    public int getIntelligence() { return this.intelligence; }
    public static int getCount() { return count; } 
    
    public void setHealth(int health) { this.health = health; }
    public void setName(String  name) { this.name = name; } 
    public void setIntelligence(int intelligence) {  this.intelligence = intelligence; } 
}//class Wizard



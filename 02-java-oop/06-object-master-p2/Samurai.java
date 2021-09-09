
//----------  Samurai Class -----------//
public class Samurai extends Human2 {
    private int health = 200;
    private String name;
    private static int numOfSamurai = 0; 

    //Constructor
    public Samurai(String name) { 
        this.setName(name);  
        numOfSamurai+=1; 
    } 


    /*==============================*/
    // Method - deathBlow()
    /*==============================*/
    public void deathBlow (Human2 h) {
        h.health = 0;
        h.setHealth(h.health);		 
        if (this.health/2 <= 0)
            { this.health = 0;}
        else
            { this.health = this.health/2; }
        System.out.println (" *** " + this.name + " deathblowed " + h.getName() + " *** "); 
    }//deathBlow


    /*==============================*/
    // Method - meditate()
    /*==============================*/
    public void meditate() {
        this.health = 200; 
        System.out.println (" *** " + this.name + " meditated and heals self." + " *** "); 
    }


    /*==============================*/
    // Method - displayProperties()
    /*==============================*/  
    public void displayProperties() {  
        System.out.println("\n" + this.name + "'s properties are: ");
        System.out.println("health: "+ this.health );	  
        System.out.println("number of samurais: "+ this.getHowMany() + "\n");	
    }


    // getters and setters
    public String getName(){ return name; }    
    public int getHealth() { return health; }   
    public static int getHowMany () { return numOfSamurai; }  

    public void setHealth(int health) { this.health = health; } 
    public void setName(String  name) { this.name = name; }  
}//Samurai
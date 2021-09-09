
//----------  Ninja Class -----------//
public class Ninja extends Human2 {
  private int stealth = 10;
  private int health; 
  private String name = "NinjaPerson";
  private static int count = 0;

  //Constructor
  public Ninja (String name){
    this.health = super.health;
    this.setName(name); 
    count+=1;
  } 


  /*==============================*/
  // Method - steal()
  /*==============================*/
  public void steal (Human2 h){    
    int temp = h.getHealth() - this.getStealth();
    h.setHealth(temp);
    this.health += this.getStealth(); 
    System.out.println (" *** " + this.name + " steals health from " + h.getName() + " *** "); 
  }//steal
  

  /*==============================*/
  // Method - runAway()
  /*==============================*/
  public void runAway (){ 
    this.health = this.health - 10;
    System.out.println (" *** " + this.name + " runs away." + " *** ");   
  }


  /*==============================*/
  // Method - displayProperties()
  /*==============================*/  
  public void displayProperties() {
    System.out.println("\n" + this.name + "'s properties are: ");
    System.out.println("stealth: "+ this.stealth);
    System.out.println("health: "+ this.health + "\n");	  	 
  }


  // getters and setters
  public int getStealth(){ return this.stealth; }   
  public int getHealth() { return this.health; }
  public String getName(){ return this.name; }
  public static int getCount() { return count; } 

  public void setStealth(int stealth) { this.stealth = stealth; }  
  public void setHealth(int health) { this.health = health; }  
  public void setName(String  name) { this.name = name; }  
}//Ninja



public class Human2 {
  protected	int strength = 3;
  protected	int stealth = 3;
  protected	int intelligence = 3;
  protected	int health = 100; 
  protected	String name;	

  //Constructor
  public Human2 () {
  
  }
  public Human2 (int health) {

  }


  /*==============================*/
  // Method - attack()
  /*==============================*/
  public void attack (Human2 h) {	  
    h.health = h.health - this.strength;	
    System.out.println(this.getName() + " is attacking " + h.getName());  
  }
  

  /*==============================*/
  // Method - displayProperties()
  /*==============================*/  
  public void displayProperties() {
    String n = String.format("%s", name);   
    System.out.println("\n" + this.name + "'s properties are: ");
    System.out.println("strength: "+ this.strength);
    System.out.println("stealth: "+ this.stealth);
    System.out.println("intelligence: " + this.intelligence);
    System.out.println("health: "+ this.health + "\n");	  
  }


  // getters and setters
  public void setName(String name)  { this.name = name; }
  public void setHealth(int health) { this.health = health; }
  public void setStealth(int stealth)  { this.stealth = stealth; }
  public void setStrength(int strength){ this.strength = strength; }
  public void setIntelligence(int intelligence ) { this.intelligence = intelligence; }

  public String getName() { return this.name; }
  public int getHealth() { return this.health; }
  public int getStealth() { return this.stealth; }
  public int getStrength() { return this.strength; }
  public int getintelligence() { return this.intelligence; }
}//Human2

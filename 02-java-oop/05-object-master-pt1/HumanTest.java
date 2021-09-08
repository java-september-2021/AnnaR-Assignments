
public class HumanTest {

	public static void main(String[] args) {
		
		Human currentHuman = new Human("Randall");
		Human attackingHuman = new Human("Andrew");
        
		//Randall attacks Andrew
		currentHuman.attack(attackingHuman);
		currentHuman.displayProperties();
		attackingHuman.displayProperties();
		
		currentHuman.attack(attackingHuman);
		currentHuman.attack(attackingHuman);
		currentHuman.attack(attackingHuman);

		//Andrew attacks Randall  
		attackingHuman.attack(currentHuman);
		attackingHuman.attack(currentHuman);
		
		currentHuman.displayProperties();
		attackingHuman.displayProperties();
	}

}

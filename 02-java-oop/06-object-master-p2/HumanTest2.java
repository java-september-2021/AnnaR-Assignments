public class HumanTest2 {

	public static void main(String[] args) {
	
		Ninja nin = new Ninja ("NinjaFighter");
		Wizard wiz = new Wizard ("WizardFighter");
		Samurai sam =  new Samurai ("SamuraiFighter");
		Samurai sam2 = new Samurai ("SamuraiFighter2");

		System.out.println ("Initial stats:");	
		nin.displayProperties();
		wiz.displayProperties();
		sam.displayProperties();
		
		//-----------------------------	
		System.out.println ("");

		nin.steal(sam);		
		nin.displayProperties();
		wiz.displayProperties();
		sam.displayProperties();	
		
        //-----------------------------		
		System.out.println ("");

		nin.runAway();
		nin.displayProperties();
		wiz.displayProperties();
		sam.displayProperties();;
		
		//-----------------------------	
		System.out.println ("");

		wiz.heal(wiz);
		nin.displayProperties();
		wiz.displayProperties();
		sam.displayProperties();
		
		//-----------------------------	
		System.out.println ("");

		wiz.heal(nin);
		nin.displayProperties();
		wiz.displayProperties();
		sam.displayProperties();	
		
		//-----------------------------		
		System.out.println ("");

		nin.steal(sam);		
		nin.displayProperties();
		wiz.displayProperties();
		sam.displayProperties();


		//-----------------------------		
		System.out.println ("");

		sam.deathBlow(nin);
		nin.displayProperties();
		wiz.displayProperties();
		sam.displayProperties();

		//-----------------------------	
		System.out.println ("");

		sam.meditate();
		nin.displayProperties();
		wiz.displayProperties();
		sam.displayProperties();
		
	}//main

}//class

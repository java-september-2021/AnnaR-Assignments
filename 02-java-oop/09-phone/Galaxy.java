
public class Galaxy extends Phone implements Ringable {

    //Constructor
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) 
    {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return  "   Galaxy s9 phone is ringing.";   
    }


    @Override
    public String unlock() {
        return  "   Galaxy s9 phone is unlocked."; 
    }

    @Override
    public void displayInfo() { 
        System.out.println("\n" + "Galaxy information: ");
        System.out.println(String.format("   Version Number: %s", this.getVersionNumber()));
        System.out.println(String.format("   Battery Percentage: %s", this.getBatteryPercentage()));
        System.out.println(String.format("   Carrier Data: %s", this.getCarrier()));
        System.out.println(String.format("   Current Ring Tone: %s", this.getRingTone()));       
    }//displayInfo


}

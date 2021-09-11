
public class IPhone extends Phone implements Ringable {

    //Constructor
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return  "   IPhone is ringing."; 
    }

    @Override
    public String unlock() {
        return  "   IPhone is unlocked."; 
    }

    
    @Override
    public void displayInfo() { 
        System.out.println("\n" + "IPhone information: ");
        System.out.println("   Version Number: " + this.getVersionNumber());
        System.out.println(String.format("   Battery Percentage: %s", this.getBatteryPercentage()));
        System.out.println(String.format("   Carrier Data: %s", this.getCarrier()));
        System.out.println(String.format("   Current Ring Tone: %s", this.getRingTone()));       
    }//displayInfo



}//IPhone


public abstract class Phone{
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    public String getVersionNumber(){
        return this.versionNumber;
    }//getVersionNumber

    public int getBatteryPercentage(){
        return this.batteryPercentage;
    }//getBatteryPercentage


    public String getCarrier(){
        return this.carrier;
    }//getCarrier


    public String getRingTone(){
        return this.ringTone;
    }//getRingTone
    
    public abstract void displayInfo();


}//Phone
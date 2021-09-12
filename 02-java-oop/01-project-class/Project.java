
import java.lang.*;
import java.util.*;

public class Project  {
    private String name;
    private String description;
    private double initialCost = 0;
    private String pitchData = "default pitch";
    
    // Constructors
    public Project() {
        name =  "default name";
        description = "default description";
    }
    
    public Project(String name) {   
        this.name = name;
    }
    
    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    /*==============================*/
    // Method - elevatorPitch
    /*==============================*/
    public String elevatorPitch (String name, double cost, String description){
        this.pitchData =  String.format(name + " (" + cost + "): " + description);
        return  pitchData;   
    }

    /*==============================*/
    // Methods - getters and setters
    /*==============================*/
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getInitialCost() { return initialCost; }
    public String getPitchData() { return pitchData; }

    public void setName(String name) { this.name = name;}
    public void setDescription(String description) { this.description = description; } 
    public void setInitialCost(double initialCost) { this.initialCost = initialCost; }
    public void setPitchData(String pitchData) {  this.pitchData = pitchData; }

    /*================================*/
    // Methods - Display Project Data
    /*================================*/
    public void displayProjectInformation() { 
        System.out.println("\n" + "Project Data: ");
        System.out.println(String.format("   Name: %s", this.name));
        System.out.println(String.format("   Description: %s", this.description));
        System.out.println(String.format("   Initial cost: %.2f", this.initialCost)); 
        System.out.println(String.format("   Pitch information: %s", this.pitchData)); 
    }//displayProjectInformation,


    /*=================================*/
    // Methods - Display Pitch Summary
    /*=================================*/
    public void displayPitchSummary() { 
        System.out.println("\n" + "Elevator Pitch Data Summary: " + this.pitchData);
    }//displayProjectInformation,


}// class 



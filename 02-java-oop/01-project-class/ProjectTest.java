import java.util.*;

public class ProjectTest {
    public static void main(String[] args) {

    /*==============================*/
    // First Project
    /*==============================*/   
    Project Prj1 = new Project ();

    //Adding pitch information using getters and setters
    System.out.println("\n" + "_____________");
    System.out.println("\n" + "First Project");
    System.out.println("_____________");

    Prj1.setName("Mercury Project");
    
    Prj1.setDescription("10 month initiative to build up the new Broker Booking system."); 
    Prj1.setInitialCost(14000);
    
    String pitchInfo = Prj1.elevatorPitch( Prj1.getName(), Prj1.getInitialCost() , Prj1.getDescription());
    System.out.println("\n" + "Pitch Data is : " + pitchInfo);
    Prj1.displayProjectInformation();


    /*==============================*/
    // Second Project
    /*==============================*/ 
    Project Prj2 = new Project("Koala Printer Project");

    //Name already provide now adding cost and description 
    System.out.println("\n" + "_________________");    
    System.out.println("\n" + "Second Project");
    System.out.println("_________________");

    //Using setters for description and cost
    Prj2.setDescription("New print scanner project that intergrates the graphing system with the Underwriting Analysis interface."); 
    Prj2.setInitialCost(97000);
    String prjName = Prj2.getName();  
    Prj2.setPitchData(String.format( " %s (%.2f): %s", prjName, Prj2.getInitialCost() , Prj2.getDescription()));
    Prj2.displayPitchSummary();
    Prj2.displayProjectInformation();


    /*==============================*/
    // Third Project
    /*==============================*/ 
    Project Prj3 = new Project("Fall Ratings Project ", "System upgrade to reflect new commission ratings.", 27500);

    //All project information added during Prj3 creation and add pitch data afterwards
    System.out.println("\n" + "_________________");  
    System.out.println("\n" + "Third Project"); 
    System.out.println("_________________");
    prjName = Prj3.getName();
    Prj3.setPitchData(String.format( " %s (%.2f): %s", prjName, Prj3.getInitialCost() , Prj3.getDescription()));
    Prj3.displayPitchSummary();
    Prj3.displayProjectInformation();
  
    /*=====================================================*/
    // Four  Project - This only displays default values
    /*====================================================*/   
    Project Prj4 = new Project ();

    System.out.println("\n" + "_________________");  
    System.out.println("\n" + "Fourth Project"); 
    System.out.println("_________________");
    Prj4.displayPitchSummary();
    Prj4.displayProjectInformation();


    /*=========================================================*/
    // Bonus: ArrayList of Projects -- This portion was not completed
    /*=========================================================*/  
    // Project Prj5 = new Project("5th Project ", "System upgrade to 5th Project.", 20500);
    // Project Prj6 = new Project("6th Ratings Project ", "System upgrade to 6th Project.", 40000);
    // Project Prj7 = new Project("7th Ratings Project ", "System upgrade to 7th Project.", 70500);

    
    // ArrayList<Project> project = new ArrayList<Project>();
    //porfolio.proj.add( new Project("5th RatingsProject ", "System upgrade for 5th Project.", 20500));    
    // project.add(new Project("6th Ratings Project ", "System upgrade for 6th Project.", 40000));  
    // project.add(new Project("7th Ratings Project ", "System upgrade for 7th Project.", 70500)); 

    // Portfolio porfolio = new Portfolio ();
    //Portfolio.setProject("6th Ratings Project ", "System upgrade for 6th Project.", 40000);

      //portfolio.setProject(project);
    //  System.out.println(porfolio.proj);
    // for (Project p : porfolio.proj) {
    //         System.out.println(proj);
    //     }

  //ystem.out.println(porfolio.proj.getName()); 
    
  //  porfolio.showPortfolio();



  }// main 
}// ProjectTest


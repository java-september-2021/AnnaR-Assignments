
import java.lang.*;
import java.util.*;
import java.util.ArrayList;

public class Portfolio {
    public String projName;
    public String projDescription;
    public double cost;
    public ArrayList<Project> proj = new ArrayList<Project>() ;
    
    // Constructors
    public Portfolio( ) {
        
    }


    /*=========================================================*/
    //Bonus: Class Portfolio -- This portion was not completed
    /*=========================================================*/
    public Portfolio(String name, String description, double cost ) {
        this.projName = name;
        this.projDescription = description;
        this.cost = cost;
       // proj.add(new Project (this.projName ,  this.projDescription, this.cost));
    
    }
    

    public void getPortfolioCost(ArrayList<Project> projects ){


    }

    public void setProject(String name, String description, double cost ){
        this.projName = name;
        this.projDescription = description;
        this.cost = cost;

        this.proj.add(this.projName, this.projDescription, this.cost);

    }



    public void showPortfolio (){
    // for (Project p : proj) {
    //         System.out.println(p.displayPitchSummary());
        // }


        for (int i = 0; i < proj.size(); i++){
            System.out.println(proj.get(i));
        }
    }

}// class Portfolio



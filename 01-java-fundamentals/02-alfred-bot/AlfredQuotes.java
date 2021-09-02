import java.util.*;
import java.time.*;
import java.time.format.*;

public class AlfredQuotes {

    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?";
    }//basicGreeting


    public String guestGreeting(String name, String dayPeriod){
        // System.out.printf("%s ", dayPeriod);
        // System.out.printf("%s. Lovely to see you.%n", name );
        String greeting = String.format("I hope you have a pleasant " + dayPeriod.toLowerCase() + " " + name + ".");
        return greeting;        
    }//guestGreeting


    public String dateAnnouncement() {
        LocalDateTime myDateObj = LocalDateTime.now();  
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");     
        String formattedDate = myDateObj.format(myFormatObj); 
        String dateResponse =  String.format("Hello, today is " + formattedDate + ".");
        return dateResponse;
    }//dateAnnouncement


    public String respondBeforeAlexis(String conversation){
        String response = null;        
        int start = conversation.indexOf("A");
        
        if (start >-1){
            String subStrg = conversation.substring(start,start+6);
            if (subStrg.equalsIgnoreCase("Alexis")){ 
                response = "Right away, sir. She certainly isn't sophisticated enough for that.";
            }
            if (subStrg.equalsIgnoreCase("Alfred")){ 
                response = "At your service. As you wish, naturally.";
            }
        }
        else {
                response = "Right. And with that I shall retire.";
        }
        return response;        
    }//respondBeforeAlexis





}//class
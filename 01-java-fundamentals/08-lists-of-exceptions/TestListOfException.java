import java.util.*;
import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;

public class TestListOfException{
    public static void main(String[] args){
        
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        
        try{
            for(int i = 0; i <= myList.size(); i++) {
                Integer castedValue = (Integer) myList.get(i);
            }//for
            System.out.println("myList is: "+ myList);
        }//try

        catch (Exception e) {
            System.out.println("The execption is: \n"+e);      
        }//catch

         System.out.println("\n <*****   This is after try/catch block. *****>");

    }//main
}//class

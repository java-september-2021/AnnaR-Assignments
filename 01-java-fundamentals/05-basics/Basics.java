import java.util.*;
import java.time.*;
import java.time.format.*;
import java.lang.*;
import java.util.ArrayList;


public class Basics {

    /*-----------------------------------------*/
    /*----------  PrintOneUpTo255  ------------*/
    public void PrintOneUpTo255(int number){     
        int max = number;    
        int[] arr = new int[max];
        System.out.println( "Executing method PrintOneUpTo255()" );
        for(int i = 0; i < max; i++) {       
            arr [i] = i+1 ;
            System.out.print(arr[i] + "  " ); //print the array element
        }//for
        System.out.println( " \n\n" );
    }// PrintOneUpTo255


    /*---------------------------------------------*/
    /*-------  PrintOddNumbersOneUpTo255  ---------*/
    public void PrintOddNumbersOneUpTo255(int number){     
        int max = number;    
        int[] arr = new int[max];
        System.out.println( "Executing method PrintOddNumbersFromOneTo255()" );
        for(int i = 0; i < max; i++) {       
            arr [i] = i+1 ;

            if (arr[i]%2 != 0)
            { System.out.print(arr[i] + "  " ); }
        }//for
        System.out.println( " \n\n" );
    }// PrintOddNumbersOneUpTo255


    /*---------------------------------------------*/
    /*----------  PrintSumZeroUpTo255  ------------*/
    public int PrintSumZeroUpTo255(int number){     
        int max = number; 
        int sum = 0;

        System.out.println( "Executing method PrintSumZeroUpTo255()" );
        for(int i = 0; i < max; i++) {       
            sum = sum + i;
            //System.out.println("New number: "+ i + " Sum: " + sum ); 
        }//for
        return sum;
    }// PrintSumZeroUpTo255


    /*---------------------------------------------*/
    /*-------------  arrayIteration  --------------*/
    public void arrayIteration(int[] arr){     
        System.out.println( "Executing method arrayIteration()" );
        for (int i : arr ){
            System.out.print(i + "  "); 
        }
        System.out.println( "\n \n" );
    }// arrayIteration


    /*---------------------------------------------*/
    /*----------------  findMax  ------------------*/
    public void findMax(int[] arr){   
        int max = 0;  
        System.out.println( "Executing method findMax()" );
        for (int i : arr ){
            if (i  > max) 
            { max = i; } 
            System.out.print( i + "  ");
        }//for      
        System.out.println("max is: " + max + "  \n"); 
    }// findMax


    /*---------------------------------------------*/
    /*----------------  getAvg  -------------------*/
    public void getAvg(int[] arr){   
        int avg, sum = 0;  

        System.out.println( "Executing method getAvg()" );
        for(int i : arr){ 
            sum = sum + i;
        }//for
            
        avg = sum/arr.length;
        System.out.println("avg is: " + avg + "\n"); 
    }// getAvg


    /*---------------------------------------------*/
    /*-------  oddNumbersArrayUpTo255  ------------*/
    public void oddNumbersArrayUpTo255(int number){     
        int max = number + 1;    
        int[] arr = new int[max];

        System.out.println( "Executing method oddNumbersArrayUpTo255()" );
        for(int i = 0; i < max; i++) {              
            if (i%2 != 0) {
                arr [i] = i;
                System.out.print(arr[i] + "  " ); }
        }//for
        System.out.println( " " );
        System.out.println( " " );
    }// oddNumbersArrayUpTo255


    /*---------------------------------------------*/
    /*------  numOfArrayValuesGreaterThanY  -------*/
    public void numOfArrayValuesGreaterThanY(int[] arr, int Y){     
        int count = 0;      

        System.out.println( "Executing method numOfArrayValuesGreaterThanY()" );
        System.out.println( "Y is: " + Y );
        System.out.print( "Array: " );
        for(int i : arr) {              
            if (i > Y) 
                { count ++; }  
                System.out.print(i + "  ");       
        }//for

        System.out.println( "\nNumber of elements greater than " + Y + " are: " + count );
        System.out.println( " " );
    }// numOfArrayValuesGreaterThanY


    /*---------------------------------------------*/
    /*----------  squareTheValues  ----------------*/
    public void squareTheValues(int[] arr){    

        System.out.println( "Executing method squareTheValues()" );
        System.out.print( "Array: " );
        for(int i = 0; i < arr.length; i++){ 
            arr[i] = arr[i] * arr[i];
            System.out.print(arr[i] + "  " ); 
        }//for
        System.out.println( "\n" );
    }// squareTheValues


    /*----------------------------------------------*/
    /*----------  eliminateNegNumbers  -------------*/
    public void eliminateNegNumbers(int[] arr){       
        System.out.println( "Executing method eliminateNegNumbers()" );
        System.out.print( "Array: " );
        for(int i : arr) {              
            if (i < 0) 
            {  i = 0; }
            System.out.print(i + "  " ); 
        }//for
        System.out.println( "\n" );
    }// eliminateNegNumbers


    /*---------------------------------------------*/
    /*----------  findMaxMinAvg  ------------------*/
    public void findMaxMinAvg(int[] arr){   
        int min = 1000, max = 0, sum = 0, avg; 
        ArrayList<Integer> arrValues = new ArrayList<Integer>(); 
        System.out.println( "Executing method findMaxMinAvg()" );
        for(int i : arr) { 
            sum = sum + i;
            
            if ( i > max) 
            { max = i; }   

            if ( i < min) 
            { min = i; }              
        }//for

        avg = sum/arr.length;
        arrValues.add(max);
        arrValues.add(min);
        arrValues.add(avg);
        System.out.println("max is: " + max); 
        System.out.println("min is: " + min);
        System.out.println("avg is: " + avg);
        System.out.println("New Array values are: " + arrValues);  
        System.out.println( " " );
    }// findMaxMinAvg


    /*---------------------------------------------*/
    /*-----------  arrayValuesShift  --------------*/
    public void arrayValuesShift(int[] arr){       
        System.out.println( "Executing method arrayValuesShift()" );
        System.out.print( "Array: " );
        for(int i = 0; i < arr.length; i++) {  
            if ((i+1) < arr.length){            
                arr[i] = arr[i+1];
                System.out.print(arr[i] + "  " ); 
            }
        }//for

        arr[arr.length-1] = 0;
        System.out.print(arr[arr.length-1]  + "  \n" ); 
    }// arrayValuesShift
}// class Basics


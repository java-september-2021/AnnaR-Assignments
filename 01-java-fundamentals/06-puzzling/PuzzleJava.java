import java.util.*;
//import java.util.Random;
import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;

public class PuzzleJava {

    /*---------------------------------------------*/
    /*----------------  randomTen  ----------------*/
    public ArrayList<Integer> randomTen (){

        int size = 11;
        int num = (int)(Math.random()*size);
        ArrayList<Integer> rand = new ArrayList<Integer>();

        for (int i = 0; i < size; i++){
            num = (int)(Math.random()*size);
            rand.add(num);
        }
        
        return rand;      
    }//randomTen


    /*---------------------------------------------*/
    /*-------------  getRandomLetter  -------------*/
    public char getRandomLetter (){
        Random random = new Random();
        ArrayList<Character> letters = new ArrayList<Character>();

        for (char ch = 'a'; ch <= 'z'; ++ch){
            letters.add(ch);
        }

        return letters.get(random.nextInt(26));       
    }//getRandomLetter


    /*---------------------------------------------*/
    /*------------  generatePassword  -------------*/
    public String generatePassword (){
        int size = 7;
        char ch = ' ';
        Random random = new Random();
        String password =" ";
        char singleChar = getRandomLetter();

        for (int i = 0; i <= size; i++){
            ch = getRandomLetter();
            password = password + ch;
        }
        return password.trim();      
    }//generatePassword


    /*---------------------------------------------*/
    /*------------  getNewPasswordSet  ------------*/
    public void getNewPasswordSet (int randomLength){
        int wordSize = 8;
        Random random = new Random(); //Used to extract a random character from the 'letters' array.
        ArrayList<Character>   letters = new ArrayList<Character>();//This array holds the alphabet a-z.
        ArrayList<String> arrayOfWords = new ArrayList<String>();   //This array hold a random # of words.
        String singleWord = " ";     //This strings holds one word at a time, each is 8 characters long.
        char singleChar = ' '; 

        //Create an array of alphabets
        for (char ch = 'a'; ch <= 'z'; ++ch){
            letters.add(ch);
        }
        
        //Build random 8 characters word.
        for (int i = 0; i < randomLength; i++){
            //Build a single word.
            for (int j = 0; j < wordSize; j++){
                singleChar = letters.get(random.nextInt(26));
                singleWord = singleWord + singleChar;
            } 

            //Add the word to the array.
            arrayOfWords.add(singleWord.trim()); 

            //reset the word string.
            singleWord = " ";        
        }//for

        System.out.println("The array contains " + arrayOfWords.size() + " random words and each are 8 characters long. \n");
        System.out.println("List of words: " + arrayOfWords + "\n");     
    }//getNewPasswordSet

    /*---------------------------------------------*/
    /*------------  shuffleArray  -----------------*/
    public void shuffleArray (ArrayList<Integer> randArray){
        int max = 3;
        String[] interation = {"first", "second", "third"};
        System.out.println("Inside of shuffleArray()");

        for (int i = 0; i < max; i++){       
            Collections.shuffle(randArray);
            System.out.println("Results after shuffling the array the " + interation[i] + " time: " + randArray);
        }//for
    }//shuffleArray

    public void printAsterisks(int count){
            for (int i = 0; i < count; i++){       
                System.out.print("*" );
            }//for
            System.out.print("\n");

    }
}//PuzzleJava
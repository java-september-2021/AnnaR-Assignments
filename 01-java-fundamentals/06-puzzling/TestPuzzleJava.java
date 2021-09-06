import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class TestPuzzleJava{
    public static void main(String[] args){
        PuzzleJava pj = new PuzzleJava();

        // /*---------------------------------------------*/
        // /*----------------  randomTen  ----------------*/
        pj.printAsterisks(40);
        System.out.println("** Puzzling assignment's: randomTen() **");
        pj.printAsterisks(40);

        ArrayList<Integer> results = new ArrayList<Integer>();
        results = pj.randomTen();
        System.out.println("\n results array is: " + results + "\n \n");
        

        // /*---------------------------------------------*/
        // /*-------------  getRandomLetter  -------------*/
        pj.printAsterisks(46);
        System.out.println("** Puzzling assignment's: getRandomLetter() **");
        pj.printAsterisks(46);

        char singleChar = pj.getRandomLetter();
        System.out.println("\n singleChar is: " + singleChar + "\n \n");


        /*---------------------------------------------*/
        /*------------  generatePassword  -------------*/
        pj.printAsterisks(47);
        System.out.println("** Puzzling assignment's: generatePassword() **");
        pj.printAsterisks(47);

        String newPassword = pj.generatePassword();
        System.out.println("\n" + "newPassword is: " + newPassword);
        System.out.println("newPassword size is: " + newPassword.length() + "\n \n");


        /*---------------------------------------------*/
        /*------------  getNewPasswordSet  ------------*/
        pj.printAsterisks(48);
        System.out.println("** Puzzling assignment's: getNewPasswordSet() **");
        pj.printAsterisks(48);

        int max = 20;
        int min = 1;
        int randomLength =  (int)(Math.random()*(max - min)) + min;
        pj.getNewPasswordSet(randomLength);
        System.out.println("\n");


        /*---------------------------------------------*/
        /*------------  shuffleArray  -----------------*/
        PuzzleJava generator = new PuzzleJava();
        int size = 11;
        pj.printAsterisks(47);
        System.out.println("** Puzzling assignment's: Sensei Bonus       **");
        pj.printAsterisks(47);

        ArrayList<Integer>  randomRolls = generator.randomTen();
        ArrayList<Integer> randomArray = new ArrayList<Integer>();//Hold all random numbers.

        for (int i = 0; i < size; i++){
            randomRolls = generator.randomTen(); //Generate random number between 1 and 10.
            randomArray.add(randomRolls.get(0)); //Add to randomeArray
        }
        System.out.println("\n" + "Random array before shuffling: " + randomArray + "\n \n");
        generator.shuffleArray (randomArray);
}//main


}//class


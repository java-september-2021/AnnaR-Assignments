public class FizzBuzzJava {
    public void fizzBuzz(int number) { 
	if(number % 15 == 0) 
        {  System.out.println("FizzBuzz"); }
    else if(number % 3 == 0) 
        { System.out.println("Fizz");}
    else if(number % 5 == 0) 
        { System.out.println("Buzz"); }
    else 
        { System.out.println("Not divisible by 3 or 5"); }
    }
}//class
public class TestFizzBuzz {
    public static void main (String[] args){
        FizzBuzzJava fb = new FizzBuzzJava();
        fb.fizzBuzz(15);
        int interation = 20; 

        for(int i = 0; i <= interation; i++) {
            if (i < 10) 
                {System.out.print("num is  " + i + ":  "); }
            else 
                {System.out.print("num is " + i + ":  ");}
            fb.fizzBuzz(i);
        }//for

       // System.out.println("Hello World!"):
    }
}
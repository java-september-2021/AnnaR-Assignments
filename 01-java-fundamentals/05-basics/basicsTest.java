public class basicsTest{

    public static void main(String[] args){
        Basics Bj = new Basics();
        int count = 255;

        /*---------------------------------------------*/
        /*--------  PrintOddNumbersOneUpTo255  --------*/            
        Bj.PrintOneUpTo255 (count);


        /*---------------------------------------------*/
        /*--------  PrintOddNumbersOneUpTo255  --------*/
        Bj.PrintOddNumbersOneUpTo255 (count);


        /*---------------------------------------------*/
        /*--------- PrintSumZeroUpTo255   -------------*/
        int results = Bj.PrintSumZeroUpTo255 (count); 


        //arr is used in the next two methods
        int[] arr = new int[]{1,3,5,32,7,9,13,34,2,22};


        /*---------------------------------------------*/
        /*-----------  arrayIteration  ----------------*/
        Bj.arrayIteration(arr);


        /*---------------------------------------------*/
        /*---------------  findMax  -------------------*/
        Bj.findMax(arr);


        /*---------------------------------------------*/
        /*---------------- getAvg  --------------------*/            
        Bj.getAvg(arr);


        /*---------------------------------------------*/
        /*-------  oddNumbersArrayUpTo255  ------------*/
        Bj.oddNumbersArrayUpTo255 (count);


        /*---------------------------------------------*/
        /*-------  numOfArrayValuesGreaterThanY  ------*/
        int Y = 8;    
        Bj.numOfArrayValuesGreaterThanY(arr, Y);


        //arr2 is used in the next two methods
        int[] arr2 = new int[]{-7, 1,3,5,32,-100, -1, 7,9,13};

        /*---------------------------------------------*/
        /*----------  squareTheValues  ----------------*/    
        Bj.squareTheValues(arr2);


        /*---------------------------------------------*/
        /*----------  eliminateNegNumbers  ------------*/
        Bj.eliminateNegNumbers(arr2);


        //arr3 is used in the next two methods
        int[] arr3 = new int[]{28,3,24,5,32,7,9,1,13,4,17};

        /*---------------------------------------------*/
        /*----------  findMaxMinAvg  ------------------*/           
        Bj.findMaxMinAvg(arr3);


        /*---------------------------------------------*/
        /*----------  arrayValuesShift  ----------------*/
        Bj.arrayValuesShift(arr3);
    }//main
}//class


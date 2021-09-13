
import java.math.*;

public class Calculator implements java.io.Serializable {
	
	private double operandOne = 10.5;
	private double operandTwo = 5.2;
	private double results;
	private String operator;	
	public Calculator () {}

    
    /*==============================*/
    // Method - performOperation()
    /*==============================*/	
	public double performOperation() {      
		switch (operator) {
		case "+":
				results = getOperandOne() + getOperandTwo();
				break;
		case "-":
				if (getOperandOne() >= getOperandTwo())
					{results = getOperandOne() - getOperandTwo();}
					
				if (getOperandTwo() >= getOperandOne()) 
					{results = getOperandTwo() - getOperandOne();}
				break;
		}//performOperation
		
		return results;
	}//performOperation


    /*==============================*/
    // Methods - getters and setters
    /*==============================*/
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}	
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public double getOperandOne() {
		return operandOne;
	}	
	public double getOperandTwo() {
		return operandTwo;
	}	
	public String getOperator() {
		return operator;
	}
	public double  getResults() {
		return results;
	}	


	public void displayResults() {
		if ( getOperator().equals("-") ){
			if ((getOperandOne() >= getOperandTwo()) && getOperator().equals('-')){
				System.out.println ("Expression: " + getOperandOne() + " " +getOperator() + " " + getOperandTwo() );
				System.out.println ("Results:    " + results);
			}else{
				System.out.println ("Expression: " + getOperandTwo() + " " + getOperator() + " " + getOperandOne() );
				System.out.println ("Results:    " + getResults());
			}
		}
		if ( getOperator().equals("+") ){
			System.out.println ("Expression: " + getOperandOne() + " " +getOperator() + " " + getOperandTwo() );
			System.out.println ("Results:    " + results);
		}

	}//displayResults
	
}//Calculator

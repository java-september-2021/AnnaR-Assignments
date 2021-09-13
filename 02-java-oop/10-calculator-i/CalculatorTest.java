

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setOperandOne(37.5);
		calc.setOperator("+");
		calc.setOperandTwo(40.2);
		calc.performOperation();
		calc.displayResults();

		System.out.println ( " " );
		calc.setOperandOne(20.0);
		calc.setOperator("-");
		calc.setOperandTwo(75.0);
		calc.performOperation();
		calc.displayResults();





	}

}
//setOperandOne(10.5)
//
//setOperation("+")
//
//setOperandTwo(5.2)
//
//performOperation()
//
//getResults()
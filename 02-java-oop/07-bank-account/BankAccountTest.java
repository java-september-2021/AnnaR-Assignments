public class BankAccountTest {

	public static void main(String[] args) {	
		BankAccount bAcct = new BankAccount ();	
        BankAccount bAcct2 = new BankAccount ();


        //--------------------------
        //First Bank Account
        //--------------------------

        //Initail account balances.	
		bAcct.displayBalances();

        //Validates message with empty accounts.
        bAcct.acctWithdrawal(100,"savings");
        bAcct.acctWithdrawal(100,"checking");	

        //Validates balances after deposits.
        bAcct.acctDeposit(1570,"savings");
        bAcct.acctDeposit(985,"checking");
        bAcct.displayBalances();

        //Validates balances after withdrawals.
        bAcct.acctWithdrawal(200,"savings");
        bAcct.acctWithdrawal(130,"checking");
        bAcct.displayBalances();

        //Display bank's total account amount.
        bAcct.displayTotalAssets();

        //--------------------------
        //Second Bank Account
        //--------------------------

         //Validates balances after deposits.
        bAcct2.acctDeposit(1570,"savings");
        bAcct2.acctDeposit(985,"checking");
        bAcct2.displayBalances();

        //Validates balances after withdrawals.
        bAcct2.acctWithdrawal(200,"savings");
        bAcct2.acctWithdrawal(130,"checking");
        bAcct2.displayBalances();

        //Display bank's data.
        bAcct2.displayTotalAssets();  


        //--------------------------
        //Get Account Number Calls
        //--------------------------
        System.out.println(" ");
        System.out.println("Get first  account number: " + bAcct.getAcctNumber());
        System.out.println("Get second account number: " + bAcct2.getAcctNumber());

	}//main
}//class

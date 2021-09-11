
import java.util.Random;

public class BankAccount {
	private String accountType;
	protected static int numOfAccts = 0;
	protected static double totalMoney = 0;;
	private String acctNumber;
	private double checkingBalance;
	private double savingsBalance;
	
	public BankAccount() {
		numOfAccts += 1;
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		this.acctNumber = BankAccount.createAcctNumber();
		System.out.println(String.format("\n" + "Account %s has been created.", this.acctNumber + "\n"));
	}
	


	/*==============================*/
	// Method - createAcctNumber()
	/*==============================*/
	private static String createAcctNumber() {
		String acctStrg = " ";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			acctStrg += r.nextInt(10);
		}
		return acctStrg.trim();
	}


	/*==============================*/
	// Method - acctDeposit()
	/*==============================*/	
	public void acctDeposit(double depositAmt, String acctType) {
		System.out.println(String.format("\n" + "Account %s - Deposit Activities:", this.acctNumber));
		switch (acctType){
			case "savings":
				System.out.println(String.format("   Saving Deposit Amount: %.2f", depositAmt));
				this.savingsBalance += depositAmt;
				break;
			case "checking":
				System.out.println(String.format("   Checking Deposit Amount: %.2f", depositAmt));
				this.checkingBalance += depositAmt;
				break;
			default: System.out.println(" ");
		}//switch

		totalMoney += depositAmt;
	}//acctDeposit

	/*==============================*/
	// Method - acctWithdrawal()
	/*==============================*/
	public void acctWithdrawal(double withdrawAmount, String acctType) {
		System.out.println(String.format("\n" + "Account %s - Withdraw Activities:", this.acctNumber));
		switch (acctType){
			case "savings":
				if(this.savingsBalance - withdrawAmount >= 0) {
					System.out.println(String.format("   Saving withdraw Amount: %.2f", withdrawAmount));
					this.savingsBalance -= withdrawAmount;
					totalMoney -= withdrawAmount;
				}else{
					System.out.println(String.format("   Saving withdraw request denied due to insuffient funds.  Please contact a bank representative."));
				}
				break;
			case "checking":
				if(this.checkingBalance - withdrawAmount >= 0) {
					System.out.println(String.format("   Checking withdraw Amount: %.2f", withdrawAmount));
					this.checkingBalance -= withdrawAmount;
					totalMoney -= withdrawAmount;
				}else{
					System.out.println(String.format("   Checking withdraw is denied due to insuffient funds.  Please contact a bank representative."));
				}
				break;
			default: System.out.println(" ");
		}//switch
	}//acctWithdrawal


	/*==============================*/
	// Method - displayBalances()
	/*==============================*/
	public void displayBalances() {
		System.out.println(String.format("\n" + "Account %s - Current account balances:", this.acctNumber));
		System.out.println(String.format("   Savings Balance  is: %.2f", this.savingsBalance));
		System.out.println(String.format("   Checking Balance is: %.2f", this.checkingBalance));
		//System.out.println("\n");
	}

	/*============================================*/
	// Method - displayTotalAssets()
	/*============================================*/
		public void displayTotalAssets() {
		System.out.println("\n" + "Bank's Asset Report:");
		System.out.println(String.format("   Number of accounts created: %d", numOfAccts));
		System.out.println(String.format("   Total Amount of Money: %.2f", totalMoney));
	}

	//getters
	public double getCheckingBalance() {
		return this.checkingBalance;
	}

	public double getSavingsBalance() {
		return this.savingsBalance;
	}	

	public String getAcctNumber() {
		return this.acctNumber;
	}	
}//class
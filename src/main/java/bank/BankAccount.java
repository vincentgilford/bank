package bank;

public class BankAccount {
	private String accountNum; 
	private String type; 
	private double balance; 
	
	public double getBankBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	
	public BankAccount(String accountNum, String type, double balance){
		this.accountNum = accountNum; 
		this.type = type; 
		this.balance = balance; 
	}


	public void addMoney(double moneyDeposit) {
		// TODO Auto-generated method stub
		balance += moneyDeposit;
	}


	public double withDrawMoney(double moneyWithdraw) {
		// TODO Auto-generated method stub
		balance -= moneyWithdraw;
		return moneyWithdraw;
	}


	public String getAccountNum() {
		return accountNum;
	}
	
	public String getAccountType() {
		return type; 
	}
	
	
	
	
	
	
	
	
	
	
	
}

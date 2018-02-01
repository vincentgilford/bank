package bank;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class Bank {

	private Map<String, BankAccount> accounts = new HashMap<String, BankAccount>();

	public void addAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		accounts.put(bankAccount.getAccountNum(), bankAccount);
	}

	public int sizeOfAccount() {
		// TODO Auto-generated method stub
		return accounts.size();
	}

	public BankAccount returnAccountInfo(String accountNum) {
		// TODO Auto-generated method stub
		return accounts.get(accountNum); 
	}
	
	public double balanceInformation(String accountNum) {
		return accounts.get(accountNum).getBankBalance();
	}

	public void transferMoney(String accountNum, String transferAccountNum, double amountTransfer) {
		// TODO Auto-generated method stub
		double moneyTransfer = 0.0;
		moneyTransfer = accounts.get(accountNum).withDrawMoney(amountTransfer);
		accounts.get(transferAccountNum).addMoney(moneyTransfer);
	}

	public void closeBankAccount(String accountNum) {
		// TODO Auto-generated method stub
		accounts.remove(accountNum);
	}
	
	public Collection<BankAccount> returnTotalAccounts(){
		return accounts.values(); 
	
	}
	
	public BankAccount getBankAccountNumber(String accountNum) {
		return accounts.get(accountNum); 
	}
	
	public void bankWithdrawal(String accountNum, double moneyWithdraw) {
		accounts.get(accountNum).withDrawMoney(moneyWithdraw);
		
	}
	
	public void bankDeposit(String accountNum, double moneyDeposit) {
		accounts.get(accountNum).addMoney(moneyDeposit);
	}
	
	
//	public BankAccount getBankAccount(String accountNum) {
//			return account.get
//		
//	}
//	
	
	
	
	
//	public Collection<BankAccount> bankAccountInformation(){
//		return accounts.values(); 
//	}
	
	
	
	
	
	
	
}

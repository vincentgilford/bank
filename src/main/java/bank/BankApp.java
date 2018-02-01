package bank;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Gotham Bank");
		Bank myBank = new Bank(); 
		
		System.out.println("Please Enter your unique account number:");
		String accountNum = input.nextLine(); 
		System.out.println("Please enter account type checking or savings?");
		String type = input.nextLine().trim(); 
		double accountBalance = 0.00; 
		if(type.equals("checking")){
			System.out.println("We start all checking accounts with 500.00");
			accountBalance = 500.00;  
		}
		
		if(type.equals("savings")) {
			System.out.println("We start all savings accounts with 200.00");
			accountBalance = 200.00; 
		}
		
		BankAccount account1 = new BankAccount(accountNum,type,accountBalance);
		
		double accountBalance1 = 0.00; 
		System.out.println("Please Enter your unique account number:");
		String accountNum1 = input.nextLine(); 
		System.out.println("Please enter account type checking or savings?");
		String type2 = input.nextLine().trim(); 
		
		if(type2.equals("checking")){
			System.out.println("We start all checking accounts with 500.00");
			accountBalance1 = 500.00;  
		}
		
		if(type2.equals("savings")) {
			System.out.println("We start all savings accounts with 200.00");
			accountBalance1 = 200.00; 
		}
		
		BankAccount account2 = new BankAccount(accountNum1,type2,accountBalance1);
		myBank.addAccount(account1);
		myBank.addAccount(account2);
		
		System.out.println("You have now finished setting up your Bank Account");
		String userMenu = ""; 
		//menu
		do {
		System.out.println("To Confirm which account you are using, Please Enter account number:");
		String userAccount = input.nextLine().trim();
		System.out.println("User Menu");
		System.out.println("___________");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check balance");
		System.out.println("4. Close Account");
		System.out.println("5. Transfer Money");
		System.out.println("6. Bank Information");
		System.out.println("7. Exit");
		userMenu = input.nextLine().trim();  
		
		if(userMenu.equals("1")) {
			System.out.println("How much to deposit");
			double userDeposit = input.nextDouble();
			myBank.getBankAccountNumber(userAccount).addMoney(userDeposit);
		}
		
		if(userMenu.equals("2")) {
			System.out.println("How much to withdraw");
			double userWithdrawal = input.nextDouble();
			myBank.getBankAccountNumber(userAccount).withDrawMoney(userWithdrawal);
		}
		
		if(userMenu.equals("3")) {
			System.out.println("Balance: " + myBank.getBankAccountNumber(userAccount).getBankBalance());
		}
		
		if(userMenu.equals("4")) {
			System.out.println("Please confirm Account Number:");
			String userClose = input.nextLine();
			myBank.closeBankAccount(userClose);
			System.out.println("Account Closed!, Thank you for your business.");
		}
		
		if(userMenu.equals("5")) {
			System.out.println("Please pick Account Number for transfer:");
			String userTransfer = input.nextLine();
			System.out.println("Please enter amount you would like to transfer:");
			double userAmountTransfer = input.nextDouble(); 
			myBank.transferMoney(userAccount, userTransfer, userAmountTransfer);
		}
		
		if(userMenu.equals("6")) {
			System.out.println("Account information: \n" + "Account number: " + myBank.getBankAccountNumber(userAccount).getAccountNum() + "\nAccount Type: " +
					myBank.getBankAccountNumber(userAccount).getAccountType() + "\nAccount Balance: " + myBank.getBankAccountNumber(userAccount).getBankBalance());
		}
		
		input.nextLine();
		} while(!userMenu.equals("7"));
		
		
		
		
		
		
		
	}

}

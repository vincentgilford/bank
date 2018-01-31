package bank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankAccountTest {
	
	
	@Test
	public void addMoneytoBalance() {
		BankAccount underTest = new BankAccount("1111","checking",0.00);
		
		underTest.addMoney(90.00);
		double check = underTest.getBankBalance();
		
		assertEquals(90.00,check,.001);
	}
	
	
	@Test
	public void withDrawMoneyFromBalance() {
		BankAccount underTest = new BankAccount("1111","checking",100.00);

		underTest.withDrawMoney(50.00);
		double check = underTest.getBankBalance();
		
		assertEquals(50.00,check,.001);
		
	}
	
//	@Test
//	public void transferMoneyToAnotherAccount() {
//		BankAccount underTest = new BankAccount("1111","checking",100.00);
//		BankAccount underTestSavings = new BankAccount("1112","savings",100.00);
//		
//		underTest.transferMoney("1112",10.00); 
//		double check = underTestSavings.getBankBalance(); 
//		double checkCheckings = underTest.getBankBalance(); 
//		
//		assertEquals(110.00,check,.001);
//		assertEquals(90.00,checkCheckings,.001); 
//	}
	
	@Test
	public void instanceToObtainMoneyWithDrawn() {
		BankAccount underTest = new BankAccount("1111","checking",100.00);
		
		
		double check = underTest.withDrawMoney(50.00);
		
		assertEquals(50.00,check,.001);
	}
	
	
	
}

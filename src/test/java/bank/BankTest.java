package bank;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class BankTest {
	
//	@Test
//	public void assertRetrieveBankAccountInfo() {
//		Bank underTest = new Bank(); 
//		
//		underTest.bankAccountInformation(); 
//		
//		
//		
//		assertEquals(0,check); 
//	}
	@Test
	public void addAccountToBank() {
		Bank underTest = new Bank(); 
		
		underTest.addAccount(new BankAccount("1111","checking",100.00));
		int check = underTest.sizeOfAccount();
		
		assertEquals(1,check); 
	}
	
	@Test
	public void assertAccountInformation() {
		Bank underTest = new Bank(); 
		BankAccount accountCheck = new BankAccount("1111","checking",100.00);
		
		underTest.addAccount(accountCheck);
		
		Assert.assertSame(accountCheck,underTest.returnAccountInfo("1111"));
				
//		assertEquals(accountCheck,underTest.returnAccountInfo("1111"));
	}
	
	@Test
	public void assertTransferBankAccount() {
		Bank underTest = new Bank(); 
		Bank transferTest = new Bank(); 
		underTest.addAccount(new BankAccount("1111","checking",100.00));
		underTest.addAccount(new BankAccount("2222","checking",100.00));
		
		underTest.transferMoney("1111","2222",50.00);
		double check = underTest.balanceInformation("1111");
		double checkTransfer = underTest.balanceInformation("2222");
		
		assertEquals(50.00,check,.001);
		assertEquals(150.00,checkTransfer ,.001);
		
		
	}
	
	
	
	
}

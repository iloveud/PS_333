package JUnits;


import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Account.Account;
import Exception.InsufficientFundException;

public class Tests {

	Account c;
	
	@Before
	public void setUp() throws Exception {
		c = new Account(1122, 20000, .045);
		c.withdraw(2500);
		c.deposit(3000);
		System.out.printf("The Balance : $ %,.2f "+ c.getBalance());
		System.out.println("The Monthly interest : "+(c.getMonthlyInterestRate()*100)+"%");
		System.out.println("The date the acount was created :"+ c.getDateCreated());
}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test(expected=InsufficientFundException.class)
	public final void testWithdraw() throws InsufficientFundException {
		c.deposit(3000.00);
		assertEquals("$400 Expected, actual is $3000",(long)c.getBalance(),(long)3000.00);
        c.withdraw(2500);
	}

	@Test
	public final void testDeposit() {
		int x = 0;
		
		while (x < 20) {
			c.deposit(3000);
			
		}
	}
	
	
	
	public void testGetNumber() {
		assertTrue(c.getNumber() == 1122);
		assertFalse(c.getNumber() == 1234);
		
	}
	
	public void testGetBalance() {
		assertTrue(c.getBalance() == 20000);
		assertFalse(c.getBalance() == 12345);
		
	}

	
	public void testGetMonthlyInterestRate() {
		assertTrue(c.getMonthlyInterestRate() == .045);
		
	}

	
	
}

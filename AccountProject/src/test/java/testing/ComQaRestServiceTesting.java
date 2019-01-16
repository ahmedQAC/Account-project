package testing;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.qa.rest.Account;
import com.qa.rest.Service;

public class ComQaRestServiceTesting {
	Account person1 = new Account("Ahmed", "Abidali", 123);
	Account person2 = new Account("Oussama", "Mlouk", 141);
	Account person3 = new Account("Ahmed", "asdfgsdf", 2398147);
	Service service = new Service();
	
	@Ignore
	@Test
	public void firstTest() {
		fail("");
	}
	
	@Test
	public void addingAccount() {
		service.addAccountMap(person1);
		assertEquals(service.getAccountMap(0), person1);
	}
	
	@Test
	public void retrievingAccountMap() {
		service.addAccountMap(person1);
		service.addAccountMap(person2);
		assertEquals(person2, service.getAccountMap(1));
	}
	
	@Test
	public void nameCounterInAccount() {
		service.addAccountMap(person1);
		service.addAccountMap(person2);
		assertEquals(1,service.accountNameCounter("Ahmed"));
	}
	
	@Test
	public void nameCounterInAccount2() {
		service.addAccountMap(person1);
		service.addAccountMap(person2);
		service.addAccountMap(person3);
		assertEquals(2,service.accountNameCounter("Ahmed"));
	}
}

package testing;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.business.service.Service;
import com.qa.persistence.domain.Account;

public class ComQaRestServiceTesting {
	private Account person1;
	private Account person2;
	private Account person3;
	private Service service;
	
	@Before
	public void setup() {
		person1 = new Account("Ahmed", "Abidali", "123");
		person2 = new Account("Oussama", "Mlouk", "141");
		person3 = new Account("Ahmed", "asdfgsdf", "2398147");
		service = new Service();
	}
	
	@Ignore
	@Test
	public void firstTest() {
		fail("");
	}
	
	@Test
	public void addingAccount() {
		service.addAccountMap(person1);
		assertEquals(1, service.getTheWholeAccountMap().size());
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

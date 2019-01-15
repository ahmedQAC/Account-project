package testing;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.qa.rest.Account;
import com.qa.rest.Service;

public class HashMapTesting {
	Account person1 = new Account("Ahmed", "Abidali", 123);
	Account person2 = new Account("Oussama", "Mlouk", 141);
	Service service = new Service();
	
	@Ignore
	@Test
	public void firstTest() {
		fail("");
	}
	
	@Test
	public void addingAccount() {
		service.addAccountMap(1, person1);
		assertEquals(service.getAccountMap(1), person1);
	}
	
	@Test
	public void retrievingAccountMap() {
		service.addAccountMap(1, person1);
		service.getAccountMap(1);
		assertEquals(person1, service.getAccountMap(1));
	}
}

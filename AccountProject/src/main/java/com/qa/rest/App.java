package com.qa.rest;
import com.qa.business.service.Service;
//import com.google.gson.Gson;
import com.qa.persistence.domain.Account;
import com.qa.util.*;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Hello world to the standard out");
		
//		Gson gson =new Gson();
//		Account person1 = new Account("Ahmed", "Abidali", 123);
//		Service service = new Service();
//		service.addAccountMap(1, person1);
//		
//		System.out.println(service.getAccountMap(1).getFirstName());
//		String accountperson1 = gson.toJson(service.getAccountMap(1));
//		System.out.println(accountperson1);

		Account person1 = new Account("Ahmed", "Abidali", "123");
		Account person2 = new Account("oasuid", "asdf", "123445");
		
		Service service = new Service();
		
		service.addAccountMap(person1);
		service.addAccountMap(person2);
		
		JSONUtil gson = new JSONUtil();
		
		System.out.println(gson.getJSONForObject(person1));
		
		//Old way of converting to Gson
//		Gson gson =new Gson();
//		
//		System.out.println(gson.toJson(service.getAccountMap(1)));
	}
	
}

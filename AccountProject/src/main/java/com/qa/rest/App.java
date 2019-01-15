package com.qa.rest;
import com.google.gson.Gson;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Hello world to the standard out");
		
		Gson gson =new Gson();
		Account person1 = new Account("Ahmed", "Abidali", 123);
		Service service = new Service();
		service.addAccountMap(1, person1);
		
		String accountperson1 = gson.toJson(service.getAccountMap(1));
		System.out.println(accountperson1);

	}
}

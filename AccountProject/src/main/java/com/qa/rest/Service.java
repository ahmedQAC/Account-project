package com.qa.rest;
import java.util.HashMap;
import java.util.Map;

public class Service {	
	private Map<Integer, Account> accountMap = new HashMap<>();

	public Account getAccountMap(int key) {
		return accountMap.get(key);
	}

	public void addAccountMap(int key, Account account) {
		accountMap.put(key, account);
	}
	
}

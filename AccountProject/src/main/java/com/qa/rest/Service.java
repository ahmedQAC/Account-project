package com.qa.rest;
import java.util.HashMap;
import java.util.Map;

public class Service {
	private int id = 0;
	private Map<Integer, Account> accountMap = new HashMap<>();

	public Account getAccountMap(int key) {
		return accountMap.get(key);
	}
	
	public Map<Integer, Account> getTheWholeAccountMap() {
		return accountMap;
	}

	public void addAccountMap(Account account) {
		accountMap.put(id, account);
		id++;
	}
	
	public int accountNameCounter(String firstName) {
		int counter = 0;
		for (Account i : getTheWholeAccountMap().values()) {
			if(i.getFirstName().equals(firstName)) {
				counter++;
			}
		}
		return counter;
	}
	
}

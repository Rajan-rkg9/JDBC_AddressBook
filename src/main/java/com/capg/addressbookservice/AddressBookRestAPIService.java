package com.capg.addressbookservice;

import java.util.ArrayList;
import java.util.List;

public class AddressBookRestAPIService {
	
	List<Contacts> contactsList;
	
    public AddressBookRestAPIService(List<Contacts> contactList) {
		contactsList=new ArrayList<>(contactList);
	}
	public long countREST_IOEntries() {
		return contactsList.size();
	}
}

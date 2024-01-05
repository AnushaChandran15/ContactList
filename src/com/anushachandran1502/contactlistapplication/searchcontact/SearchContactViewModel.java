package com.anushachandran1502.contactlistapplication.searchcontact;

import java.sql.SQLException;
import java.util.List;

import com.anushachandran1502.contactlistapplication.dto.Mycontacts;
import com.anushachandran1502.contactlistapplication.repository.Repository;

public class SearchContactViewModel {
	private SearchContactView searchView;
	private Repository repo;
	public SearchContactViewModel(SearchContactView searchContactView) {
		searchView=searchContactView;
		repo=Repository.getInstance();
	}
	public List<Mycontacts> searchContactYourContactList(String search) throws SQLException {
		return repo.searchContactListDB(search);
	}

	

}

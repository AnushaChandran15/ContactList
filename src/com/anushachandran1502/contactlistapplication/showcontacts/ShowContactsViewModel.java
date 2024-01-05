package com.anushachandran1502.contactlistapplication.showcontacts;

import java.sql.SQLException;
import java.util.List;

import com.anushachandran1502.contactlistapplication.dto.Mycontacts;
import com.anushachandran1502.contactlistapplication.repository.Repository;

public class ShowContactsViewModel {
	private ShowContactsView showView;
	private Repository repo;
	public ShowContactsViewModel(ShowContactsView showContactsView) {
		showView=showContactsView;
		repo=Repository.getInstance();
	}
	public List<Mycontacts> getMyContactsList() throws SQLException {
		
		return repo.getMyContactsInDB();
	}

}

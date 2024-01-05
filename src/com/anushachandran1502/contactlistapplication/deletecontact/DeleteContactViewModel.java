package com.anushachandran1502.contactlistapplication.deletecontact;

import java.sql.SQLException;

import com.anushachandran1502.contactlistapplication.repository.Repository;

public class DeleteContactViewModel {
	private DeleteContactView view;
	private Repository repo;
	public DeleteContactViewModel(DeleteContactView deleteContactView) {
		view=deleteContactView;
		 repo=Repository.getInstance();
	}
	public boolean deleteContact(String del) throws SQLException {
		return repo.deleteTheContactDB(del);
	}

}

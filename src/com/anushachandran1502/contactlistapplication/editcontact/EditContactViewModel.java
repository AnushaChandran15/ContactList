package com.anushachandran1502.contactlistapplication.editcontact;

import java.sql.SQLException;

import com.anushachandran1502.contactlistapplication.repository.Repository;

public class EditContactViewModel {
	private EditContactView editView;
	private Repository repo;
	public EditContactViewModel(EditContactView editContactView) {
		this.editView=editContactView;
		repo=Repository.getInstance();
	}
	public boolean edittheContact(String name, String newName, String newPhoneNo) throws SQLException {
		
		return repo.editTheContactDB(name,newName,newPhoneNo);
	}
	

}

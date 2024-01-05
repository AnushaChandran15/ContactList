package com.anushachandran1502.contactlistapplication.addcontact;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.anushachandran1502.contactlistapplication.dto.Mycontacts;
import com.anushachandran1502.contactlistapplication.repository.Repository;

public class AddContactViewModel {
	private AddContactView addContactView;
	private Repository repo;
	public AddContactViewModel(AddContactView addContactView) {
		this.addContactView=addContactView;
		repo=Repository.getInstance();
	}
	public boolean validation(String name,String phNo) throws SQLException {
		Pattern pattern=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher match=pattern.matcher(phNo);
         if(match.find() && !name.equals(""))
         {
        	 return repo.addContactToDB(new Mycontacts(name,phNo));
         }
         return false;
	}
	
}

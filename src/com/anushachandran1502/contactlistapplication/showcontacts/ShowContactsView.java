package com.anushachandran1502.contactlistapplication.showcontacts;

import java.sql.SQLException;
import java.util.List;

import com.anushachandran1502.contactlistapplication.dto.Mycontacts;

public class ShowContactsView {
	private ShowContactsViewModel showViewModel;
	public ShowContactsView()
	{
		showViewModel=new ShowContactsViewModel(this);
	}
	public void showMycontactsList() throws SQLException {
		List<Mycontacts> myContacts=showViewModel.getMyContactsList();
		if(myContacts!=null)
		{
			System.out.println("\n--------------------------------------------------------------");
			System.out.println("|         ContactName       |         Contact Number         |");
			System.out.println("--------------------------------------------------------------");
			for(int i=0;i<myContacts.size();i++)
			{
//				System.out.printf("%s , %s",String.format(myContacts.get(i).getName(),myContacts.get(i).getPhoneNumber()));
//				System.out.println();
				System.out.printf("| %-25s | %-30s |%n", myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());

				//System.out.println(myContacts.get(i).getName()+"       "+myContacts.get(i).getPhoneNumber());
			}
		}
		System.out.println("--------------------------------------------------------------");

	}
	

}

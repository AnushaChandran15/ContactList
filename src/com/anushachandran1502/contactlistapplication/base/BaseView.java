package com.anushachandran1502.contactlistapplication.base;

import java.sql.SQLException;
import java.util.Scanner;

import com.anushachandran1502.contactlistapplication.addcontact.AddContactView;
import com.anushachandran1502.contactlistapplication.deletecontact.DeleteContactView;
import com.anushachandran1502.contactlistapplication.searchcontact.SearchContactView;
import com.anushachandran1502.contactlistapplication.showcontacts.ShowContactsView;

public class BaseView {

	public void start() throws SQLException {
		BaseView base=new BaseView();
		AddContactView addContact=new AddContactView();
		DeleteContactView deleteView=new DeleteContactView();
		SearchContactView searchContact=new SearchContactView();
		ShowContactsView showView=new ShowContactsView();
		Scanner scanner=new Scanner(System.in);
		System.out.println(" ========================================================================================================");
		System.out.println(" My Contacts");
		boolean terminate=true;
		while(terminate)
		{
			System.out.println(" ========================================================================================================");
			System.out.println("1.Add Contact\n2.Search Contact\n3.Delete Contact\n4.Show Contacts\n5.Edit Contact\n0.Exit");
			System.out.println(" ========================================================================================================");
			System.out.println("Enter your,");
			int option=0;
			try
			{
			 option=scanner.nextInt();
			 scanner.nextLine();
			}
			catch(Exception e)
			{
				System.out.println("Wrong Input");
				base.start();
			}
			switch(option)
			{
				case 1: 
					addContact.addcontact();
					break;
				case 2:
					searchContact.searchContact();
					break;
				case 3:
					deleteView.deleteContact();
					break;
				case 4:
					showView.showMycontactsList();
					break;
				case 0:
					System.out.println("Exit.....");
					System.exit(0);
			}
		}
	}

}

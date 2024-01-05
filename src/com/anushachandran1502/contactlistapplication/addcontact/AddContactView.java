package com.anushachandran1502.contactlistapplication.addcontact;

import java.sql.SQLException;
import java.util.Scanner;

public class AddContactView {
	private AddContactViewModel addContactViewModel;
	public AddContactView()
	{
		addContactViewModel=new AddContactViewModel(this);
	}

	public void addcontact() throws SQLException {
		AddContactView view=new AddContactView();
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your Name");
			String name=scanner.nextLine();
			System.out.println("Enter the phone_Number");
			String phNo=scanner.nextLine();
			if(addContactViewModel.validation(name,phNo))
				System.out.println("Add successfully.....");
			else
			{
				System.out.println("Invalid inputs...");
				view.addcontact();
			}
	}

}

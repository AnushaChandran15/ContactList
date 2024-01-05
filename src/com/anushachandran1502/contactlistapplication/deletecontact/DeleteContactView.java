package com.anushachandran1502.contactlistapplication.deletecontact;

import java.sql.SQLException;
import java.util.Scanner;

public class DeleteContactView {
	private DeleteContactViewModel delViewModel;
	public DeleteContactView()
	{
		delViewModel=new DeleteContactViewModel(this);
	}

	public void deleteContact() throws SQLException {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter phone number/Name");
			String del=scanner.nextLine();
			if(delViewModel.deleteContact(del))
			{
				System.out.println("Deleted...");
			}
			else
			{
				System.out.println("Contect not deleted..");
			}
	}

}

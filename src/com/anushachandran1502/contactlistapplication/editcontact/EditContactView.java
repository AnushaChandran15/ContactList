package com.anushachandran1502.contactlistapplication.editcontact;

import java.sql.SQLException;
import java.util.Scanner;

public class EditContactView {
	private EditContactViewModel editViewModel;
	private final String BOLD = "\033[1m";
	private final String RESET = "\033[0m";
	private final String BG = "\033[45m";

	public EditContactView() {
		this.editViewModel=new EditContactViewModel(this);
	}

	public void editConctact() throws SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Which Contact you want to Edit?");
		String name=scanner.nextLine();
		System.out.println("Enter the new name");
		String newName=scanner.nextLine();
		System.out.println("Enter the new Phone number");
		String newPhoneNo=scanner.nextLine();
		if(editViewModel.edittheContact(name,newName,newPhoneNo))
			System.out.println("Edited....");
	}
	
	
	
}

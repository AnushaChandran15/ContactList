package com.anushachandran1502.contactlistapplication.searchcontact;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.anushachandran1502.contactlistapplication.dto.Mycontacts;

public class SearchContactView {
	private SearchContactViewModel searchViewModel;
	public SearchContactView()
	{
		searchViewModel=new SearchContactViewModel(this);
	}
	public void searchContact() throws SQLException {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the Name/Number");
			String search=scanner.nextLine();
			System.out.println("Search.....");
		List<Mycontacts> searchList=searchViewModel.searchContactYourContactList(search);
		if(searchList!=null)
		{
			System.out.println("Name"+"            "+"PhoneNumber");
			for(int i=0;i<searchList.size();i++)
			{
				System.out.println( searchList.get(i).getName()+"        "+ searchList.get(i).getPhoneNumber());
			}
			System.out.println("**********");
		}
		else
		{
			System.out.println("Not found.....");
		}
		
	}

}

package com.anushachandran1502.contactlistapplication.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.anushachandran1502.contactlistapplication.dto.Mycontacts;


public class Repository {
	static Repository repository;
	static Connection con;
	private Repository()
	{
		 String url = "jdbc:mysql://localhost:3306/contactlist";
		 String userName = "root";
		 String passWord = "root";
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 this.con = DriverManager.getConnection(url, userName, passWord);
		 }
		 catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Repository getInstance()
	{
		if(repository==null)
		{
			repository=new Repository();
		}
		return repository;
	}
	public boolean addContactToDB(Mycontacts mycontacts) throws SQLException {
		  String sql = "INSERT INTO contacts (name, phone_no) VALUES (?,?)";
	        PreparedStatement preparedStatement = con.prepareStatement(sql);
	        preparedStatement.setString(1, mycontacts.getName());
	        preparedStatement.setString(2, mycontacts.getPhoneNumber());
//	        preparedStatement.setBoolean(3,true);
//	        preparedStatement.setBoolean(4, false);
	        int rowsAffected = preparedStatement.executeUpdate();
		return (rowsAffected>0)?true:false;
	}
	public boolean deleteTheContactDB(String del) throws SQLException {
		String query="Delete from contacts where name=? or phone_no=?";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1, del);
        preparedStatement.setString(2, del);
        int rowsAffected = preparedStatement.executeUpdate();
        if(rowsAffected>0)
        {
        	return true;
        }
		
		return false;
	}
	public List<Mycontacts> searchContactListDB(String search) throws SQLException {
		List<Mycontacts> list=new ArrayList<>();
String query = "SELECT * FROM contacts WHERE LOWER(name) LIKE '%"+search.toLowerCase()+"%' OR phone_no  LIKE '%"+search+"%'";
		Statement statement=con.createStatement();
		ResultSet rs = statement.executeQuery(query);
		try {
			while(rs.next())
			{
				list.add(new Mycontacts(rs.getString("name"),rs.getString("phone_no")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<Mycontacts> getMyContactsInDB() throws SQLException {
		String query = "select * from contacts order by name asc";
		List<Mycontacts> list=new ArrayList<>();
		Statement statement=con.createStatement();
		ResultSet rs = statement.executeQuery(query);
		try {
			while(rs.next())
			{
				list.add(new Mycontacts(rs.getString("name"),rs.getString("phone_no")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}

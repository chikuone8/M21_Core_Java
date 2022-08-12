package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUpdate {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Daminik13#";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			//to update a rows
			String query="UPDATE EMPLOYEE SET NAME=?,EMAIL_ID=? WHERE ID=?";
			PreparedStatement p=c.prepareStatement(query);
			
			p.setString(1, "Vipul");
			p.setString(2, "vipullengare@gmail.com");
			p.setInt(3, 121);
			int r = p.executeUpdate();
			if(r > 0)
			{
				System.out.println("New User is Inserted successfully");
			}
			c.close();
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
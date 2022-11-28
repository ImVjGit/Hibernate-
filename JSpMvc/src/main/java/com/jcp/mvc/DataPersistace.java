package com.jcp.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataPersistace implements DataAccess {

	@Override
	public List<User> getData(String qu) {
		List<User> data =new ArrayList();
		try {
			//jdbc code 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbuser", "root", "toor");
			
			PreparedStatement ps = conn.prepareStatement(qu);
			ResultSet rs = ps.executeQuery();
			
while(rs.next())
{
	System.out.println("result Set : ");
			User obj = new User();
			obj.setUser(rs.getString(1));
			obj.setPass(rs.getString(2));
			obj.setCpass(rs.getString(3));
			obj.setEmail(rs.getString(4));
			data.add(obj);
			
}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

}

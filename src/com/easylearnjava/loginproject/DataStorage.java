package com.easylearnjava.loginproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

public class DataStorage {
	public String getUserPassword(String UserNameFromUser) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			PreparedStatement pstmt= conn.prepareStatement("select password from userTable where username=UserNameFromUser");
			ResultSet rs=pstmt.executeQuery("select password from userTable where username=UserNameFromUser");
			rs.getString("username");
			conn.close();
			
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		HashMap<String,String> map= new<String,String> HashMap();
		map.put("Prabeen","abc");
		map.put("Bikash","bbc");
		map.put("sisi","123");
		return(map.get(UserNameFromUser));
		
		
	}

}

package com.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.database.db;
import com.model.User;

public class UserServImpl implements UserServices{

	
	Connection conn= null;
	
	
	

	public UserServImpl() {
		
		conn=db.getdatabaseconn();
		
	}




	@Override
	public void saveDetails(User user) {
		
		String sql="insert into webtable (username,password) values (?,?)";
		PreparedStatement pstm;
		try {
			pstm=conn.prepareStatement(sql);
			
			pstm.setString(1, user.getUsername());
			pstm.setString(2, user.getPassword());
			pstm.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}




	@Override
	public boolean checkDetails(String un, String pswd) {
		
		String sql="select * from webtable where username='"+un+"' and password='"+pswd+"'";
		
		try {
			Statement stm= conn.createStatement();
			ResultSet rs= stm.executeQuery(sql);
			if(rs.next())
			{
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}




	

}

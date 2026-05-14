package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.User;

public class UserDAO extends DAO {
	
	// User Search data from DB
	public User search(String login,String password)
		throws Exception {
		User user=null;
		
		Connection con=getConnection();
		
		PreparedStatement st;
		st=con.prepareStatement(
				"select * from users where name=? and password=?");
		st.setString(1, login);
		st.setString(2, password);
		ResultSet rs=st.executeQuery();
		
		while(rs.next()) {
			user=new User();
			user.setId(rs.getInt("id"));
			user.setLogin(rs.getString("name"));
			user.setPassword(rs.getString("password"));
		}
		
		st.close();
		con.close();
	return user;	
	}
	
	// User Insert data to DB
	public boolean insert(String new_name,String new_password)
		throws Exception {
		// connect to DB
		Connection con=getConnection();
		con.setAutoCommit(false);
		
		PreparedStatement st;
		st=con.prepareStatement(
				"insert into users(name,password) values(?,?)");
		st.setString(1, new_name);
		st.setString(2, new_password);
		int line=st.executeUpdate();
		st.close();
		
		if (line != 1) {
			con.rollback();
			con.setAutoCommit(true);
			con.close();
			return false;
		}
		
		con.commit();
		con.setAutoCommit(true);
		con.close();
		return true;
	}
	
}

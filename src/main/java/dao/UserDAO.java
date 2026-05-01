package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.User;

public class UserDAO extends DAO {
	public User search(String login,String password)
		throws Exception {
		User user=null;
		
		Connection con=getConnection();
		
		PreparedStatement st;
		st=con.prepareStatement(
				"select * from users where login=? and password=?");
		st.setString(1, login);
		st.setString(2, password);
		ResultSet rs=st.executeQuery();
		
		while(rs.next()) {
			user=new User();
			user.setId(rs.getInt("id"));
			user.setLogin(rs.getString("login"));
			user.setPassword(rs.getString("password"));
		}
		
		st.close();
		con.close();
	return user;	
	}
}

package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class HealthDAO extends DAO {
	public boolean insert(
		double height,double weight,LocalDate checkDate,String memo
	) throws Exception {
		Connection con=getConnection();
		con.setAutoCommit(false);
		
			PreparedStatement st=con.prepareStatement(
				"insert into health(height,weight,check_date,memo) values(?,?,?,?)");
			st.setDouble(1, height);
			st.setDouble(2, weight);
			st.setDate(3, Date.valueOf(checkDate));
			st.setString(4, memo);
			
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

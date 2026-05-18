package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Health;

public class HealthDAO extends DAO {
	
	// insert method of HealthDAO
	public boolean insert(
		double height,double weight,LocalDate checkDate,String memo,int user_id
	) throws Exception {
		Connection con=getConnection();
		con.setAutoCommit(false);
		
			PreparedStatement st=con.prepareStatement(
				"insert into health(height,weight,check_date,memo,user_id) values(?,?,?,?,?)");
			st.setDouble(1, height);
			st.setDouble(2, weight);
			st.setDate(3, Date.valueOf(checkDate));
			st.setString(4, memo);
			st.setInt(5, user_id);
			
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
	
	// search method of HealthDAO
	public Health search(
		int id
	) throws Exception {
		Health health=null;
		
		Connection con=getConnection();
		
		PreparedStatement st;
		st=con.prepareStatement(
				"select * from health where id=?"
			);
		st.setInt(1, id);
		ResultSet rs=st.executeQuery();
		
		while (rs.next()) {
			health=new Health();
			health.setId(rs.getInt("id"));
			health.setHeight(rs.getDouble("height"));
			health.setWeight(rs.getDouble("weight"));
			health.setCheckDate(rs.getDate("check_date").toLocalDate());
			health.setMemo(rs.getString("memo"));
		}
		rs.close();
		st.close();
		con.close();
		
		return health;
	}

	// list method of HealthDAO
	public List<Health> list() throws Exception {
		List<Health> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st;
		st=con.prepareStatement(
				"select * from health order by check_date desc,id desc"
			);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Health health=new Health();
			health.setId(rs.getInt("id"));
			health.setHeight(rs.getDouble("height"));
			health.setWeight(rs.getDouble("weight"));
			health.setCheckDate(rs.getDate("check_date").toLocalDate());
			health.setMemo(rs.getString("memo"));
			list.add(health);
		}
		rs.close();
		st.close();
		con.close();

		return list;
	}
	
}

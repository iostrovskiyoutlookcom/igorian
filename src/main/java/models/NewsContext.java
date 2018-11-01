package models;

import java.sql.*;
import java.util.Vector;

public class NewsContext extends DAO{
	
	public Vector<News> getAllNews() {
		
		Vector<News> news = new Vector<News>();	
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(conURL, DBUser, DBPass);
			stmt = conn.createStatement();
			String sql = "select * from news";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				News n = new News();
				n.setId(rs.getInt(1));
				n.setTitle(rs.getString(2));
				n.setAnnotation(rs.getString(3));
				n.setDetails(rs.getString(4));
				n.setPhoto(rs.getString(6));
				n.setPublis(rs.getString(5));
				n.setStatus(rs.getString(6));
				news.add(n);
			}
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace();
		} finally{
			try {
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
				if(stmt!=null) stmt.close();
			} catch (SQLException e) { e.printStackTrace(); }
		}
		
		return news;
	}


}

package database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class Database {
	
	public void getConnection(){
		
		
	}
	
	public void getData1(){
		
		
	}
	
public String[] getData(String s, String m){
		
		String[] data;
		int i = 0;
		try{
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/markusfreyr", "postgres","root");
			if(con != null){
				System.out.println("connection");
			}
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM "+s+" WHERE name LIKE '%"+m+"%'");
			data = new String[getRows(s)];
			while (rs.next()) {
				  data[i] = rs.getString("name");
				  i++;
				}
			rs.close();
			return data;
		}
		catch(Exception ee){
			ee.printStackTrace();
		}
		String[] err = null;
		return err;
	}
	
	public static int getRows(String s){
		
		try{
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/markusfreyr", "postgres","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT COUNT(*) AS rowcount FROM "+s+"");
			rs.next();
			int count = rs.getInt("rowcount");
			rs.close();
			return count;
		}
		catch(Exception ee){
			ee.printStackTrace();
		}
		
		return -1;
	}
	
	public static void main(String [] args){
		
		
		//getData("hotel", "h");
		
		
		
	}
	
	

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cims;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 *
 * @author anjan
 */


public class DataConnection {
    
    public DataConnection() {
    }
    
    
    
    private static Connection getConnection() {
		Connection Conn = null;
		String DRIVER = "com.mysql.jdbc.Driver";
		try {
			Class.forName(DRIVER).newInstance();
			String url = "jdbc:mysql://localhost:3306/cims?zeroDateTimeBehavior=convertToNull";
			Conn = DriverManager.getConnection(url);
		} catch (Exception e) {
			 System.out.println("Not Connected  "+e);
		}
		return Conn;
	}

	// declare a method to create a Statement

	private static Statement getStatement() throws Exception {
		Statement st = null;
		Connection Conn = getConnection();
		st = Conn.createStatement();
		return st;
	}

	// declare a method to insert record

	public static boolean insertRecord(String sql) throws Exception {
		Statement st = getStatement();
		st.executeUpdate(sql);

		return true;
	}
   
}

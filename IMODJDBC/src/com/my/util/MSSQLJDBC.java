package com.my.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MSSQLJDBC {
	// 1、连接SqlServer2000
	// private String sDBDriver="com.microsoft.jdbc.sqlserver.SQLServerDriver";
	// private String url="jdbc:microsoft:sqlserver://localhost:1433;......";
	// 2、连接SqlServer2005
	// driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
	// url=jdbc:sqlserver://localhost:1433;......
	// 3、连接SqlServer2008
	// driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
	// url=jdbc:sqlserver://192.168.3.29:1433;......
	// 以下为2008连接，事实上和2005连接一样的。都是用的jdbc1.2来完成的。
	private String	sDBDriver	= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String	url			= "jdbc:sqlserver://192.168.1.12:1433;DatabaseName=Atims";	// Notice:DatabaseName
	private String	urlreal		= "jdbc:sqlserver://192.168.1.12:1433;DatabaseName=";		// Notice:DatabaseName
	private String	user		= "sa";
	private String	password	= "longrise@2015";											// Notice:
	// user
	// and
	// password.
	Connection		conn;
	Statement		stmt;
	ResultSet		rs;

	public void initDataBase(String database) {
		this.url = this.urlreal + database;
	}

	public MSSQLJDBC() {
		try {
			Class.forName(sDBDriver);
		} catch (java.lang.ClassNotFoundException e) {
			System.err.println("connsql():" + e.getMessage());
		}
	}

	public void executeInsert(String sql) {
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			System.err.println("connsql.executeUpdate:" + ex.getMessage());
		}
	}

	public ResultSet executeQuery(String sql) {
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery(sql);
		} catch (SQLException ex) {
			System.err.println("connsql.executeQuery:" + ex.getMessage());
		}
		return rs;
	}

	public void executeUpdate(String sql) {
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			System.err.println("connsql.executeQuery:" + ex.getMessage());
		}
	}

	public void executeDelete(String sql) {
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			System.err.println("connsql.executeDelete:" + ex.getMessage());
		}
	}

	public void closeStmt() {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeConn() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			MSSQLJDBC conn = new MSSQLJDBC();
			ResultSet rs = conn.executeQuery("select ct.DistrictId as countyid,ct.Name as countyname,et.StreetId as streetid,et.Name as streetname,ty.CommunityId as communityid,ty.Name as communityname from District ct,Street et,Community ty where ct.DistrictId=et.DistrictID and et.StreetId=ty.StreetID");
			int i = 0;
			while (rs.next()) {
				System.out.print(rs.getString("countyid") + "\t");
				System.out.print(rs.getString("countyname") + "\t");
				System.out.print(rs.getString("streetid") + "\t");
				System.out.print(rs.getString("streetname") + "\t");
				System.out.print(rs.getString("CommunityId") + "\t");
				System.out.print(rs.getString("communityname") + "\n");
				i++;
			}
			System.out.println(i);
			rs.close();
			conn.initDataBase("DSASSCN");
			ResultSet set = conn.executeQuery("select * from areainfo");
			while (set.next()) {
				System.out.println(set.getString(1));
			}
			set.close();
			conn.closeStmt();
			conn.closeConn();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

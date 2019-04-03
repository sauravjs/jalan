package com.abc.mvc4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.driver.OracleDriver;

public class RegisterModel 
{
	private String url="jdbc:oracle:thin:@//192.168.1.1:1521/XE";
	private String un="system";
	private String pw="system";
	private Connection con=null;
	private ResultSet res=null;
	private PreparedStatement pstmt=null;
	private String name=null;
	private String city=null;
	private String pwd=null;
	
	
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getPwd() {
		return pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUrl() {
		return url;
	}
	public String getUn() {
		return un;
	}
	public String getPw() {
		return pw;
	}
	public Connection getCon() {
		return con;
	}
	public ResultSet getRes() {
		return res;
	}
	public PreparedStatement getPstmt() {
		return pstmt;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public void setRes(ResultSet res) {
		this.res = res;
	}
	public void setPstmt(PreparedStatement pstmt) {
		this.pstmt = pstmt;
	}
	
	public RegisterModel()
	{
		try
		{
			DriverManager.registerDriver(new OracleDriver());
			con=DriverManager.getConnection(url, un, pw);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	boolean register()
	{
		try 
		{
			pstmt=con.prepareStatement("insert into JULYAUGBATCH values(?,?,?)");
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setString(3, pwd);
			pstmt.executeUpdate();
			return true;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}
			
}

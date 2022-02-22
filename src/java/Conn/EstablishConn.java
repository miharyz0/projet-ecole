/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conn;

import java.sql.*;
/**
 *
 * @author Keeevv
 */
public class EstablishConn {

    ///		LOAD ORACLE DRIVER
	public static Connection getOracleCon() throws ClassNotFoundException, SQLException
    {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kev","1234");
	}

    ///		LOAD POSTGRES DRIVER
	public static Connection getPostgresCon() throws ClassNotFoundException, SQLException 
    {
		Class.forName("org.postgresql.Driver");
		
		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecole", "postgres", "070919Jk");
	}

}

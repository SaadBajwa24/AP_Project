package application;

import java.sql.*;

public class Database {

	public static void main(String[] args) throws SQLException {
		
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver load successfully");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-EC2RIA7:1521:xe","hello","12345");
			System.out.println("Connection Established!");
			Statement temp1=con.createStatement();
			ResultSet temp2=temp1.executeQuery("select * from supplier");
			while(temp2.next())
			{
				int id=temp2.getInt(1);
				String n1=temp2.getString(2);
				String n2=temp2.getString(3);
				String n3=temp2.getString(4);
				String n4=temp2.getString(5);
				System.out.println(id + " " + n1 + " " + n2 + " " + n3 + " " + n4);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("-------- Oracle JDBC Connection Testing ------");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        }
        catch (ClassNotFoundException e) {

            System.out.println("Where is your Oracle JDBC Driver?");
            e.printStackTrace();
            return;
        }

        System.out.println("Oracle JDBC Driver Registered!");

        Connection con = null;

        try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-EC2RIA7:1521:XE","hello","12345");
        } 
        catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (con != null) 
        {
            System.out.println("You made it, take control your database now!");
        } 
        else {
            System.out.println("Failed to make connection!");
        }/*
		Statement temp1=con.createStatement();
		ResultSet temp2=temp1.executeQuery("select * from hello");
		while(temp2.next())
		{
			int id=temp2.getInt(1);
			String n1=temp2.getString(2);
			System.out.println(id + " " + n1);
		}*/
        String sql="insert into hello values (05,'why')";
        PreparedStatement statement=con.prepareStatement(sql);
        int temp=statement.executeUpdate();
        if(temp>0)
        	System.out.println("Added value");
		Statement temp1=con.createStatement();
		ResultSet temp2=temp1.executeQuery("select * from hello");
		while(temp2.next())
		{
			int id=temp2.getInt(1);
			String n1=temp2.getString(2);
			System.out.println(id + " " + n1);
		}
		con.close();
	}

}

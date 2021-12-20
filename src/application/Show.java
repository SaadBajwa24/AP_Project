package application;

import java.sql.*;

public class Show {

	private int showid;
	private Theatre theatreobj;
	private Movie movieobj;
	private String showtime;
	private int ticketprice;
	
	Show()
	{
		showid=0;
		this.theatreobj=new Theatre();
		this.movieobj=new Movie();
		showtime="";
		ticketprice=0;
	}
	Show(int a,Theatre b,Movie c,String d,int e)
	{
		showid=a;
		this.theatreobj=new Theatre();
		theatreobj=b;
		this.movieobj=new Movie();
		movieobj=c;
		showtime=d;
		ticketprice=e;
	}
	public void InitializeShow(int a,Theatre b,Movie c,String d,int e)
	{
		showid=a;
		this.theatreobj=new Theatre();
		theatreobj=b;
		this.movieobj=new Movie();
		movieobj=c;
		showtime=d;
		ticketprice=e;
	}
	public void setShowid(int showid) 
	{
		this.showid = showid;
	}
	public void settheatre(Theatre arrtheatre) 
	{
		this.theatreobj = arrtheatre;
	}
	public int getShowid()
	{
		return showid;
	}
	public Theatre gettheatre() 
	{
		return theatreobj;
	}
	public Movie getMovieobj() 
	{
		return movieobj;
	}
	public void setMovieobj(Movie movieobj)
	{
		this.movieobj = movieobj;
	}
	public String getShowtime() 
	{
		return showtime;
	}
	public void setShowtime(String showtime) 
	{
		this.showtime = showtime;
	}
	public int getTicketprice() 
	{
		return ticketprice;
	}
	public void setTicketprice(int ticketprice)
	{
		this.ticketprice = ticketprice;
	}
	public void GetShow() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-EC2RIA7:1521:XE","hello","12345");
		Statement temp1=con.createStatement();
		ResultSet temp2=temp1.executeQuery("select * from shows");
		while(temp2.next())
		{
			int id1=temp2.getInt(1);
			int id2=temp2.getInt(2);
			int id3=temp2.getInt(3);
			String n1=temp2.getString(4);
			int id4=temp2.getInt(5);
			System.out.println("The show id is: " + id1);
			System.out.println("The theatre id is: " + id2);
			System.out.println("The movie id is: " + id3);
			System.out.println("The show time is: " + n1);
			System.out.println("The show ticket price is: " + id4);
		}
		con.close();
	}
	public void AddShow(int showid2,int theatreid2,int movieid2,String showtime,int ticketprice2) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-EC2RIA7:1521:XE","hello","12345");
		String sql="insert into shows values (?,?,?,?,?)";
        PreparedStatement statement=con.prepareStatement(sql);
        statement.setInt(1,showid2);
        statement.setInt(2,theatreid2);
        statement.setInt(3,movieid2);
        statement.setString(4,showtime);
        statement.setInt(5,ticketprice2);
        int temp=statement.executeUpdate();
        if(temp>0)
        	System.out.println("Added value in table");
        con.close();
	}
	public void DeleteShow(int showid2) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-EC2RIA7:1521:XE","hello","12345");
		String sql="delete from shows where showid=?";
        PreparedStatement statement=con.prepareStatement(sql);
        statement.setInt(1,showid2);
        int temp=statement.executeUpdate();
        if(temp>0)
        	System.out.println("Deleted value from table");
        con.close();
	}
	public void UpdateShowTime(String newtime,int showid2) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-EC2RIA7:1521:XE","hello","12345");
		String sql="update shows set showtime=? where showid=?";
        PreparedStatement statement=con.prepareStatement(sql);
        statement.setString(1,newtime);
        statement.setInt(2,showid2);
        int temp=statement.executeUpdate();
        if(temp>0)
        	System.out.println("Updated value from table");
        con.close();
	}
	public void UpdateShowTheatreid(int newtheatreid,int showid2) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-EC2RIA7:1521:XE","hello","12345");
		String sql="update shows set theatreid=? where showid=?";
        PreparedStatement statement=con.prepareStatement(sql);
        statement.setInt(1,newtheatreid);
        statement.setInt(2,showid2);
        int temp=statement.executeUpdate();
        if(temp>0)
        	System.out.println("Updated value from table");
        con.close();
	}
	public void UpdateShowMovieid(int newmovieid,int showid2) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-EC2RIA7:1521:XE","hello","12345");
		String sql="update shows set movieid=? where showid=?";
        PreparedStatement statement=con.prepareStatement(sql);
        statement.setInt(1,newmovieid);
        statement.setInt(2,showid2);
        int temp=statement.executeUpdate();
        if(temp>0)
        	System.out.println("Updated value from table");
        con.close();
	}
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Show s1;
		s1=new Show();
		//s1.AddShow(2,2,2,"6:30 pm",800);
		//s1.GetShow();
		//s1.UpdateShowTime("07:00 pm",2);
		//s1.DeleteShow(2);
		//s1.UpdateShowTheatreid(4,2);
		//s1.UpdateShowMovieid(6,2);
		s1.GetShow();
	}

}
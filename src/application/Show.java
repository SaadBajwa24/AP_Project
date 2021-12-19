package application;

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
	Show(int a,int b,int c,String d,int e)
	{
		showid=a;
		this.theatreobj=new Theatre();
		theatreobj.settheatreid(b);
		this.movieobj=new Movie();
		movieobj.setmovieid(c);
		showtime=d;
		ticketprice=e;
	}
	public void InitializeShow(int a,int b,int c,String d,int e)
	{
		showid=a;
		this.theatreobj=new Theatre();
		theatreobj.settheatreid(b);
		this.movieobj=new Movie();
		movieobj.setmovieid(c);
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


	
}
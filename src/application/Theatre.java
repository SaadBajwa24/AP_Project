package application;

public class Theatre {

	private int theatreid;
	private int theatresize;
	
	Theatre()
	{
		theatreid=0;
		theatresize=0;
	}
	Theatre(int a,int b)
	{
		theatreid=a;
		theatresize=b;
	}
	public void InitializeTheatre(int a,int b)
	{
		theatreid=a;
		theatresize=b;		
	}
	public void settheatreid(int a)
	{
		theatreid=a;
	}
	public void settheatresize(int a)
	{
		theatresize=a;
	}
	public int gettheatreid()
	{
		return theatreid;
	}
	public int gettheatresize()
	{
		return theatresize;
	}
	
}
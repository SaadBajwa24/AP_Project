package TestCases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Movie {

	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", rating=" + rating + ", releasedate="
				+ releasedate + ", duration=" + duration + ", genre=" + genre + "]";
	}

	private int movieid;
	private String moviename;
	private String rating;
	private String releasedate;
	private String duration;
	private String genre;
	
	Movie()
	{
		movieid=0;
		moviename="";
		rating="";
		releasedate="";
		duration="";
		genre="";
	}
	Movie(int a,String b,String c,String d,String e,String f)
	{
		movieid=a;
		moviename=b;
		rating=c;
		releasedate=d;
		duration=e;
		genre=f;
	}
	public void InitializeMovie(int a,String b,String c,String d,String e,String f)
	{
		movieid=a;
		moviename=b;
		rating=c;
		releasedate=d;
		duration=e;
		genre=f;
	}
	public void setmovieid(int a)
	{
		movieid=a;
	}
	public void setMoviename(String moviename) 
	{
		this.moviename = moviename;
	}
	public void setRating(String rating)
	{
		this.rating = rating;
	}
	public void setReleasedate(String releasedate) 
	{
		this.releasedate = releasedate;
	}
	public void setDuration(String duration) 
	{
		this.duration = duration;
	}
	public void setGenre(String genre) 
	{
		this.genre = genre;
	}
	public int getmovieid()
	{
		return movieid;
	}
	public String getMoviename() 
	{
		return moviename;
	}
	public String getRating() 
	{
		return rating;
	}
	public String getReleasedate() 
	{
		return releasedate;
	}
	public String getDuration()
	{
		return duration;
	}
	public String getGenre()
	{
		return genre;
	}
	public void GetMovieDetails()
	{
		try {
			String line="";
			BufferedReader readFile=new BufferedReader(new FileReader("D:\\i190448_i191974_i190746_cinema_System\\CinemaSystem\\src\\application\\moviedetails.txt"));
			while((line=readFile.readLine())!=null) {
				String[] str=line.split(",");
				System.out.println(str[0] + " " + "Movie name: " + str[1] + " " + "Rating: " + str[2] + " " + "Release-date: " + str[3] + " " + "Duration: " + str[4] + " " + "Genre: " + str[5]);
			}
			readFile.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public ObservableList<Movie> GetMovieList()
	{
		ObservableList<Movie> templist1=FXCollections.observableArrayList();
		try {
			String line="";
			BufferedReader readFile=new BufferedReader(new FileReader("D:\\i190448_i191974_i190746_cinema_System\\CinemaSystem\\src\\application\\moviedetails.txt"));
			while((line=readFile.readLine())!=null) {
				Movie temp=new Movie();
				String[] str=line.split(",");
				System.out.println(str[0] + " " + "Movie name: " + str[1] + " " + "Rating: " + str[2] + " " + "Release-date: " + str[3] + " " + "Duration: " + str[4] + " " + "Genre: " + str[5]);
				temp.setmovieid(Integer.parseInt(str[0]));
				temp.setMoviename(str[1]);
				temp.setRating(str[2]);
				temp.setReleasedate(str[3]);
				temp.setDuration(str[4]);
				temp.setGenre(str[5]);
				templist1.add(temp);
			}
			readFile.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return templist1;
	}
	public void AddMovie(int a,String b,String c,String d,String e,String f)
	{
		try {
			FileWriter myWriter = new FileWriter("D:\\i190448_i191974_i190746_cinema_System\\CinemaSystem\\src\\application\\moviedetails.txt",true);
			myWriter.write(a + "," + b + "," + c + "," + d + "," + e + "," + f + "\n");
			myWriter.close();
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	public void EditMovie(String old,String newdata)
	{
		try {
			String line="";
			String olddata="";
			BufferedReader readFile=new BufferedReader(new FileReader("D:\\i190448_i191974_i190746_cinema_System\\CinemaSystem\\src\\application\\moviedetails.txt"));
			while((line=readFile.readLine())!=null) {
				olddata=olddata + line + System.lineSeparator();		
			}
			String newcontent=olddata.replaceAll(old,newdata);
			FileWriter writer= new FileWriter("D:\\i190448_i191974_i190746_cinema_System\\CinemaSystem\\src\\application\\moviedetails.txt");
			writer.write(newcontent);
			readFile.close();
			writer.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		Movie m1;
		m1=new Movie();
		ObservableList<Movie> templist=FXCollections.observableArrayList();
		templist=m1.GetMovieList();
		for(Movie temp:templist)
		{
			System.out.println("temp is: " + temp);
		}
		//m1.GetMovieDetails();
		System.out.println("Done");
		/*m1.EditMovie("8.5","7.6");
		m1.GetMovieDetails();
		System.out.println("Done");*/
	}
	
}

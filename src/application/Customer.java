package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Customer {

	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String cnic;
	private String phonenumber;
	private String email;
	private String address;
	
	Customer()
	{
		username="";
		password="";
		firstname="";
		lastname="";
		cnic="";
		phonenumber="";
		email="";
		address="";
	}
	Customer(String a,String b,String c,String d,String e,String f,String g,String h)
	{
		username=a;
		password=b;
		firstname=c;
		lastname=d;
		cnic=e;
		phonenumber=f;
		email=g;
		address=h;
	}
	public void InitializeCustomer(String a,String b,String c,String d,String e,String f,String g,String h)
	{
		username=a;
		password=b;
		firstname=c;
		lastname=d;
		cnic=e;
		phonenumber=f;
		email=g;
		address=h;
	}
	public void DisplayDetails()
	{
		System.out.println("The customer username is: " + username);
		System.out.println("The customer password is: " + password);
		System.out.println("The customer firstname is: " + firstname);
		System.out.println("The customer lastname is: " + lastname);
		System.out.println("The customer cnic is: " + cnic);
		System.out.println("The customer phonenumber is: " + phonenumber);
		System.out.println("The customer email is: " + email);
		System.out.println("The customer address is: " + address);
	}
	public void setusername(String a)
	{
		username=a;
	}
	public void setpassword(String a)
	{
		password=a;
	}
	public String getusername()
	{
		return username;
	}
	public String getpassword()
	{
		return password;
	}
	public String getFirstname() 
	{
		return firstname;
	}
	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	public String getLastname()
	{
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	public String getCnic() {
		return cnic;
	}
	public void setCnic(String cnic) 
	{
		this.cnic = cnic;
	}
	public String getPhonenumber()
	{
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) 
	{
		this.phonenumber = phonenumber;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void RegisterUser(String username2,String password2,String firstname2,String lastname2 ,String cnic2,String phonenumber2,String email2,String address2) 
	{
		/*username=username2;
		password=password2;
		firstname=firstname2;
		lastname=lastname2;
		cnic=cnic2;
		phonenumber=phonenumber2;
		email=email2;
		address=address2;*/
		try {
			FileWriter myWriter = new FileWriter("D:\\i190448_i191974_i190746_cinema_System\\CinemaSystem\\src\\application\\customerdetails.txt",true);
			myWriter.write(username2 + "," + password2 + "," + firstname2 + "," + lastname2 + "," + cnic2 + "," + phonenumber2 + "," + email2 + "," +address2 + "\n");
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public boolean Login(String username2, String password2) 
	{
		if((this.username.equals(username2)) && (this.password.equals(password2)))
		return true;
		else
		return false;
	}	
	
	@SuppressWarnings("resource")
	public boolean VerifyUser(String username2, String password2)
	{
		try {
			String line="";
			BufferedReader readFile;
			readFile = new BufferedReader(new FileReader("D:\\i190448_i191974_i190746_cinema_System\\CinemaSystem\\src\\application\\customerdetails.txt"));
			try {
						while((line=readFile.readLine())!=null) {
							String[] str=line.split(",");
							if((str[0].equals(username2)) && (str[1].equals(password2)))
							{
								return true;
							}
						}
					readFile.close();
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		} 	
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void main(String args[])
	{
		Customer c1;
		c1=new Customer();
		c1.RegisterUser("hello","1234","saad","bajwa","789456123","010203","hello@bye.com","pakistan");
		System.out.println("Done");
		Customer c2;
		c2=new Customer();
		c2.RegisterUser("bye","9876","ahmed","bajwa","123456789","989796","bye@hello.com","pakistan");
		System.out.println("Done");
		if(c2.VerifyUser("bye","9876"))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		/*Movie m1;
		m1=new Movie();
		m1.GetMovieDetails();*/
	}
	
}
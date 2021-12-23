package application;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingid;
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", showid=" + showid + ", customerid=" + customerid + ", seats="
				+ seats + "]";
	}
	private int showid;
	private int customerid;
	private int seats;
	
	Booking()
	{
		bookingid=0;
		showid=0;
		customerid=0;
		seats=0;
	}
	Booking(int a,int b,int c,int d)
	{
		bookingid=a;
		showid=b;
		customerid=c;
		seats=d;
	}
	public void InitializeMoive(int a,int b,int c,int d)
	{
		bookingid=a;
		showid=b;
		customerid=c;
		seats=d;
	}
	public int getBookingid()
	{
		return bookingid;
	}
	public void setBookingid(int bookingid) 
	{
		this.bookingid = bookingid;
	}
	public int getShowid() 
	{
		return showid;
	}
	public void setShowid(int showid)
	{
		this.showid = showid;
	}
	public int getCustomerid() 
	{
		return customerid;
	}
	public void setCustomerid(int customerid) 
	{
		this.customerid = customerid;
	}
	public int getSeats() 
	{
		return seats;
	}
	public void setSeats(int seats) 
	{
		this.seats = seats;
	}
	public void GetBooking(int bookingid2)
	{
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Booking.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		Booking b1=session.get(Booking.class,bookingid2);
		System.out.println(b1.getBookingid());
		trans.commit();
	}
	@SuppressWarnings("rawtypes")
	public void GetAllBooking()
	{
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Booking.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		List Booking=session.createQuery("from Booking").list();
		for(Iterator iterator=((java.util.List) Booking).iterator();iterator.hasNext();)
		{
			Booking b1=(Booking) iterator.next();
			System.out.println("Booking id: " + b1.getBookingid());
			System.out.println("Show id: " + b1.getShowid());
			System.out.println("Customer id: " + b1.getCustomerid());
			System.out.println("Customer seats: " + b1.getSeats());
		}
	}
	@SuppressWarnings("rawtypes")
	public ObservableList<Booking> GetBookingList()
	{
		ObservableList<Booking> templist=FXCollections.observableArrayList();
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Booking.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		List Booking=session.createQuery("from Booking").list();
		for(Iterator iterator=((java.util.List) Booking).iterator();iterator.hasNext();)
		{
			Booking b1=(Booking) iterator.next();
			templist.add(b1);
		}
		return templist;
	}
	public void AddBooking(int showid2,int customerid2,int seats) throws ClassNotFoundException, SQLException
	{
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Booking.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		Booking b1=new Booking();
		b1.setShowid(showid2);
		b1.setCustomerid(customerid2);
		b1.setSeats(seats);
		session.save(b1);
		trans.commit();
		Show obj=new Show();
		int newseats=obj.GetShowSeats(showid2)-seats;
		obj.UpdateShowSeats(newseats,showid2);
	}
	public void UpdateBooking(int bookingid2,int showid2,int customerid2,int seat)
	{
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Booking.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		Booking Bookingobj=session.get(Booking.class,bookingid2);
		Bookingobj.setShowid(showid2);
		Bookingobj.setCustomerid(customerid2);
		Bookingobj.setSeats(seat);
		session.update(Bookingobj);
		trans.commit();
	}
	public void DeleteBooking(int bookingid2)
	{
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Booking.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		Booking bookingobj=session.get(Booking.class,bookingid2);
		session.delete(bookingobj);
		trans.commit();
	}
	
	public static void main(String args[])
	{
		/*Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Booking.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		Booking b1=new Booking();
		b1.setShowid(1);
		b1.setCustomerid(2);
		session.save(b1);
		trans.commit();*/
		/*Booking b1=new Booking();
		ObservableList<Booking> templist=FXCollections.observableArrayList();
		templist=b1.GetBookingList();
		for(Booking temp:templist)
		{
			System.out.println("temp is: " + temp);
		}*/
		Booking b1=new Booking();
		//b1.DeleteBooking(7);
		//b1.DeleteBooking(2);
		//b1.DeleteBooking(3);
		//b1.DeleteBooking(6);
		//b1.AddBooking(1,7,1);
		//b1.AddBooking(4,5,6);
		//b1.AddBooking(7,8,9);
		//b1.GetAllBooking();*/
		//b1.UpdateBooking(2,12,10);
		b1.GetAllBooking();
		//b1.DeleteBooking(4);
		//b1.GetAllBooking();
		//b1.GetAllBooking();
		//b1.AddBooking(4,5);
		//b1.AddBooking(8,9);
		//b1.GetBooking(1);
	}
	
}

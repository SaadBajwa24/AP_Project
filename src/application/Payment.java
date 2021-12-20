package application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int PaymentId;
	
	/*
	@OneToOne (cascade=CascadeType.ALL)
	private Booking bookingobj;*/
	
	private int bookingid;
	private int totalamount;
	
	public int getPaymentId() 
	{
		return PaymentId;
	}
	public void setPaymentId(int paymentId)
	{
		PaymentId = paymentId;
	}
	/*
	public Booking getBookingobj() 
	{
		return bookingobj;
	}
	public void setBookingobj(Booking bookingobj) 
	{
		this.bookingobj = bookingobj;
	}
	*/
	public int getTotalamount()
	{
		return totalamount;
	}
	public void setTotalamount(int totalamount)
	{
		this.totalamount = totalamount;
	}
	
	public int getBookingid() 
	{
		return bookingid;
	}
	public void setBookingid(int bookingid) 
	{
		this.bookingid = bookingid;
	}
	public void DoPayment()
	{
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Payment.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		Payment temppay=new Payment();
		temppay.setBookingid(24);
		temppay.setTotalamount(7000);
		session.save(temppay);
		trans.commit();
		/*Booking tempbook=new Booking();
		tempbook.setCustomerid(24);
		tempbook.setSeats(7);
		tempbook.setShowid(1);
		Payment temppay=new Payment();
		temppay.setTotalamount(7000);
		session.save(tempbook);
		temppay.setBookingobj(tempbook);
		session.save(temppay);
		trans.commit();*/
	}
	
}

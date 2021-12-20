package application;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TryHibernate {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
        System.out.println(sf);
	}

}

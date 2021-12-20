module CinemaSystem {

	requires javafx.controls;
	requires java.persistence;
	requires java.sql;
	requires org.hibernate.orm.core;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires java.transaction;
	
	opens application to hibernate.jpa,javafx.graphics, javafx.fxml, org.hibernate.orm.core;

}

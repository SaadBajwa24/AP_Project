package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.application.Platform;

@SuppressWarnings("unused")
public class controller implements Initializable{
	
	private Admin admin;
	private Customer customer;
	private Movie movie;
	private Show show;
	
	//********THREADING**********//
	@FXML 
	private Text text;	
	textAnimator textAn;
 
	 @FXML
	 void start(MouseEvent event) {
		 Thread thread = new Thread(textAn);
	     thread.start();
	 }
	

	//*********************LOGIN PAGE******************************//
	
	 @FXML
	 private TextField passwordBox;

	 @FXML
	 private Button register;

	 @FXML
	 private Button signIn;

	 @FXML
	 private TextField usernameBox;
	 
	 @FXML
	 private Label loginMsg;
	 
	 @FXML
	 void registerUser(ActionEvent event) throws IOException {
		Main m=new Main();
		m.changeScenes("register.fxml");
	 }

	 @FXML
	 void signInUser(ActionEvent event) throws IOException , InvalidCharacterException  {
		String username=usernameBox.getText().toString();
		String password=passwordBox.getText().toString();
		Pattern p = Pattern.compile("[^A-Za-z0-9]");
	    Matcher m1 = p.matcher(username);
	    Matcher m2 = p.matcher(password);
	    boolean b1 = m1.find();
	    boolean b2 = m2.find();
	    if(b1 || b2) 
	    {
	    	throw new InvalidCharacterException("Special Characters are not Allowed");
	    }
		customer=new Customer();
		 if(customer.VerifyUser(username,password)) {
			 loginMsg.setText("Welcome!!");
			 Main m=new Main();
			 m.changeScenes("dashboard.fxml");
		 }
		 else {
			usernameBox.clear();
			passwordBox.clear();
			loginMsg.setText("incorrect username or password");
		 }
	 }
	 
	 //********************SIGN IN PAGE***************************//
	 
	 
	 @FXML
	 private TextField addressBox;

     @FXML
     private Button back;

	 @FXML
	 private TextField cnicBox;

     @FXML
     private Button confirm;

     @FXML
	 private TextField emailBox;

	 @FXML
	 private TextField firstNameBox;

	 @FXML
	 private TextField lastNameBox;

	 @FXML
	 private TextField regPassBox;

	 @FXML
	 private TextField regUsernameBox;

	
	 
	 @FXML
	 void confirmRegistration(ActionEvent event) throws IOException {	//for confirming registration
		 
		 if(regUsernameBox.getText().trim().isEmpty() || regUsernameBox.getText()==null || regPassBox.getText().trim().isEmpty() || regPassBox.getText()==null || cnicBox.getText().trim().isEmpty() || cnicBox.getText()==null || emailBox.getText().trim().isEmpty() || emailBox.getText()==null || addressBox.getText().trim().isEmpty() || addressBox.getText()==null || firstNameBox.getText().trim().isEmpty() || firstNameBox.getText()==null || lastNameBox.getText().trim().isEmpty() || lastNameBox.getText()==null) {
			 Alert alert = new Alert(Alert.AlertType.WARNING);
			 alert.setTitle("Error");
			 alert.setHeaderText("incorrect entry");
			 alert.setContentText("boxes cant be left empty");
			 alert.showAndWait();
		 }
		 
		 else 
		 {
			 Main m=new Main();
			 customer=new Customer();
			 String password,name,cnic,email,address,fname,lname,phonenumber = null;
			 name=regUsernameBox.getText();
			 password=regPassBox.getText();
			 cnic=cnicBox.getText();
			 email=emailBox.getText();
			 address=addressBox.getText();
			 fname=firstNameBox.getText();
			 lname=lastNameBox.getText();
			 customer.RegisterUser(name,password,fname,lname,cnic,phonenumber,email,address);
			 m.changeScenes("login.fxml");
		 }	 
		 
	 }
	 
	 @FXML
	 void goBack(ActionEvent event) throws IOException {	//going back from registration to login page
		 Main m=new Main();
		 m.changeScenes("login.fxml");
	 }
	 
	 //primaryStage.setMaximized(true);	//for when maximizing stage
	 
	 
	 //*******************************DASHBORD****************************************//
	 
	 @FXML
	 private Button bookButton;
	 
	 @FXML
	 private Button cancel;

	 @FXML
	 private Button makePayment;

	 @FXML
	 private Button showMovieButton;
	 
	 @FXML
	 private Button backButton;
	 
	 @FXML
	 private BorderPane borderpane;
	 
	 @FXML
	 private Button showBookings;

	 //for book button
	 
	 @FXML
	 void bookButtonGetDarker(MouseEvent event) {	//button gets darker when highlighted
		 bookButton.setStyle("-fx-background-color: #410a2e;");
		 
	 }

	 @FXML
     void bookButtonReturnColor(MouseEvent event) {	//button goes back to original color when mouse leaves node
		 bookButton.setStyle("-fx-background-color: #821458;");
     }
	 
	 @FXML
	 void goToBook(ActionEvent event) throws IOException {
		 Main m=new Main();
		 m.changeScenes("booking.fxml");
		 
		 //customer.customerBooking(movieName,seats,showid);
		 
		 //dynamicView.loadBoarderCenter(borderpane,"booking.fxml");
	 }
 
	 //for cancel button
	 
	 @FXML
	 void cancelButtonGetDarker(MouseEvent event) {	//button gets darker when highlighted
		 cancel.setStyle("-fx-background-color: #410a2e;");
	 }

	 @FXML
     void cancelButtonOriginal(MouseEvent event) {	//button goes back to original color when mouse leaves node
		 cancel.setStyle("-fx-background-color: #821458;");
     }
	 
	 @FXML
	 void goToCancelBooking(ActionEvent event) throws IOException {
		 Main m=new Main();
		 m.changeScenes("cancelBooking.fxml");
		 
		 //customer.cancelBooking(bookingId,showId);
	 }	 
	 
	 //for make payment button

	 @FXML
	 void makePaymentDarker(MouseEvent event) {	//button gets darker when highlighted
		 makePayment.setStyle("-fx-background-color: #410a2e;");
     }

	 @FXML
     void makePaymentOriginal(MouseEvent event) {	//button goes back to original color when mouse leaves node
		 makePayment.setStyle("-fx-background-color: #821458;");
	 }
	 
	 @FXML
	 void goToMakePayment(ActionEvent event) throws IOException {
		 Main m=new Main();
		 m.changeScenes("makePayment.fxml");
		 
		 //customer.makePayment(BookingId,ShowId,seats);
	 }
	 
	 
	 //for show movies button

	 @FXML
	 private TableView<Movie> MovieTable;

	 //@FXML
	 //private TableColumn<Movie,Integer> movieid2;
	 
	 @FXML
	 private TableColumn<Movie,String> movieduration;

	 @FXML
	 private TableColumn<Movie,String> moviegenre;

	 @FXML
	 private TableColumn<Movie,String> moviename2;

	 @FXML
	 private TableColumn<Movie,String> movierating;

	 @FXML
	 private TableColumn<Movie,String> moviereleasedate;
	 
	 ObservableList<Movie> oblist=FXCollections.observableArrayList();
	 
	 /*
	 @Override
	 public void initialize(URL url, ResourceBundle rb) 
	 {
		 try {
			 
			 TextOutput textOutput=new TextOutput() {
					@Override		
					public void writeText(String textOut) {
						Platform.runLater(new Runnable() {
							@Override
							public void run() {
								text.setText(textOut);
							}
						});
					}
			};
			
			textAn=new textAnimator("Movie Ticketing System",0, textOutput);
			 
			 movieid2.setCellValueFactory(new PropertyValueFactory<Movie,Integer>("movieid"));
			 moviename2.setCellValueFactory(new PropertyValueFactory<Movie,String>("moviename"));
			 movierating.setCellValueFactory(new PropertyValueFactory<Movie,String>("rating"));
			 moviereleasedate.setCellValueFactory(new PropertyValueFactory<Movie,String>("releasedate"));
			 movieduration.setCellValueFactory(new PropertyValueFactory<Movie,String>("duration"));
			 moviegenre.setCellValueFactory(new PropertyValueFactory<Movie,String>("genre"));
			 Movie m1=new Movie();
			 oblist=m1.GetMovieList();
			 MovieTable.setItems(oblist);
			 
			 //MovieTable.getItems().setAll(oblist);
		 }
		 catch (Exception e1)
		 {
		 }
		 //MovieTable.setItems(oblist);
		 //BookingTable.getItems().setAll(templist);
	 }
	 */
	 
	 @FXML
	 void showButtonDarker(MouseEvent event) {	//button gets darker when highlighted
		 showMovieButton.setStyle("-fx-background-color: #410a2e;");
	 }

	 @FXML
	 void showButtonOriginal(MouseEvent event) {	//button goes back to original color when mouse leaves node
		 showMovieButton.setStyle("-fx-background-color: #821458;");
	 }
	 
	 @FXML
	 void goToShowMovies(ActionEvent event) throws IOException {
		 
		 Main m=new Main();
		 m.changeScenes("showMovies.fxml");
		 //shows.displayall();
	 }
	 
	 
	 //for show bookings
	 
	 @FXML
	 private TableView<Booking> BookingTable;
	 
	 @FXML
	 private TableColumn<Booking,Integer> bookingid1;
	 
	 @FXML
	 private TableColumn<Booking,Integer> showid1;

	 @FXML
	 private TableColumn<Booking,Integer> customerid1;

	 @FXML
	 private TableColumn<Booking,Integer> seats1;

	 
	 ObservableList<Booking> templist=FXCollections.observableArrayList();
	 
	 
	 @Override
	 public void initialize(URL url, ResourceBundle rb) 
	 {
		 try {
		 
		 		TextOutput textOutput=new TextOutput() {
				@Override		
				public void writeText(String textOut) {
				Platform.runLater(new Runnable() {
							@Override
							public void run() {
								text.setText(textOut);
							}
						});
					}
			};
			
			textAn=new textAnimator("Movie Ticketing System",0, textOutput);
		 
			 /*bookingid1.setCellValueFactory(new PropertyValueFactory<Booking,Integer>("bookingid"));
			 showid1.setCellValueFactory(new PropertyValueFactory<Booking,Integer>("showid"));
			 customerid1.setCellValueFactory(new PropertyValueFactory<Booking,Integer>("customerid"));
			 seats1.setCellValueFactory(new PropertyValueFactory<Booking,Integer>("seats"));
			 Booking b1=new Booking();
			 templist=b1.GetBookingList();
			 BookingTable.setItems(templist);*/
			 
			 //movieid2.setCellValueFactory(new PropertyValueFactory<Movie,Integer>("movieid"));
			 moviename2.setCellValueFactory(new PropertyValueFactory<Movie,String>("moviename"));
			 movierating.setCellValueFactory(new PropertyValueFactory<Movie,String>("rating"));
			 moviereleasedate.setCellValueFactory(new PropertyValueFactory<Movie,String>("releasedate"));
			 movieduration.setCellValueFactory(new PropertyValueFactory<Movie,String>("duration"));
			 moviegenre.setCellValueFactory(new PropertyValueFactory<Movie,String>("genre"));
			 Movie m1=new Movie();
			 oblist=m1.GetMovieList();
			 MovieTable.setItems(oblist);
			 
			 /*
			 movieid2.setCellValueFactory(new PropertyValueFactory<Movie,Integer>("movieid"));
			 moviename2.setCellValueFactory(new PropertyValueFactory<Movie,String>("moviename"));
			 movierating.setCellValueFactory(new PropertyValueFactory<Movie,String>("rating"));
			 moviereleasedate.setCellValueFactory(new PropertyValueFactory<Movie,String>("releasedate"));
			 movieduration.setCellValueFactory(new PropertyValueFactory<Movie,String>("duration"));
			 moviegenre.setCellValueFactory(new PropertyValueFactory<Movie,String>("genre"));
			 Movie m1=new Movie();
			 oblist=m1.GetMovieList();
			 MovieTable.setItems(oblist);*/
			 //MovieTable.getItems().setAll(oblist);
		 }
		 catch (Exception e1)
		 {
		 }
		 //MovieTable.setItems(oblist);
		 //BookingTable.getItems().setAll(templist);
	 }
	 
	 @FXML
	 void showBgoOriginal(MouseEvent event) {
		 showBookings.setStyle("-fx-background-color: #821458;");
	 }

	 @FXML
	 void showBGoDarker(MouseEvent event) {
		 showBookings.setStyle("-fx-background-color: #410a2e;");
	 }

	 @FXML
	 void goToShowBookings(ActionEvent event) throws IOException {
		 //Booking temp=new Booking();
		 //temp.GetAllBooking();
		 Main m=new Main();
		 m.changeScenes("showBookings.fxml");
		 //customer.showBookings(customerID);
	 }
	 
	 
	 //for back button
	 @FXML
	 void backButtonOriginal(MouseEvent event) {	//button gets darker when highlighted
		 backButton.setStyle("-fx-background-color: #821458;");
		 
	 }

	 @FXML
	 void backButtonDarker(MouseEvent event) {	//button goes back to original color when mouse leaves node
		 backButton.setStyle("-fx-background-color: #410a2e;");
	 }
	 
	 
	 
	 
	 
	 //for back button
	 
	 @FXML
	 void goBackLogin(ActionEvent event) throws IOException {
		 Main m=new Main();
		 m.changeScenes("login.fxml");
	 }
	 


}



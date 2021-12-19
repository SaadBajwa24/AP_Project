package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

@SuppressWarnings("unused")
public class controller {
	
	private Admin admin;
	private Customer customer;
	private Movie movie;
	private Show show;
	
//	controller(){
//
//		admin=new Admin();
//		customer=new Customer();
//		movie=new Movie();
//		show=new Show();
//		
//	}
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
	 void signInUser(ActionEvent event) throws IOException {
		String username=usernameBox.getText().toString();
		String password=passwordBox.getText().toString();
		customer=new Customer();
		 if(customer.Login(username,password)) {
			 loginMsg.setText("Welcome!!");
			 Main m=new Main();
			 m.changeScenes("dashboard.fxml");
		 }
		 else {
			 
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
		 else {
			 
			 
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
	 
	 
	 //*******************************DASHBOX****************************************//
	 
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
	 void showBgoOriginal(MouseEvent event) {
		 showBookings.setStyle("-fx-background-color: #821458;");
	 }

	 @FXML
	 void showBGoDarker(MouseEvent event) {
		 showBookings.setStyle("-fx-background-color: #410a2e;");
	 }

	 @FXML
	 void goToShowBookings(ActionEvent event) throws IOException {
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



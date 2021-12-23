package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;

import javafx.scene.input.MouseEvent;

@SuppressWarnings("exports")
public class bookingController {
	
	@FXML
	private Button showMovieButton;
	@FXML
	private Button showShows;
	@FXML
	private Button makePayment;
	@FXML
	private Button showBookings;
	@FXML
	private Button backButton;
	@FXML
	private Button bookButton;
	 
	
	@FXML
    private TextField showidTextbox;
	
	@FXML
    private TextField customeridTextbox;
	
	@FXML
    private TextField seatsTextbox;

	@FXML
	private Button confirm;
	
	
	//to confirm a booking
	
	@FXML
	  void confirmBooking(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
		  if(showidTextbox.getText().trim().isEmpty() || showidTextbox.getText()==null || customeridTextbox.getText().trim().isEmpty() || customeridTextbox.getText()==null || seatsTextbox.getText().trim().isEmpty() || seatsTextbox.getText()==null) {
				 Alert alert = new Alert(Alert.AlertType.WARNING);
				 alert.setTitle("Error");
				 alert.setHeaderText("incorrect entry");
				 alert.setContentText("boxes cant be left empty");
				 alert.showAndWait();
			 }
			 else {
				 //save data and perform rest of code here
				 Booking tempobj=new Booking();
				 int customerid1,showid1,seats1;
				 customerid1=Integer.parseInt(customeridTextbox.getText());
				 showid1=Integer.parseInt(showidTextbox.getText());
				 seats1=Integer.parseInt(seatsTextbox.getText());
				 tempobj.AddBooking(showid1,customerid1,seats1);
				 Main m=new Main();
				 m.changeScenes("dashboard.fxml");
			 }
	  }
	
	
	//for booking
	//for book button
	 
	 @FXML
	 void bookButtonGetDarker(MouseEvent event) {	//button gets darker when highlighted
		 bookButton.setStyle("-fx-background-color: #410a2e;");
		 
	 }

	 @FXML
    void bookButtonReturnColor(MouseEvent event) {	//button goes back to original color when mouse leaves node
		 bookButton.setStyle("-fx-background-color: #821458;");
    }
	 
	
	
	 
	 //for show  bookings
	 @FXML
		public void goToShowBookings(ActionEvent event) throws IOException {
			Main m=new Main();
			m.changeScenes("showBookings.fxml");
		}
		// Event Listener on Button[#showBookings].onMouseEntered
		@FXML
		public void showBGoDarker(MouseEvent event) {
			showBookings.setStyle("-fx-background-color: #410a2e;");
		}
		// Event Listener on Button[#showBookings].onMouseExited
		@FXML
		public void showBgoOriginal(MouseEvent event) {
			showBookings.setStyle("-fx-background-color: #821458;");
		}

	 
	 
	 
	 
	 
		//for show Shows button
		
		@FXML
		void showShowsButtonGetDarker(MouseEvent event) {	//button gets darker when highlighted
			showShows.setStyle("-fx-background-color: #410a2e;");
		}
		
		@FXML
		void showShowsButtonOriginal(MouseEvent event) {	//button goes back to original color when mouse leaves node
			showShows.setStyle("-fx-background-color: #821458;");
		}
		
		@FXML
		void goToShowShows(ActionEvent event) throws IOException {
			 Main m=new Main();
			 m.changeScenes("showShows.fxml");
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
		 
		 
		 
	@FXML
	void goBackLogin(ActionEvent event) throws IOException {
		 Main m=new Main();
		 m.changeScenes("login.fxml");
	 }
}

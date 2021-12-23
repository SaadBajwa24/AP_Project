package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.scene.input.MouseEvent;

@SuppressWarnings("exports")
public class cancelBookingController {
	
	@FXML
	private Button bookButton;
	@FXML
	private Button showMovieButton;
	@FXML
	private Button makePayment;
	@FXML
	private Button showBookings;
	@FXML
	private Button backButton;
	@FXML
	private Button cancel;
	
	
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

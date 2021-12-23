package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

@SuppressWarnings("exports")
public class cancelBookingsController {
	 	
		@FXML
	    private Button addMovie;

	    @FXML
	    private Button addShow;

	    @FXML
	    private Button backButton;

	    @FXML
	    private TextField bookingidTextbox;

	    @FXML
	    private Button cancelBookings;

	    @FXML
	    private Button confirm;

	    @FXML
	    private Text labelMsg;

	    @FXML
	    private Button viewBooking;

	    @FXML
	    private Button viewShows;
	    
	  //add movie button
		
		@FXML
		public void goToAddmovie(ActionEvent event) throws IOException {
			Main m=new Main();
			m.changeScenes("addMovie.fxml");
		}
		
		@FXML
		public void addmovieGetDarker(MouseEvent event) {
			addMovie.setStyle("-fx-background-color: #410a2e;");
		}
		
		@FXML
		public void addmovieReturnColor(MouseEvent event) {
			addMovie.setStyle("-fx-background-color: #821458;");
		}
		
		
		
		
		//add show button
		
		
		@FXML
		public void goToAddshow(ActionEvent event) throws IOException {
			Main m=new Main();
			m.changeScenes("addShow.fxml");
		}

		@FXML
		public void addshowDarker(MouseEvent event) {
			addShow.setStyle("-fx-background-color: #410a2e;");
		}

		@FXML
		public void addshowOriginal(MouseEvent event) {
			addShow.setStyle("-fx-background-color: #821458;");
		}

		
		
		
		// view bookings
		
		@FXML
		public void goToViewbookings(ActionEvent event) throws IOException {
			Main m=new Main();
			m.changeScenes("viewBookings.fxml");
		}
		
		@FXML
		public void viewbookingsDarker(MouseEvent event) {
			viewBooking.setStyle("-fx-background-color: #410a2e;");
		}

		@FXML
		public void viewbookingsOriginal(MouseEvent event) {
			viewBooking.setStyle("-fx-background-color: #821458;");
		}

		
		
		
		//view shows
		
		@FXML
		public void goToViewshows(ActionEvent event) throws IOException {
			Main m=new Main();
			m.changeScenes("viewShows.fxml");
		}

		@FXML
		public void viewshowsDarker(MouseEvent event) {
			viewShows.setStyle("-fx-background-color: #410a2e;");
		}

		@FXML
		public void viewshowsOriginal(MouseEvent event) {
			viewShows.setStyle("-fx-background-color: #821458;");
		}
		
		
		
		
		
		//cancel bookings
		

		@FXML
		public void cancelDarker(MouseEvent event) {
			cancelBookings.setStyle("-fx-background-color: #410a2e;");
		}
		
		@FXML
		public void cancelOriginal(MouseEvent event) {
			cancelBookings.setStyle("-fx-background-color: #821458;");
		}
		
		
		
		
		
		
		//back button
		
		@FXML
		public void goBackLogin(ActionEvent event) throws IOException {
			Main m=new Main();
			m.changeScenes("login.fxml");
		}

		@FXML
		public void backButtonDarker(MouseEvent event) {
			backButton.setStyle("-fx-background-color: #410a2e;");
		}
		
		@FXML
		public void backButtonOriginal(MouseEvent event) {
			backButton.setStyle("-fx-background-color: #821458;");
		}
		
		//confirm cancel booking
		
		@FXML
		void confirmCancelBooking(ActionEvent event) throws IOException {
			Booking b1=new Booking();
			int tempvalue=Integer.parseInt(bookingidTextbox.getText());
			if(b1.GetBookingId(tempvalue)) {
				b1.DeleteBooking(tempvalue);
				 Main m=new Main();
				 m.changeScenes("adminDashboard.fxml");
			}
			else {
				 bookingidTextbox.clear();
				labelMsg.setText("Incorrect booking id"); 
			 }
		}
		
		
	    
}

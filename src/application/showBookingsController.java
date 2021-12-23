package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

@SuppressWarnings("exports")
public class showBookingsController implements Initializable{
	
	
	@FXML
	private Button bookButton;
	@FXML
	private Button showMovieButton;
	@FXML
	private Button showShows;
	@FXML
	private Button makePayment;
	@FXML
	private Button backButton;
	@FXML
	private Button showBookings;
	
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
			 bookingid1.setCellValueFactory(new PropertyValueFactory<Booking,Integer>("bookingid"));
			 showid1.setCellValueFactory(new PropertyValueFactory<Booking,Integer>("showid"));
			 customerid1.setCellValueFactory(new PropertyValueFactory<Booking,Integer>("customerid"));
			 seats1.setCellValueFactory(new PropertyValueFactory<Booking,Integer>("seats"));
			 Booking b1=new Booking();
			 templist=b1.GetBookingList();
			 BookingTable.setItems(templist);	 
	 }
	 
	 //for show  bookings
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

	 /*
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
	 */
	 
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
	
	 
	
	
	 @FXML
	 void goToShowBookings(ActionEvent event) throws IOException {
		 Main m=new Main();
		 m.changeScenes("showBookings.fxml");
	 }
	 
}

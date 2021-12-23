package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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
public class showShowsController implements Initializable{
	
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
	private Button showShows;
		
	
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
	    private TableView<Show> showShowsTable;

	    @FXML
	    private TableColumn<Show,Integer> showid;

	    @FXML
	    private TableColumn<Show,Integer> theatreid;
	    
	    @FXML
	    private TableColumn<Show,Integer> showMovieid;
	    	    
	    @FXML
	    private TableColumn<Show,String> showtime;
	    
	    @FXML
	    private TableColumn<Show,Integer> price;

	    @FXML
	    private TableColumn<Show,Integer> numOfSeats;

		ObservableList<Show> templist=FXCollections.observableArrayList();
	    
		 @Override
		 public void initialize(URL url, ResourceBundle rb) 
		 {		  
				 try {
					 showid.setCellValueFactory(new PropertyValueFactory<Show,Integer>("showid"));
					 theatreid.setCellValueFactory(new PropertyValueFactory<Show,Integer>("theatreid"));
					 showMovieid.setCellValueFactory(new PropertyValueFactory<Show,Integer>("movieid"));
					 showtime.setCellValueFactory(new PropertyValueFactory<Show,String>("showtime"));
					 price.setCellValueFactory(new PropertyValueFactory<Show,Integer>("ticketprice"));
					 numOfSeats.setCellValueFactory(new PropertyValueFactory<Show,Integer>("seats"));
					 Show s1=new Show();
					 templist=s1.GetShowList();
					 showShowsTable.setItems(templist);
				} 
				catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	 
		 }
		
		
		@FXML
		void goToShowShows(ActionEvent event) throws IOException {
			 Main m=new Main();
			 m.changeScenes("showShows.fxml");
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

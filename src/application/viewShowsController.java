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

public class viewShowsController implements Initializable {
	@FXML
	private Button addMovie;
	@FXML
	private Button addShow;
	@FXML
	private Button viewBooking;
	@FXML
	private Button viewShows;
	@FXML
	private Button cancelBookings;
	@FXML
	private Button backButton;
	
	@FXML
	private TableView<Show> showsTable;
	
	
	@FXML
	private TableColumn<Show,Integer> movieid;

	@FXML
	private TableColumn<Show,Integer> seats;

	@FXML
	private TableColumn<Show,Integer> showid;

	@FXML
	private TableColumn<Show,String> showtime;

	@FXML
	private TableColumn<Show,Integer> theatreid;

	@FXML
	private TableColumn<Show,Integer> ticketprice;

	ObservableList<Show> templist=FXCollections.observableArrayList();
    
	 @Override
	 public void initialize(URL url, ResourceBundle rb) 
	 {		  
			 try {
				 showid.setCellValueFactory(new PropertyValueFactory<Show,Integer>("showid"));
				 theatreid.setCellValueFactory(new PropertyValueFactory<Show,Integer>("theatreid"));
				 movieid.setCellValueFactory(new PropertyValueFactory<Show,Integer>("movieid"));
				 showtime.setCellValueFactory(new PropertyValueFactory<Show,String>("showtime"));
				 ticketprice.setCellValueFactory(new PropertyValueFactory<Show,Integer>("ticketprice"));
				 seats.setCellValueFactory(new PropertyValueFactory<Show,Integer>("seats"));
				 Show s1=new Show();
				 templist=s1.GetShowList();
				 showsTable.setItems(templist);
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
		public void viewshowsDarker(MouseEvent event) {
			viewShows.setStyle("-fx-background-color: #410a2e;");
		}

		@FXML
		public void viewshowsOriginal(MouseEvent event) {
			viewShows.setStyle("-fx-background-color: #821458;");
		}
		
		
		
		
		
		//cancel bookings
		
		@FXML
		public void goToCancelbookings(ActionEvent event) throws IOException {
			Main m=new Main();
			m.changeScenes("cancelBookings.fxml");
		}

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
}

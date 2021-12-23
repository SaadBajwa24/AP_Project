package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.scene.input.MouseEvent;

@SuppressWarnings("exports")
public class addMovieController {
	
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
	private TextField idTextbox;
	@FXML
	private TextField nameTextbox;
	@FXML
	private TextField ratingTextbox;
	@FXML
	private TextField releasedateTextbox;
	@FXML
	private TextField durationTextbox;
	@FXML
	private TextField genreTextbox;
	@FXML
	private Button confirm;

	//add movie button
		
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
		
		
		//confirm adding movie
		
		  @FXML
		  void confirmAddMovie(ActionEvent event) throws IOException {
			  if(nameTextbox.getText().trim().isEmpty() || nameTextbox.getText()==null || idTextbox.getText().trim().isEmpty() || idTextbox.getText()==null || ratingTextbox.getText().trim().isEmpty() || ratingTextbox.getText()==null || releasedateTextbox.getText().trim().isEmpty() || releasedateTextbox.getText()==null || durationTextbox.getText().trim().isEmpty() || durationTextbox.getText()==null || genreTextbox.getText().trim().isEmpty() || genreTextbox.getText()==null) {
					 Alert alert = new Alert(Alert.AlertType.WARNING);
					 alert.setTitle("Error");
					 alert.setHeaderText("incorrect entry");
					 alert.setContentText("boxes cant be left empty");
					 alert.showAndWait();
				 }
				 else {
					 Movie tempmov=new Movie();
					 int movieid1=Integer.parseInt(idTextbox.getText());
					 String moviename1=nameTextbox.getText();
					 String rating1=ratingTextbox.getText();
					 String releasedate1=releasedateTextbox.getText();
					 String duration1=durationTextbox.getText();
					 String genre1=genreTextbox.getText();
					 tempmov.AddMovie(movieid1,moviename1,rating1,releasedate1,duration1,genre1);
					 Main m=new Main();
					 m.changeScenes("adminDashboard.fxml");
				 }
		  }
		
		
		
}

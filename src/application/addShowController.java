package application;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

@SuppressWarnings("exports") 
public class addShowController {
	@FXML
    private Button addMovie;

    @FXML
    private Button addShow;

    @FXML
    private Button backButton;

    @FXML
    private Button cancelBookings;

    @FXML
    private Button confirm;

    @FXML
    private TextField movieidTextbox;

    @FXML
    private TextField seatsTextbox;

    @FXML
    private TextField showidTextbox;

    @FXML
    private TextField theatreidTextbox;

    @FXML
    private TextField ticketpriceTextbox;

    @FXML
    private TextField timeTextbox;

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
    
    
  	//confirm add show
  	 @FXML
     void confirmAddShow(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
  		 if(movieidTextbox.getText().trim().isEmpty() || movieidTextbox.getText()==null || seatsTextbox.getText().trim().isEmpty() || seatsTextbox.getText()==null || showidTextbox.getText().trim().isEmpty() || showidTextbox.getText()==null || theatreidTextbox.getText().trim().isEmpty() || theatreidTextbox.getText()==null || ticketpriceTextbox.getText().trim().isEmpty() || ticketpriceTextbox.getText()==null || timeTextbox.getText().trim().isEmpty() || timeTextbox.getText()==null) {
			 Alert alert = new Alert(Alert.AlertType.WARNING);
			 alert.setTitle("Error");
			 alert.setHeaderText("incorrect entry");
			 alert.setContentText("boxes cant be left empty");
			 alert.showAndWait();
		 }
		 else {
			 //code here
			 Show tempshow=new Show();
			 int tempshowid1=Integer.parseInt(showidTextbox.getText());
			 int temptheatreid1=Integer.parseInt(theatreidTextbox.getText());
			 int tempmovieid1=Integer.parseInt(movieidTextbox.getText());
			 String tempshowtime1=timeTextbox.getText();
			 int tempticketprice1=Integer.parseInt(ticketpriceTextbox.getText());
			 int tempseats1=Integer.parseInt(seatsTextbox.getText());
			 tempshow.AddShow(tempshowid1,temptheatreid1,tempmovieid1,tempshowtime1,tempticketprice1,tempseats1);
			 Main m=new Main();
			 m.changeScenes("adminDashboard.fxml");
		 }
     }
    
    
}

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

@SuppressWarnings({ "exports", "unused" })
public class showMoviesController implements Initializable{
	
	@FXML
	private Button bookButton;
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
	
	@Override
	 public void initialize(URL url, ResourceBundle rb) 
	 {		 
		try {
			 //movieid2.setCellValueFactory(new PropertyValueFactory<Movie,Integer>("movieid"));
			 moviename2.setCellValueFactory(new PropertyValueFactory<Movie,String>("moviename"));
			 movierating.setCellValueFactory(new PropertyValueFactory<Movie,String>("rating"));
			 moviereleasedate.setCellValueFactory(new PropertyValueFactory<Movie,String>("releasedate"));
			 movieduration.setCellValueFactory(new PropertyValueFactory<Movie,String>("duration"));
			 moviegenre.setCellValueFactory(new PropertyValueFactory<Movie,String>("genre"));
			 Movie m1=new Movie();
			 oblist=m1.GetMovieList();
			 MovieTable.setItems(oblist);
		 }
		 catch (Exception e1)
		 {
		 }
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
		 
		 
		 //dynamicView.loadBoarderCenter(borderpane,"booking.fxml");
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

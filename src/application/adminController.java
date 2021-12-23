package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

@SuppressWarnings("exports")
public class adminController {
	
	@FXML
	private TextField passwordBox;
	@FXML
	private TextField usernameBox;
	@FXML
	private Button signIn;
	@FXML
	private Label loginMsg;
	@FXML
	private Button back;

	
	@FXML
	public void signInUser(ActionEvent event) throws IOException {
		 if(usernameBox.getText().toString().equals("admin") && passwordBox.getText().toString().equals("1234")) {
			 loginMsg.setText("");
			 Main m=new Main();
			 m.changeScenes("adminDashboard.fxml");
		 }
		 else {
			usernameBox.clear();
			passwordBox.clear();
			loginMsg.setText("incorrect username or password");
		 }
	}
	
	@FXML
    void backToLogin(ActionEvent event) throws IOException {
		Main m=new Main();
		m.changeScenes("login.fxml");
    }
}

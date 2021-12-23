package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import java.io.IOException;

import javafx.event.ActionEvent;

@SuppressWarnings("exports") 
public class registerController {
	
	@FXML
	private TextField regUsernameBox;
	@FXML
	private TextField regPassBox;
	@FXML
	private Button confirm;
	@FXML
	private Button back;
	@FXML
	private TextField cnicBox;
	@FXML
	private TextField emailBox;
	@FXML
	private TextField firstNameBox;
	@FXML
	private TextField lastNameBox;
	@FXML
	private TextField addressBox;

	// Event Listener on Button[#confirm].onAction
	@FXML
	public void confirmRegistration(ActionEvent event) throws IOException {
		if(regUsernameBox.getText().trim().isEmpty() || regUsernameBox.getText()==null || regPassBox.getText().trim().isEmpty() || regPassBox.getText()==null || cnicBox.getText().trim().isEmpty() || cnicBox.getText()==null || emailBox.getText().trim().isEmpty() || emailBox.getText()==null || addressBox.getText().trim().isEmpty() || addressBox.getText()==null || firstNameBox.getText().trim().isEmpty() || firstNameBox.getText()==null || lastNameBox.getText().trim().isEmpty() || lastNameBox.getText()==null) {
			 Alert alert = new Alert(Alert.AlertType.WARNING);
			 alert.setTitle("Error");
			 alert.setHeaderText("incorrect entry");
			 alert.setContentText("boxes cant be left empty");
			 alert.showAndWait();
		 }
		 else {
			 Customer customer=new Customer();
			 String password,name,cnic,email,address,fname,lname,phonenumber = null;
			 name=regUsernameBox.getText();
			 password=regPassBox.getText();
			 cnic=cnicBox.getText();
			 email=emailBox.getText();
			 address=addressBox.getText();
			 fname=firstNameBox.getText();
			 lname=lastNameBox.getText();
			 customer.RegisterUser(name,password,fname,lname,cnic,phonenumber,email,address);
			 Main m=new Main();
			 m.changeScenes("login.fxml");
		 }
	}
	// Event Listener on Button[#back].onAction
	@FXML
	public void goBack(ActionEvent event) throws IOException {
		Main m=new Main();
		 m.changeScenes("login.fxml");
	}
}

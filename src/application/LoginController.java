package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class LoginController implements Initializable {

	
	//*********************THREADING*******************************//
	@FXML 
	private Text text;
	
	textAnimator textAn;
	
	public void initialize(URL url, ResourceBundle resourceBundle) {
		TextOutput textOutput=new TextOutput() {
			@Override		
			public void writeText(String textOut) {
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						text.setText(textOut);
					}
				});
			}
	};
	
	textAn=new textAnimator("Movie Ticketing System",0, textOutput);
	}
	
	
	 @FXML
	 void start(MouseEvent event) {
		 Thread thread = new Thread(textAn);
	     thread.start();
	 }
	
	
	//*********************LOGIN PAGE******************************//
	
	 @FXML
	 private TextField passwordBox;

	 @FXML
	 private Button register;

	 @FXML
	 private Button signIn;

	 @FXML
	 private TextField usernameBox;
	 
	 @FXML
	 private Label loginMsg;
	 
	 @FXML
	 void registerUser(ActionEvent event) throws IOException {
		Main m=new Main();
		m.changeScenes("register.fxml");
	 }

	 @FXML
	 void signInUser(ActionEvent event) throws IOException, InvalidCharacterException {
		
			String username=usernameBox.getText().toString();
			String password=passwordBox.getText().toString();
			Pattern p = Pattern.compile("[^A-Za-z0-9]");
		    Matcher m1 = p.matcher(username);
		    Matcher m2 = p.matcher(password);
		    boolean b1 = m1.find();
		    boolean b2 = m2.find();
		    if(b1 || b2) 
		    {
		    	throw new InvalidCharacterException("Special Characters are not Allowed");
		    }
			Customer customer=new Customer();
			 if(customer.VerifyUser(username,password)) {
				 loginMsg.setText("Welcome!!");
				 Main m=new Main();
				 m.changeScenes("dashboard.fxml");
			 }
			 else {
				usernameBox.clear();
				passwordBox.clear();
				loginMsg.setText("incorrect username or password");
			 }
	 }
	 

}



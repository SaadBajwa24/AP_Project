package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

import javafx.event.ActionEvent;

@SuppressWarnings("exports") 
public class finalPaymentController {
	
	@FXML
	private Button back;
	@FXML
	private Button confirm;
	
	 @FXML
	 private TextField cardnoTextbox;

	 @FXML
	 private TextField cvcTextbox;

	 @FXML
	 private TextField expdateTextbox;

	
	@FXML
	public void backToDash(ActionEvent event) throws IOException {
		Main m=new Main();
		m.changeScenes("dashboard.fxml");
	}

	@FXML
	public void confirmPayment(ActionEvent event) throws IOException {
		
		if(cardnoTextbox.getText().trim().isEmpty() || cardnoTextbox.getText()==null || cvcTextbox.getText().trim().isEmpty() || cvcTextbox.getText()==null || expdateTextbox.getText().trim().isEmpty() || expdateTextbox.getText()==null) {
			 Alert alert = new Alert(Alert.AlertType.WARNING);
			 alert.setTitle("Error");
			 alert.setHeaderText("incorrect entry");
			 alert.setContentText("boxes cant be left empty");
			 alert.showAndWait();
		 }
		 else {
			 
			 //enter code here
			 Main m=new Main();
			 m.changeScenes("dashboard.fxml");
		 }
	}
}

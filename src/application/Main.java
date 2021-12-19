package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	private static Stage stg;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			stg=primaryStage;
			Parent root=FXMLLoader.load(getClass().getResource("login.fxml")); 
			primaryStage.setTitle("movie booking system ");
			Scene scene = new Scene(root,850,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeScenes(String fxml) throws IOException {		//for moving to next scene
		Parent pane=FXMLLoader.load(getClass().getResource(fxml));
		stg.getScene().setRoot(pane);
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}

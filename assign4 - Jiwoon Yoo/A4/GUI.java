package A4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI extends Application{

	public static void main(String[] args) {
		launch(args); 

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource(("GUIBuild.fxml")));
		primaryStage.setScene(new Scene(root, 500, 275));
		primaryStage.show();
		
	}

}

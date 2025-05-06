package biblioteca.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainClass extends Application {

	public void start(Stage primaryStage) {
		Label label = new Label("Hola desde JavaFX en Eclipse!");
		StackPane root = new StackPane(label);
		Scene scene = new Scene(root, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Ejemplo JavaFX");
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

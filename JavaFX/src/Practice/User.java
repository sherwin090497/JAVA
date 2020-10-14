package Practice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class User extends Application implements EventHandler<ActionEvent> {

	Stage window;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Title");
		button = new Button("Click me");
		button.setOnAction(this);

		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);

		window.setScene(scene);
		window.show();
	}

	public void handle(ActionEvent event) {
		if(event.getSource()==button) {
			System.out.println("Success");
		}
	}

}
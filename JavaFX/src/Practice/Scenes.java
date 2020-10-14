package Practice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Scenes extends Application{

	Stage window;
	Scene sceneOne, sceneTwo;

	public static void main(String[] args) {
		launch(args);
	
	}
	
	@Override
	public void start(Stage window) throws Exception{
		
		Label labelOne = new Label("Login Page");
		Button loginButton = new Button("Login");
		loginButton.setOnAction(e -> window.setScene(sceneTwo));
		Button registerButton = new Button("Register");
		registerButton.setOnAction(e -> window.setScene(sceneTwo));
		
		VBox layoutOne = new VBox(10);
		layoutOne.getChildren().addAll(labelOne, loginButton, registerButton);
		layoutOne.setAlignment(Pos.CENTER);
		sceneOne = new Scene(layoutOne, 500,500);
		
		Label labelTwo = new Label("Return");
		Button buttonTwo = new Button("Go Back");
		buttonTwo.setOnAction(e -> window.setScene(sceneOne));
		Button buttonThree = new Button("Click Me!!");
		buttonThree.setOnAction(e -> Alert.display("ALERT!", "You've Been Hacked!"));
		
		VBox layoutTwo = new VBox(10);
		layoutTwo.getChildren().addAll(labelTwo, buttonTwo, buttonThree);
		layoutTwo.setAlignment(Pos.CENTER);
		sceneTwo = new Scene(layoutTwo, 500,500);
		
		window.setScene(sceneOne);
		window.setTitle("Sherwin");
		window.show();
		
	}
	
}

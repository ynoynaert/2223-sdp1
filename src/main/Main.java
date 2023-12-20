package main;

import domein.DomeinController;
import gui.StartController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	@Override
	public void start(Stage primaryStage) {
		try {
			DomeinController dc = new DomeinController();
			StartController root = new StartController(dc);
			
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Splendor");
			primaryStage.setMinWidth(626);
		    primaryStage.setMinHeight(612);
			
			primaryStage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
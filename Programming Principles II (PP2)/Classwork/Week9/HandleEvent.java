package Week9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application{
	
	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// create two buttons
		Button btnOK = new Button("OK");
		Button btnExit = new Button("Exit");
		btnOK.setOnAction(new OKHandler());
		btnExit.setOnAction(new ExitHandler());
		
		//create a HBox
		HBox hb = new HBox();
		hb.setSpacing(10);
		hb.getChildren().addAll(btnOK, btnExit);
		
		//create scene, add scene to stage, show stage
		Scene s = new Scene(hb, 100, 100);
		primaryStage.setScene(s);
		primaryStage.show();
		
	}
	
	class OKHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			System.out.println("OK button pressed!");
			
		}
		
	
		
	}
	
	class ExitHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			System.exit(0);
			
		}
  }

}

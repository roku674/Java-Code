package Week9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ControlCircle extends Application {
	
	CirclePane cp;
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create HBox and buttons
		HBox hb = new HBox();
		hb.setSpacing(10);
		hb.setAlignment(Pos.CENTER);
		Button btnEnlarge = new Button("Enlarge");
		Button btnShrink = new Button("Shrink");
		btnEnlarge.setOnAction(new EnlargeHandler());
		btnShrink.setOnAction(new ShrinkHandler());
		hb.getChildren().addAll(btnEnlarge, btnShrink);
		
		//create BorderPane, create scene etc
		BorderPane bp = new BorderPane();
		bp.setBottom(hb);
		bp.setAlignment(hb, Pos.CENTER);
		cp = new CirclePane();
		bp.setCenter(cp);
		Scene s = new Scene(bp, 200, 150);
		primaryStage.setScene(s);
		primaryStage.show();
	}
	
	class EnlargeHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			cp.enlarge();
			
		}
	}
	
	class ShrinkHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			cp.shrink();
			
		}
	}
		

}

package Week9;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application {
	public static void main(String[] args) {
		launch();
	}
  public void start(Stage primaryStage) {
	  //create a pane
	  Pane pane = new Pane();
	  
	  //add an image view and add it to pane
	  ImageView imageView = new ImageView("http://assets2.ignimgs.com/2015/08/06/darth-vader-crossed-arms-1280jpg-88461e1280wjpg-67c0c2_1280w.jpg");
	  pane.getChildren().add(imageView);
	  
	  //create a path transition
	  PathTransition pt = new PathTransition(Duration.millis(10000), new Line(50, 100, 100, 50), imageView);
	  pt.setCycleCount(5);
	  pt.play(); //start animation
	  
	  Scene scene = new Scene(pane, 250, 200);
	  primaryStage.setTitle("FlagRisingAnimation"); //set the state title
	  primaryStage.setScene(scene); //place the scene in the stage
	  primaryStage.show(); //Display the stage
	  
	  
	  
  }
}

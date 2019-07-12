package Week9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyFirstFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//3.Create a Pane
		Pane p = new Pane();
		
		//8. make an arc
		Arc arc1 = new Arc(150, 80, 80, 30, 35, 5);
		arc1.setFill(Color.RED);
		arc1.setType(ArcType.ROUND);
		p.getChildren().add(new Text(210, 40, "arc1: round"));
		p.getChildren().add(arc1);
		
		Rectangle r = new Rectangle(100, 50);
		p.getChildren().add(r); //adds the square
		r.setStroke(Color.CRIMSON); //Setting color of the outline
		r.setFill(Color.CYAN); //Set color of the box
		r.setX(50); //set x coordinate
		r.setY(25); //set y coordinate
		//6. put stuff inside of the scene
		Rectangle r2 = new Rectangle(150,55);
		p.getChildren().add(r2); //adds the square
		r2.setStroke(Color.CRIMSON); //Setting color of the outline
		r2.setFill(Color.BLACK); //Set color of the box
		r2.setX(25); //set x coordinate
		r2.setY(75); //set y coordinate
		//6. put stuff inside of the scene
		Rectangle r3 = new Rectangle(25,45);
		p.getChildren().add(r3); //adds the square
		r3.setStroke(Color.OLIVE); //Setting color of the outline
		r3.setFill(Color.OLIVE); //Set color of the box
		r3.setX(125); //set x coordinate
		r3.setY(25); //set y coordinate
		Rectangle road = new Rectangle(15000000,1);
		p.getChildren().add(road); //adds the square
		road.setStroke(Color.BLACK); //Setting color of the outline
		road.setFill(Color.BLACK); //Set color of the box
		road.setX(0); //set x coordinate
		road.setY(170); //set y coordinate
		Rectangle road2 = new Rectangle(15000000,1);
		p.getChildren().add(road2); //adds the square
		road2.setStroke(Color.BLACK); //Setting color of the outline
		road2.setFill(Color.BLACK); //Set color of the box
		road2.setX(0); //set x coordinate
		road2.setY(150); //set y coordinate
		

		//7. Creating a circle
		Circle c = new Circle(20);
		p.getChildren().add(c); //adds the circle 
		c.setFill(Color.RED); //color of circle
		c.setStroke(Color.RED); //outline of circle
		c.setCenterX(50); //set x coordinate
		c.setCenterY(150); //set y coordinate
		//c.centerXProperty().bind(p.widthProperty().divide(2)); //keeps it bound
		
		
		//7. Creating a circle
		Circle c2 = new Circle(20);
		p.getChildren().add(c2); //adds the circle 
		c2.setFill(Color.RED); //color of circle
		c2.setStroke(Color.RED); //outline of circle
		c2.setCenterX(150); //set x coordinate
		c2.setCenterY(150); //set y coordinate
		
		//2.Create scene
		Scene s = new Scene(p, 200, 200);
		
		//4.Add the scene to the stage
		primaryStage.setScene(s);
		
		//5.Set title for stage
		primaryStage.setTitle("This is my first FX program");
		
		//1.Show the stage
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch();
	}

}

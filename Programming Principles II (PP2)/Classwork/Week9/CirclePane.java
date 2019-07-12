package Week9;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirclePane extends StackPane {
	private Circle circle;
	
	public CirclePane() {
		
		circle = new Circle(50);
		getChildren().add(circle);
		circle.setStroke(Color.BLUE);
		circle.setFill(Color.AZURE);
	}
	
	public void enlarge() {
		circle.setRadius(circle.getRadius()+ 3);
	}
	public void shrink(){
		if(circle.getRadius() <= 3 ) {
			System.out.println("Radius cannot be reduced further!");
			return;
		}
		circle.setRadius(circle.getRadius() - 3);
		
	}
	
}

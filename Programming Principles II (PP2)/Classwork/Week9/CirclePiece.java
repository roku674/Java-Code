package Week9;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class CirclePiece extends StackPane{
	
private Circle circle;
	
public CirclePiece() {
	
			Circle circle = new Circle(15);
			circle.setStroke(Color.BLUE);
			circle.setFill(Color.AZURE);
			getChildren().add(circle);
			
		
	}
public CirclePiece(Color one) {
	
	Circle circle = new Circle(15);
	circle.setStroke(Color.RED);
	circle.setFill(Color.MAGENTA);
	getChildren().add(circle);
	

}
	/*This is a factorial Tace Stack
	 * public static int factorialLoop(int) {
		int result = 1;
		for(int i = n; i > 0; i--) {
			result = result*i;
		}
		return result;
	} 
	*cant be equal to 0 
	public static int factorial(int n) {
		if(n==0) return 1;
		else return n*factorial(n-1);
	} */

}
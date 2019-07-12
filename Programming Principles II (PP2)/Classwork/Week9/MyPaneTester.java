package Week9;

import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyPaneTester extends Application {

	public static void main(String[] args) {
		launch();
	}


	public void start(Stage primaryStage) throws Exception {
		//create GridPane
		GridPane gp = new GridPane();
		for(int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				Rectangle r1 = new Rectangle(40, 40);
				if(row%2==0 && col%2 ==0) {
					r1.setFill(Color.RED);
				}else if (row%2==1 && col%2==1) {
					r1.setFill(Color.RED);
				}else {
					r1.setFill(Color.BLACK);
				}
				gp.add(r1, row, col);
			}
		}

		
		
		//BorderPane
		BorderPane bp = new BorderPane();
		
		//create HBox
		HBox hb = new HBox();
		hb.setPadding(new Insets(5,5,5,5));
		
		//add images
		Image im = new Image("https://s-media-cache-ak0.pinimg.com/236x/02/28/4a/02284a42ed7c10ee359c58b53ef87a5f.jpg");
		ImageView iv1 = new ImageView(im);
		ImageView iv2 = new ImageView(im);
		ImageView iv3 = new ImageView(im);
		iv2.setFitHeight(100);
		iv2.setFitWidth(100);
		
		iv3.setFitHeight(50);
		iv3.setFitWidth(50);
		iv3.setRotate(90);
		
		hb.getChildren().addAll(iv1, iv2, iv3);
		
		Text top = new Text("This is the top of my BorderPane");
		top.setFont(new Font(40));
		top.setFill(Color.BLUE);
		BorderPane.setAlignment(top, Pos.CENTER);
		Text left = new Text("Left side of Borderpane");
		Text right = new Text("Right side of BorderPane");
		
		
		bp.setTop(top);
		bp.setRight(right);
		bp.setLeft(hb);
		bp.setCenter(gp);
		
		//create a scene
		Scene s = new Scene(bp, 800, 800);
		
		//add to the stage
		primaryStage.setScene(s);
		//show the stage
		primaryStage.show();
	}
}

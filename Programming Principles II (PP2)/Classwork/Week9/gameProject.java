package Week9;

import java.awt.Component;
import java.io.File;
import javax.swing.JOptionPane;
//import Week9.ControlCircle.EnlargeHandler;
//import Week9.ControlCircle.ShrinkHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/* 
 * need to make it so they can jump
 *  this game is called halma
 */


public class gameProject extends Application {
	
	private GridPane gp = new GridPane();
	private Rectangle r = null;
	private Circle c = null;
	private Component frame;
	int[][] gameBoard  = new int[16][16];
	Circle[][] circlePieces  = new Circle[16][16];
	public static void main(String[] args) {
		
		launch();

	}

	public void start(Stage primaryStage) throws Exception {
			
		addGridPane();
		addPiecesTopLeft();
		addPiecesBottomRight();
		
		// Create HBox and buttons
		HBox hb = new HBox();
		hb.setPadding(new Insets(5,5,5,5));
		hb.setSpacing(100);
		hb.setAlignment(Pos.CENTER);
		Button btnInstructions = new Button("Instructions");
		Button btnNewGame = new Button("New Game");
		Button btnExit = new Button("Exit");
		btnInstructions.setOnAction(new InstructionsHandler());
		btnNewGame.setOnAction(new NewGameHandler());
		btnExit.setOnAction(new ExitHandler());
		hb.getChildren().addAll(btnInstructions,btnNewGame, btnExit);
				
		//BorderPane
				BorderPane bp = new BorderPane();
				bp.setBottom(hb);
				bp.setAlignment(hb, Pos.CENTER);
				//cP = new CirclePiece();
				bp.setCenter(gp); 
				bp.setCenter(gp); 
			
		//create a scene
				Scene s = new Scene(bp, 630, 670);			
				//add to the stage
				primaryStage.setScene(s);
				//show the stage
				primaryStage.show();
				primaryStage.setResizable(false);
				//JOptionPane.showMessageDialog(frame, "Player 1's Turn");
		
	} 
	//end of primary stage
	
	private void addGridPane() {
		//create GridPane for the board

				for(int row = 0; row < 16; row++) {
					for (int col = 0; col < 16; col++) {
						Rectangle r1 = new Rectangle(40, 40);
						//r1.setOnMouseClicked(new SquareEventHandler());
						if(row%2==0 && col%2 ==0) {
							r1.setFill(Color.AQUAMARINE);
						}else if (row%2==1 && col%2==1) {
							r1.setFill(Color.AQUAMARINE);
						}else {
							r1.setFill(Color.LIGHTCORAL);
						}
						
						r1.setOnMouseClicked(new SquareEventHandler());
						gp.add(r1, row, col);
						
					}
					
				}
	}
	
	private void addPiecesTopLeft() {
		int count = 5;
		for(int row = 0; row < 5; row++) {
			for (int col = 0; col < count; col++) {
				Circle c = new Circle(15);
				c.setStroke(Color.BLUE);
				c.setFill(Color.AZURE);
		//cp = new CirclePiece();
		c.setOnMouseClicked(new PieceEventHandler());
		GridPane.setHalignment(c, HPos.CENTER);
		GridPane.setValignment(c, VPos.CENTER);
		//gp.getChildren().add(c);
		gp.add(c, col, row);
			}
			if(row !=0)
				count--;
		  }
	}
	private void addPiecesBottomRight() {
		int count = 11;
		for(int row = 15; row > 10; row--) {
			for (int col = 15; col > count-1; col--) {
				Circle c = new Circle(15);
				c.setStroke(Color.BLACK);
				c.setFill(Color.GOLD);
	
		//cp = new CirclePiece(one);
		c.setOnMouseClicked(new PieceEventHandler());
		GridPane.setHalignment(c, HPos.CENTER);
		GridPane.setValignment(c, VPos.CENTER);
		//gp.getChildren().add(c);
		gp.add(c, col, row);
			}
			if(row !=15)
				count++;
		  }
	}
	//pieces only move 1 per and can jump
	public boolean isValid(GridPane gp, int fromX, int fromY, int toX, int toY){
        if(toX == fromX && toY == fromY)
            return false; //cannot move nothing
        if(toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY <0 || fromY > 7)
            return false;
        return true;
    }
	
	//the 3 event handler buttons
	class InstructionsHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			JOptionPane.showMessageDialog(frame,
				    "The game is played by two players seated at opposing corners of the board. "
				    + '\n' + "The game is won by being first to transfer all of one's pieces from one's own camp into the camp in the opposing corner. "
				    + '\n' + "On each turn (PLAYERS MUST TAKE TURNS), a player either moves a single piece to an adjacent open square, or jumps over one or more pieces in sequence."
				    + '\n' + "The board consists of a grid of 16x16 squares."
				    + '\n' + " Each player's camp consists of a cluster of adjacent squares in one corner of the board. These camps are delineated on the board."
				    + '\n' + "For two-player games, each player's camp is a cluster of 19 squares. The camps are in opposite corners."		    
				    + '\n' + "Each player has a set of pieces in a distinct color, of the same number as squares in each camp."
				    + '\n' + "The game starts with each player's camp filled by pieces of their own color."
				    
					+ '\n'  + '\n' +"Play sequence:" + '\n' 

				    //+ '\n' + "Valid (green) and invalid (red) moves of a white pawn in Halma"
				    + '\n' + "Players randomly determine who will move first."
				    + '\n' + "Pieces can move in eight possible directions (orthogonally and diagonally)."
				    + '\n' + "Each player's turn consists of moving a single piece of one's own color in one of the following plays:"
				    + '\n' + "One move to an empty square:"
				   	+ '\n' + "Place the piece in an empty adjacent square."
				   	+ '\n' + "This move ends the play."
				   	+ '\n' + "One or more jumps over adjacent pieces:"
				   	+ '\n' + "An adjacent piece of any color can be jumped if there is an adjacent empty square on the directly opposite side of that piece."
				   	+ '\n' + "Place the piece in the empty square on the opposite side of the jumped piece."
				   	+ '\n' + "The piece that was jumped over is unaffected and remains on the board."
				   	+ '\n' + "After any jump, one may make further jumps using the same piece, or end the play."
				   	+ '\n' + "Once a piece has reached the opposing camp, a play cannot result in that piece leaving the camp."
				   	+ '\n' + "If the current play results in having every square of the opposing camp occupied by one's own pieces, the acting player wins. Otherwise, play proceeds clockwise around the board.",
				    
				    "Instructions",
				    JOptionPane.PLAIN_MESSAGE);
			
		}
	}

	class NewGameHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			Object[] options = {"Reset", "No"};
			int n = JOptionPane.showOptionDialog(frame,
					"Are You sure You'd like to reset the entire game?",
					"RESET WARNING",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,     //do not use a custom Icon
					options,  //the titles of buttons
					options[0]); //default button title
			if (n == JOptionPane.YES_OPTION) {	
				gp.getChildren().remove(c);
				addGridPane();
				addPiecesTopLeft();
				addPiecesBottomRight();
				
				}
	
			}
			
		}
	
	
	class ExitHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			Object[] options = {"Yes", "No"};
			int n = JOptionPane.showOptionDialog(frame,
					"Are You sure You'd like to Exit?",
					"EXIT WARNING",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,     //do not use a custom Icon
					options,  //the titles of buttons
					options[0]); //default button title
			if (n == JOptionPane.YES_OPTION) {
				System.exit(0); 
			}
			
		}
	}
	//
	 class PieceEventHandler implements EventHandler<MouseEvent>{
		@Override
		public void handle(MouseEvent e) {
			c = (Circle)e.getSource();
			int row = gp.getRowIndex(c);
			int col = gp.getColumnIndex(c);
			JOptionPane.showMessageDialog(frame, "piece "+ row + " " + col + " selected");
			//System.out.print("row / col " +row + " " + col);
			//gp.getChildren().remove(c);
			//gp.add(c, col,  row-1);
		}
	}
	 class SquareEventHandler implements EventHandler<MouseEvent>{
			@Override
			public void handle(MouseEvent e) {
				r = (Rectangle)e.getSource();
				int Crow = gp.getRowIndex(c);
				int Ccol = gp.getColumnIndex(c);
				int Rrow = gp.getRowIndex(r);
				int Rcol = gp.getColumnIndex(r);
				//System.out.print("row / col " +row + " " + col);
				
				//0 Diagonal 2 = Horizontal/vertical
				if(Rrow==(Crow+1)&&Rcol==(Ccol+1)&&gameBoard[Rrow][Rcol]==0){
					//1 SouthEast
					gp.getChildren().remove(c);
					gp.add(c, Rcol, Rrow);
					//gameBoard[Crow][Ccol]=0;
					//gameBoard[Crow][Ccol]=1;
					circlePieces[Rrow][Rcol]=c;
					JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
				} 
				else if(Rrow==(Crow+1)&&Rcol==(Ccol-1)&&gameBoard[Rrow][Rcol]==0) {
					//2 SouthWest
					gp.getChildren().remove(c);
					gp.add(c, Rcol, Rrow);
					circlePieces[Rrow][Rcol]=c;
					JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
				} 
				else if(Rrow==(Crow-1)&&Rcol==(Ccol+1)&&gameBoard[Rrow][Rcol]==0) {
					//3NorthEast
					gp.getChildren().remove(c);
					gp.add(c, Rcol, Rrow);
					circlePieces[Rrow][Rcol]=c;
					JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
				} 
				else if(Rrow==(Crow-1)&&Rcol==(Ccol-1)&&gameBoard[Rrow][Rcol]==0) {
					//4NorthWest
					gp.getChildren().remove(c);
					gp.add(c, Rcol, Rrow);
					circlePieces[Rrow][Rcol]=c;
					JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
				}
				//Horizontal vertical doesnt work yet
				else if(Rrow==(Crow)&&Rcol==(Ccol+1)&&gameBoard[Rrow][Rcol]==0) {
					//1??
					gp.getChildren().remove(c);
					gp.add(c, Rcol, Rrow);
					circlePieces[Rrow][Rcol]=c;
					JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
				} 
				else if(Rrow==(Crow+1)&&Rcol==(Ccol)&&gameBoard[Rrow][Rcol]==0) {
					//2??
					gp.getChildren().remove(c);
					gp.add(c, Rcol, Rrow);
					circlePieces[Rrow][Rcol]=c;
					JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
				}
				else if(Rrow==(Crow-1)&&Rcol==(Ccol)&&gameBoard[Rrow][Rcol]==0) {
					//3??
					gp.getChildren().remove(c);
					gp.add(c, Rcol, Rrow);
					circlePieces[Rrow][Rcol]=c;
					JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
				}
				else if(Rrow==(Crow)&&Rcol==(Ccol-1)&&gameBoard[Rrow][Rcol]==0) {
					//3?? 
					gp.getChildren().remove(c);
					gp.add(c, Rcol, Rrow);
					circlePieces[Rrow][Rcol]=c;
					JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
				}
				
				//first set of jumps
				else if(Rrow==(Crow+2)&&Rcol==(Ccol+2)&&gameBoard[Rrow][Rcol]==0) {
					//3?? 
					Object[] options = {"Jump", "No"};
					int n = JOptionPane.showOptionDialog(frame,
							"Is there a piece to jump?",
							"Jumpin them bois up to somethin",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,     //do not use a custom Icon
							options,  //the titles of buttons
							options[0]); //default button title
					if (n == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(frame, "STOP TRYING TO CHEAT DUDE!");
					}
					if (n == JOptionPane.YES_OPTION) {	
						gp.getChildren().remove(c);
						gp.add(c, Rcol, Rrow);
						circlePieces[Rrow][Rcol]=c;
						JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
					}
					
				}
				//2
				else if(Rrow==(Crow-2)&&Rcol==(Ccol+2)&&gameBoard[Rrow][Rcol]==0) {
					//3?? 
					Object[] options = {"Jump", "No"};
					int n = JOptionPane.showOptionDialog(frame,
							"Is there a piece to jump?",
							"Jumpin them bois up to somethin",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,     //do not use a custom Icon
							options,  //the titles of buttons
							options[0]); //default button title
					if (n == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(frame, "STOP TRYING TO CHEAT DUDE!");
					}
					if (n == JOptionPane.YES_OPTION) {	
						gp.getChildren().remove(c);
						gp.add(c, Rcol, Rrow);
						circlePieces[Rrow][Rcol]=c;
						JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
					}
					
				}
				//3
				else if(Rrow==(Crow+2)&&Rcol==(Ccol-2)&&gameBoard[Rrow][Rcol]==0) {
					//3?? 
					Object[] options = {"Jump", "No"};
					int n = JOptionPane.showOptionDialog(frame,
							"Is there a piece to jump?",
							"Jumpin them bois up to somethin",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,     //do not use a custom Icon
							options,  //the titles of buttons
							options[0]); //default button title
					if (n == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(frame, "STOP TRYING TO CHEAT DUDE!");
					}
					if (n == JOptionPane.YES_OPTION) {	
						gp.getChildren().remove(c);
						gp.add(c, Rcol, Rrow);
						circlePieces[Rrow][Rcol]=c;
						JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
					}
					
				}
				
				else if(Rrow==(Crow-2)&&Rcol==(Ccol-2)&&gameBoard[Rrow][Rcol]==0) {
					//3?? 
					Object[] options = {"Jump", "No"};
					int n = JOptionPane.showOptionDialog(frame,
							"Is there a piece to jump?",
							"Jumpin them bois up to somethin",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,     //do not use a custom Icon
							options,  //the titles of buttons
							options[0]); //default button title
					if (n == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(frame, "STOP TRYING TO CHEAT DUDE!");
					}
					if (n == JOptionPane.YES_OPTION) {	
						gp.getChildren().remove(c);
						gp.add(c, Rcol, Rrow);
						circlePieces[Rrow][Rcol]=c;
						JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
					}
					
				}
				//second set of jumps
				else if(Rrow==(Crow)&&Rcol==(Ccol+2)&&gameBoard[Rrow][Rcol]==0) {
					//1 
					Object[] options = {"Jump", "No"};
					int n = JOptionPane.showOptionDialog(frame,
							"Is there a piece to jump?",
							"Jumpin them bois up to somethin",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,     //do not use a custom Icon
							options,  //the titles of buttons
							options[0]); //default button title
					if (n == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(frame, "STOP TRYING TO CHEAT DUDE!");
					}
					if (n == JOptionPane.YES_OPTION) {	
						gp.getChildren().remove(c);
						gp.add(c, Rcol, Rrow);
						circlePieces[Rrow][Rcol]=c;
						JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
					}
					
				}
				else if(Rrow==(Crow+2)&&Rcol==(Ccol)&&gameBoard[Rrow][Rcol]==0) {
					//2
					Object[] options = {"Jump", "No"};
					int n = JOptionPane.showOptionDialog(frame,
							"Is there a piece to jump?",
							"Jumpin them bois up to somethin",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,     //do not use a custom Icon
							options,  //the titles of buttons
							options[0]); //default button title
					if (n == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(frame, "STOP TRYING TO CHEAT DUDE!");
					}
					if (n == JOptionPane.YES_OPTION) {	
						gp.getChildren().remove(c);
						gp.add(c, Rcol, Rrow);
						circlePieces[Rrow][Rcol]=c;
						JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
					}
					
				}
				
				else if(Rrow==(Crow-2)&&Rcol==(Ccol)&&gameBoard[Rrow][Rcol]==0) {
					//3?? 
					Object[] options = {"Jump", "No"};
					int n = JOptionPane.showOptionDialog(frame,
							"Is there a piece to jump?",
							"Jumpin them bois up to somethin",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,     //do not use a custom Icon
							options,  //the titles of buttons
							options[0]); //default button title
					if (n == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(frame, "STOP TRYING TO CHEAT DUDE!");
					}
					if (n == JOptionPane.YES_OPTION) {	
						gp.getChildren().remove(c);
						gp.add(c, Rcol, Rrow);
						circlePieces[Rrow][Rcol]=c;
						JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
					}
					
				}
				else if(Rrow==(Crow)&&Rcol==(Ccol-2)&&gameBoard[Rrow][Rcol]==0) {
					//4?? 
					Object[] options = {"Jump", "No"};
					int n = JOptionPane.showOptionDialog(frame,
							"Is there a piece to jump?",
							"Jumpin them bois up to somethin",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null,     //do not use a custom Icon
							options,  //the titles of buttons
							options[0]); //default button title
					if (n == JOptionPane.NO_OPTION) {
						JOptionPane.showMessageDialog(frame, "STOP TRYING TO CHEAT DUDE!");
					}
					if (n == JOptionPane.YES_OPTION) {	
						gp.getChildren().remove(c);
						gp.add(c, Rcol, Rrow);
						circlePieces[Rrow][Rcol]=c;
						JOptionPane.showMessageDialog(frame, "piece moved to " +Rrow + " " + Rcol+ '\n' + "End Your Turn Please");
					}
					
				}
				else {
					//System.out.println("Rrow/col-Crow/col"+ '\n' + Rrow + " " + Rcol + '\n' + Rcol + " " + Ccol); //Testarooni 
					JOptionPane.showMessageDialog(frame, "illegal move");
				}
				
			}
		}
        
        //win game condition
	/*class WonGameHandler implements EventHandler<ActionEvent> {
      public void handle(ActionEvent arg0) {
    	// logic for win condition
        // if BLUE Bottom Left win call reset handler
        // if BLACK top right win call reset handler
        //JOptionPane.showMessageDialog(frame, "You Won!");
        
      }
    }
    */
}//end of gameProject class	

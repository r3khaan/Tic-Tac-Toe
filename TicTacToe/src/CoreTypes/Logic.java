package CoreTypes;

import java.awt.Rectangle;

import javax.swing.JOptionPane;

public class Logic {
	public Logic() {
		createGame();
	}
		
	public void createGame() {
		runGame();
		createRectangles();
	}
	
	public void runGame() {
		
	}
	public void runGame(int x, int y) {
		  System.out.println("X: " + x + ", Y: " + y);
		  //code start
		  int box = figureRectangle(x, y);
		  
		  if (fillBox(box, DataManager.turn)) {
			  //code end
			  DataManager.board.repaint();
			  
			  int tempplayerwin = checkWin();
			  if (tempplayerwin == 1 || tempplayerwin == 2) {
				  JOptionPane.showMessageDialog(null, "Congrats Player " + tempplayerwin + "!!! You Won!!!");
			  } else if (tempplayerwin == 0) {
				  if (checkCat()) {
					  JOptionPane.showMessageDialog(null, "Cat's Game.");
					  
				  }
			  }
			  
			  DataManager.Functions.switchTurn();
			  
			  
		  }
	}
	
	public void rerun(int x, int y) {
		if (DataManager.inGame) {
			runGame(x, y);
		} else {
			endGame();
		}
	}
	
	public void endGame() {
		
	}
	public void createRectangles() {
		int w = DataManager.FrameWidth;
		int h = DataManager.FrameHeight;
		DataManager.boxes[0] = new Rectangle(0, 0, w/3, h/3);
		DataManager.boxes[1] = new Rectangle(w/3, 0, w/3, h/3);
		DataManager.boxes[2] = new Rectangle(w/3 * 2, 0, w/3, h/3);
		
		DataManager.boxes[3] = new Rectangle(0, h/3, w/3, h/3);
		DataManager.boxes[4] = new Rectangle(w/3, h/3, w/3, h/3);
		DataManager.boxes[5] = new Rectangle(w/3 * 2, h/3, w/3, h/3);

		DataManager.boxes[6] = new Rectangle(0, h/3 * 2, w/3, h/3);
		DataManager.boxes[7] = new Rectangle(w/3, h/3 * 2, w/3, h/3);
		DataManager.boxes[8] = new Rectangle(w/3 * 2, h/3 * 2, w/3, h/3);
		
		for (int i = 0; i < 9; i++) {
			DataManager.slot[i] = 0;
		}
	}
	public int figureRectangle(int x, int y) {
		for (int i = 0; i < 9; i++) {
			if (x > DataManager.boxes[i].getX() && x < DataManager.boxes[i].getX() + DataManager.boxes[i].getWidth() &&
				y > DataManager.boxes[i].getY() && y < DataManager.boxes[i].getY() + DataManager.boxes[i].getHeight()) {
				System.out.println("Pressed box: " + (i + 1));
				return (i);
			}
		}
		
		return 100;
	}
	
	public boolean fillBox(int box, int turn) {
		if (DataManager.slot[box] == 0) {
			DataManager.slot[box] = turn;
			return true;
		} else {
			return false;
		}
	}
	
	public int checkWin() {
		int[] s = new int[9];	//easier to type
		for (int i = 0; i < 9; i++) {
			s[i] = DataManager.slot[i];
		}
		
		for (int i = 1; i <= 2; i++) {
			
			//vertical
			if (s[0] == i && s[3] == i && s[6] == i) {
				DataManager.slot[0] = i + 2;
				DataManager.slot[3] = i + 2;
				DataManager.slot[6] = i + 2;

				return i;
			}
			if (s[1] == i && s[4] == i && s[7] == i) {
				DataManager.slot[1] = i + 2;
				DataManager.slot[4] = i + 2;
				DataManager.slot[7] = i + 2;
				
				return i;
			}
			if (s[2] == i && s[5] == i && s[8] == i) {
				DataManager.slot[2] = i + 2;
				DataManager.slot[5] = i + 2;
				DataManager.slot[8] = i + 2;
				
				return i;
			}
			
			//horizontal
			if (s[0] == i && s[1] == i && s[2] == i) {
				DataManager.slot[0] = i + 2;
				DataManager.slot[1] = i + 2;
				DataManager.slot[2] = i + 2;
				
				return i;
			}
			if (s[3] == i && s[4] == i && s[5] == i) {
				DataManager.slot[3] = i + 2;
				DataManager.slot[4] = i + 2;
				DataManager.slot[5] = i + 2;
				
				return i;
			}
			if (s[6] == i && s[7] == i && s[8] == i) {
				DataManager.slot[6] = i + 2;
				DataManager.slot[7] = i + 2;
				DataManager.slot[8] = i + 2;
				return i;
			}
			
			//diagonal
			if (s[0] == i && s[4] == i && s[8] == i) {
				DataManager.slot[0] = i + 2;
				DataManager.slot[4] = i + 2;
				DataManager.slot[8] = i + 2;
				
				return i;
			}
			if (s[2] == i && s[4] == i && s[6] == i) {
				DataManager.slot[2] = i + 2;
				DataManager.slot[4] = i + 2;
				DataManager.slot[6] = i + 2;
				
				return i;
			}
		}
		
		return 0;
	}
	
	public boolean checkCat() {
		for (int i = 0; i < 9; i++) {
			if (DataManager.slot[i] == 0) {
				return false;
			}
		}
		return true;
	}
	

}

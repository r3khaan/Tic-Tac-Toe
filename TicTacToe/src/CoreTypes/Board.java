package CoreTypes;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JPanel;

import CoreTypes.Enums.GameImage;

public class Board extends JPanel {
	
	Logic gameplay;
	
	public Board() {
		addMouseListener(new MouseAdapter() {
	    	  public void mousePressed(MouseEvent m) { 	          
	    		  gameplay.rerun(m.getX(), m.getY());
	    	  }});
	}
	
	public void initialize() {
		gameplay = new Logic();
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paint(g2);
		
		g2.drawImage(GameImage.BOARD.image(), GameImage.BOARD.imageX(), GameImage.BOARD.imageY(), null);
		
		for (int i = 0; i < 9; i++) {
			if (DataManager.slot[i] == 3) {
				g2.drawImage(GameImage.XHIGHLIGHTEDSYMBOL.image(), DataManager.boxes[i].x, DataManager.boxes[i].y  - 10, null);				
			}
			else if (DataManager.slot[i] == 4) {
				g2.drawImage(GameImage.OHIGHLIGHTEDSYMBOL.image(), DataManager.boxes[i].x, DataManager.boxes[i].y - 9, null);				
			}
			else if (DataManager.slot[i] == 1) {
				g2.drawImage(GameImage.XSYMBOL.image(), DataManager.boxes[i].x, DataManager.boxes[i].y - 10, null);				
			}
			else if (DataManager.slot[i] == 2) {
				g2.drawImage(GameImage.OSYMBOL.image(), DataManager.boxes[i].x, DataManager.boxes[i].y - 12, null);
			}
		}
	}
	
}

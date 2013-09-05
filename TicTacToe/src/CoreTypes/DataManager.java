package CoreTypes;

import java.awt.Rectangle;

public abstract class DataManager {
	//public fields
	
	public static int FrameWidth = 450;
	public static int FrameHeight = 472;
	
	public static boolean inGame = true;
	public static boolean continueLoop = false;	
	public static int[] slot = new int[9];
	public static int turn = 1;
	public static Rectangle[] boxes = new Rectangle[9];
	public static boolean canSwitchTurn = false;

	
	public static Board board;
	
	public static class Functions {
		public static void switchTurn() {
			System.out.println("turn = " + DataManager.turn);
			if (DataManager.turn == 1) {
				DataManager.turn = 2;
			} else if (DataManager.turn == 2) {
				DataManager.turn = 1;
			}
		}
	}
}

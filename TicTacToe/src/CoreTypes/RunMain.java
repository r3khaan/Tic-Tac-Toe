package CoreTypes;
import javax.swing.JFrame;

public class RunMain extends JFrame{
	
	public RunMain() {
		super("Tic-Tac-Toe");
		setSize(DataManager.FrameWidth, DataManager.FrameHeight);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		DataManager.board = new Board();
		add(DataManager.board);
		DataManager.board.initialize();
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new RunMain();
	}
}

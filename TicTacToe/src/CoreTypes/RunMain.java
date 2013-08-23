package CoreTypes;
import javax.swing.JFrame;

public class RunMain extends JFrame{
	
	public RunMain() {
		super("Tic-Tac-Toe");
		setSize(225, 225);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new RunMain();
	}
}

package Test;

import javax.swing.JFrame;

public class test2 extends JFrame {
	public test2() {
		super("hello");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		add(new test1());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new test2();
	}
}

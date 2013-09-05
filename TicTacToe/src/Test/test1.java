package Test;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class test1 extends JPanel {

  public test1() {

      addMouseListener(new MouseAdapter() {
    	  public void mousePressed(MouseEvent m) { 
          System.out.println(m.getX()); 
      }}); 

  }

}
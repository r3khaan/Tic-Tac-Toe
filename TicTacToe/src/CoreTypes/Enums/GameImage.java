package CoreTypes.Enums;

import java.awt.Image;
import javax.swing.ImageIcon;


public enum GameImage implements IGameImage {
	XSYMBOL("/Users/rehaanamaan/Documents/GitHub/TicTacToe/TicTacToe/src/Images/x.png", 0, 0),
	XHIGHLIGHTEDSYMBOL("/Users/rehaanamaan/Documents/GitHub/TicTacToe/TicTacToe/src/Images/xh.png", 0, 0),
	OSYMBOL("/Users/rehaanamaan/Documents/GitHub/TicTacToe/TicTacToe/src/Images/o.png", 0, 0),
	OHIGHLIGHTEDSYMBOL("/Users/rehaanamaan/Documents/GitHub/TicTacToe/TicTacToe/src/Images/oh.png", 0, 0),
	BOARD("/Users/rehaanamaan/Documents/GitHub/TicTacToe/TicTacToe/src/Images/boardimg.png", 0, 0);
	
	GameImage(String path, int xpos, int ypos) {
		if (path == null) {
			_imageIcon = null;
			_image = null;
		} else {
			_imageIcon = new ImageIcon(path);
			_image = _imageIcon.getImage();
		}
		
		_imageX = xpos;
		_imageY = ypos;

	}

	private Image _image;
	private ImageIcon _imageIcon;
	private int _imageX;
	private int _imageY;
	
	
	@Override
	public Image image() {
		return _image;
	}
	
	@Override
	public int imageX() {
		return _imageX;
	}
	
	@Override
	public int imageY() {
		return _imageY;
	}

}

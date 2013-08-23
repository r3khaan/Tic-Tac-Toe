package CoreTypes.Enums;

import java.awt.Image;
import javax.swing.ImageIcon;


public enum GameImage implements IGameImage {
	XSYMBOL(null),
	YSYMBOL(null),
	BOARD(null);
	
	GameImage(String path) {
		if (path != null) {
			_imageIcon = null;
			_image = null;
		} else {
			_imageIcon = new ImageIcon(path);
			_image = _imageIcon.getImage();
		}
	}

	private Image _image;
	private ImageIcon _imageIcon;
	
	@Override
	public Image image() {
		return _image;
	}
	


}

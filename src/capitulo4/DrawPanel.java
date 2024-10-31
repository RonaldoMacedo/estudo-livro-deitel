package capitulo4;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth();
		int heigh = getHeight();
		
		g.drawLine(0, 0, width, heigh);
		
		g.drawLine(0, heigh, width, 0);
	}

}

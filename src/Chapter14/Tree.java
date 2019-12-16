package Chapter14;



import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Canvas;

public class Tree extends Canvas {
	public Tree() {
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window) {
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA", Font.BOLD, 12));
		window.drawString("Lab14h - Tree Lab", 50, 50);

		tree(window);
		star(window);

	}

	public void tree(Graphics window) {
		int[] treeXPoints = { 400, 200, 600 };
		int[] treeYPoints = { 100, 500, 500 };
		Polygon tree = new Polygon(treeXPoints, treeYPoints, treeXPoints.length);
		window.setColor(Color.GREEN);
		window.fillPolygon(tree);
		window.setColor(Color.BLUE);
		window.fillRect(380, 500, 40, 100);
		
		window.setColor(Color.RED);
		window.fillOval(385, 300, 40, 40);
	}

	public void star(Graphics window) {
		int[] starXPoints = { 380, 400, 420};
		int[] starYPoints = { 80, 120, 80};
		int[] starXPoints2 = { 380, 400, 420};
		int[] starYPoints2 = { 110, 70, 110};
		Polygon star = new Polygon(starXPoints, starYPoints, starXPoints.length);
		Polygon star2 = new Polygon(starXPoints2, starYPoints2, starXPoints2.length);

		window.setColor(Color.YELLOW);
		window.fillPolygon(star);
		window.fillPolygon(star2);
	}
}
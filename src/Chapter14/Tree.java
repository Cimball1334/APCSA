//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

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
        int[] treeXPoints = {400, 200, 600};
        int[] treeYPoints = {100, 500, 500};
        Polygon tree = new Polygon(treeXPoints, treeYPoints, treeXPoints.length);
        window.setColor(Color.GREEN);
        window.fillPolygon(tree);
        window.setColor(Color.BLACK);
        window.fillRect(400, 500, 10, 100);
        window.setColor(Color.RED);
        window.fillOval(350,300,30,30);
    }

    public void star(Graphics window) {
		int[] starXPoints = {399, 405, 390, 408, 393};
		int[] starYPoints = {80, 98, 86, 86, 98};
		Polygon star = new Polygon(starXPoints, starYPoints, starXPoints.length);
		window.setColor(Color.YELLOW);
		window.fillPolygon(star);
    }
}
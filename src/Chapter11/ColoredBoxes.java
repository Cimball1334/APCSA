package Chapter11;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

class ColoredBoxes extends Canvas
{
	public ColoredBoxes()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
	  	window.drawString("Graphics Lab Lab11g ", 20, 40 );
	  	window.drawString("Drawing boxes with nested loops ", 20, 80 );

	  	drawBoxes(window);
	}

	public void drawBoxes(Graphics window)
	{
		int x =25, y = 100;
		for(int i = 0; i < 9; i++) {
			//each row
			for(int a = 0; a < 9; a++) {
				//each box in that row
				window.setColor(Color.BLUE);
				window.fillRect(x, y, 40, 40);
				x+= 50;
				
			}
			y+= 50;
			x=25;
		
		}
	}
}
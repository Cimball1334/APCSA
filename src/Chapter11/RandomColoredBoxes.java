package Chapter11;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JPanel;

public class RandomColoredBoxes extends JPanel
{
	private Timer timer;
	private final static int SLEEP = 110;
	
	
	public RandomColoredBoxes()
	{		
		setBackground(Color.BLACK);
		setVisible(true);

		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				repaint();  
			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}	

	public void paintComponent( Graphics window )
	{
		super.paintComponent(window);
		
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
	  	window.drawString("Graphics Lab Lab11k ", 20, 40);
	  	window.drawString("Drawing boxes with nested loops ", 20, 80);

	  	drawBoxes(window);
	}

	public void drawBoxes(Graphics window)
	{
		//for loop to to across the x - getWidth() might be useful
		int x =25, y = 100;
		for(int i = 0; i < 9; i++) {
			//each row
			for(int a = 0; a < 9; a++) {
				//each box in that row
				Color the = new Color((int)(Math.random() *256) , (int)(Math.random()*256), (int)(Math.random() * 256), 100);
				window.setColor(the);
				window.fillRect(x, y, 40, 40);
				x+= 50;
			}
			y+= 50;
			x=25;
		
		}
			
	}
}
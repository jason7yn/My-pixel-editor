import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.*;

public class DrawListener implements ActionListener,MouseListener,
MouseMotionListener {
	private Color color=Color.BLACK;
	private Graphics g;
	private String str;
	private int x1,y1,x2,y2;
	private JButton currentColor;
	public void setG(Graphics g) {
		this.g=g;
	}
	public void setCurrentColor(JButton currentColor) {
		this.currentColor=currentColor;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("")) {
			JButton jb =(JButton) e.getSource();
			color=jb.getBackground();
			currentColor.setBackground(color);
			System.out.println("color = "+color);
			
		}
		else {
			JButton button =(JButton) e.getSource();
			str=button.getActionCommand();
			System.out.println("Tool = "+str);
		}
	}
	@Override
    public void mouseDragged(MouseEvent e) {
		if ("Pencil".equals(str)) {
            int x, y;
            x = e.getX();
            y = e.getY();
            g.drawLine(x, y, x1, y1);
            x1 = x;
            y1 = y;
        }
		else if(str.equals("Bucket")){			
			//	g.setStroke(new BasicStroke(2));	  							
			//	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);				
			for(int k=0;k<20;k++){					
				Random i=new Random();       					
				int a=i.nextInt(10);					
				int b=i.nextInt(20);
				int x, y;
		        x = e.getX();
		        y = e.getY();
				g.drawLine(x+a, y+b, x1+a, y1+b);	
				x1=x;
				y1=y;
				}
		}

			

			 
        
    }
	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		g.setColor(color);
		x1=e.getX();
		y1=e.getY();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		x2=e.getX();
		y2=e.getY();
		if(str.equals("Line")) {
			g.drawLine(x1,y1,x2,y2);
		}
	}
	@Override 
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {}
	
	

}

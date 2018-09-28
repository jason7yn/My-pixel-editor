import javax.swing.*;
import java.awt.*;
public class mainFrame extends JFrame {
	public static void main(String args[]) {
		mainFrame mf = new mainFrame();
		mf.initUI();
		
	}
	public void initUI() {
		setTitle("Art Drawboard");//title of frame
		setSize(1200,900);//size of frame,1200=width,900=height
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set menu bar
		Menubar menu = new Menubar();
		JMenuBar m1 = menu.buildMenu();
		setJMenuBar(m1);
		//set layout of the frame
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);
		this.setResizable(true);//resizable of frame
		
		//create new panel for tool buttons 
		String buttonName[] = 
			{"Pencil","Eraser","Line","Bucket","Droplet","Select",
					"Cut","Crop","Text"};
		JPanel toolPanel = new JPanel(new GridLayout(9,1,10,10));
		toolPanel.setPreferredSize(new Dimension(100,800));
		for(int i=0;i<buttonName.length;i++) {
			JButton jbutton= new JButton(buttonName[i]);
			toolPanel.add(jbutton);
		}
		//create drawboar
				JPanel drawBoard = new JPanel();
				drawBoard.setPreferredSize(new Dimension(970,800));
				drawBoard.setBackground(Color.WHITE);
		
		//create color board
		Color[] colorArray= { Color.BLUE, Color.GREEN, Color.RED, 
                Color.BLACK,Color.ORANGE,Color.PINK,Color.CYAN,
                Color.MAGENTA,Color.DARK_GRAY,Color.GRAY,
                Color.LIGHT_GRAY,Color.YELLOW};
		JPanel colorBoard = new JPanel(new GridLayout(1,colorArray.length,3,3));
		for(int i=0;i<colorArray.length;i++) {
			JButton button = new JButton();
			button.setBackground(colorArray[i]);
			button.setPreferredSize(new Dimension(30,30));
			colorBoard.add(button);
		}
		this.add(toolPanel);
		this.add(drawBoard);
		this.add(colorBoard);
		JButton currentColor = new JButton();
		currentColor.setPreferredSize(new Dimension(40,40));
		currentColor.setBackground(Color.BLACK);
		add(currentColor);
		setVisible(true);
		
		
	}

}

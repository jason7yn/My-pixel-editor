import javax.swing.*;
import java.awt.*;
public class Menubar extends JMenuBar {
	public Menubar() {
		
	}
	public JMenuBar buildMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu file,edit,help;
		file =buildFileMenu();
		edit =buildEditMenu();
		help =buildHelpMenu();
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		return menuBar;
	}
	public JMenu buildFileMenu() {
		JMenu fileMenu = new JMenu("File");
		JMenuItem create,open,save,exit;
		create = new JMenuItem("New");
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		exit = new JMenuItem("Exit");
		fileMenu.add(create);
		fileMenu.add(open);
		fileMenu.add(save);
		fileMenu.add(exit);
		return fileMenu;
	}
	public JMenu buildEditMenu() {
		JMenu editMenu = new JMenu("Edit");
		JMenuItem undo,redo,setting;
		undo = new JMenuItem("Undo");
		redo = new JMenuItem("Redo");
		setting = new JMenuItem("Setting");
		editMenu.add(undo);
		editMenu.add(redo);
		editMenu.add(setting);
		return editMenu;
	}
	public JMenu buildHelpMenu() {
		JMenu helpMenu = new JMenu("Help");
		JMenuItem option1,option2;
		option1 = new JMenuItem("Need Help?");
		option2 = new JMenuItem("Not going to Help");
		helpMenu.add(option1);
		helpMenu.add(option2);
		return helpMenu;
	}
	

}

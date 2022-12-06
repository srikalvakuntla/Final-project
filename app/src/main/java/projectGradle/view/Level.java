package projectGradle.view;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


import projectGradle.controller.ControllerLevelButton;
import projectGradle.*;

public class Level{
	public static void levelSelection(JFrame jframe, boolean easyGame, boolean mediumGame, boolean hardGame){
		
		//deleting the all the panels on the jFrame
		jframe.getContentPane().removeAll();
		jframe.setTitle("Connnecting dots-level");
		
		// level panel is created in secondFrame class which takes boolean value to know the status of the level 
		SecondFrame secondPanel = new SecondFrame(easyGame,mediumGame,hardGame);
		//adding second panel is added to Jframe
		jframe.add(secondPanel.secondPanel);
		jframe.pack();
		jframe.setVisible(true);
		jframe.setResizable(true);
		
		ControllerLevelButton.levelButtons(secondPanel, jframe, easyGame, mediumGame, hardGame);
	}
	
	
	
}

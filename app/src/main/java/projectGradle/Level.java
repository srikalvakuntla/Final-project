package projectGradle;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Level{
	static void levelSelection(JFrame jframe){
		jframe.getContentPane().removeAll();
		SecondFrame secondPanel = new SecondFrame();
		jframe.add(secondPanel.secondPanel);
		jframe.pack();
		jframe.setVisible(true);
		jframe.setResizable(true);
		
		//level selection 
		secondPanel.easy.addActionListener(e -> System.out.println("easy"));
		
		secondPanel.medium.addActionListener(e -> System.out.println("medium"));
		
		secondPanel.hard.addActionListener(e -> System.out.println("hard"));
	}
	
}

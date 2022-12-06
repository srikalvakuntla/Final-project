
package projectGradle.controller;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.Font;
import java.util.ArrayList; 

import java.util.Date; 
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;

import projectGradle.*;
import projectGradle.view.*;


public class ControllerLevelButton{

	public static void levelButtons(SecondFrame secondPanel, JFrame jframe, boolean easyGame,boolean mediumGame, boolean hardGame){
		//open easy game if easy button is pressed
		secondPanel.easy.addActionListener(e -> Easy.easy1(jframe, mediumGame,hardGame));
		
		//open medium game if medium button is pressed
		secondPanel.medium.addActionListener(e -> Medium.medium1(jframe,easyGame,hardGame));
		
		//open hard game if hard button is pressed
		secondPanel.hard.addActionListener(e -> Hard.hard1(jframe,easyGame,mediumGame));
		
		// if all 3 games are completed then close and reset buttons are enabled
		if (!easyGame & !mediumGame & !hardGame){
			//reset the game by making all 3 games to true-> game not won, false-> game won
			secondPanel.resetGame.addActionListener(e -> Level.levelSelection(jframe,true,true,true));
			// close the Jframe
			secondPanel.endGame.addActionListener(e -> jframe.dispose());
	}
	}
}

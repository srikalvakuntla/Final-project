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

import projectGradle.view.*;

public class ControllerStartButton{


	public static void startButton(JButton start, JFrame frame){
		//if the continue button is clicked then it moves to next panel which is level panel
		// initial all are true as there aren't finished true-> game loose; false-> game won
		start.addActionListener(e -> Level.levelSelection(frame, true,true,true));
	}
	
}

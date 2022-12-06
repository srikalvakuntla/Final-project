package projectGradle.model;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

//import projectGradle.RotatedIcon;
import projectGradle.view.Easy;

public class EasyModel{

	public static ArrayList easyDegree(){
		ArrayList<Integer> degree = new ArrayList<Integer>();
		// as we have 4 switches are creating 4 degrees 
		for ( int i=0;i<4;i++){
			degree.add(0);
		}
		return degree;
	}
	
	public static ArrayList easyBoolean(){
		ArrayList<Boolean> b = new ArrayList<Boolean>();
		
		//first we got power suppy thats why we are making it true
		b.add(true);
		
		// remaing all are false as there aren't connected to the power suppy 
		for(int i =0;i<5;i++){
			b.add(false);
	}
		return b ;
	}
	
	public static ArrayList easyLabel(){
		
		ArrayList<JLabel> arrayLabel = new ArrayList<JLabel>();
		
		//creatring the image icons 
		ImageIcon s1 = new ImageIcon("offswitch.png");
		ImageIcon s2 = new ImageIcon("offswitch.png");
		ImageIcon s3 = new ImageIcon("offswitch.png");
		ImageIcon s4 = new ImageIcon("offswitch.png");
		ImageIcon power = new ImageIcon("power.png");
		ImageIcon bulbOff = new ImageIcon("bulb.png");	
		
		// Jlabel for first image icons
		JLabel labels1 = new JLabel();
		JLabel labels2 = new JLabel();
		JLabel labels3 = new JLabel();
		JLabel labels4 = new JLabel();
		JLabel powerLabel= new JLabel();
		JLabel bulbLabel = new JLabel();
		
		//positions of the Jlabel
		labels1.setBounds(148, 120, 36, 10);
		labels2.setBounds(148, 158, 36, 10);
		labels3.setBounds(148, 196, 36, 10);
		labels4.setBounds(148, 224, 36, 10);
		powerLabel.setBounds(135,23,60,80);
		bulbLabel.setBounds(133,239,60,80);
		
		//add Image to the label
		labels1.setIcon(s1);
		labels2.setIcon(s2);
		labels3.setIcon(s3);
		labels4.setIcon(s4);
		powerLabel.setIcon(power);
		bulbLabel.setIcon(bulbOff);
		
		//adding the labels to the arraylist for easy accessing them in for loop
		arrayLabel.add(powerLabel);
		arrayLabel.add(labels1);
		arrayLabel.add(labels2);
		arrayLabel.add(labels3);
		arrayLabel.add(labels4);
		arrayLabel.add(bulbLabel);
		
		return arrayLabel;
	}
	
	public static boolean switchCheck(int startIndex, Easy easyObject){
		
		// bulb is off in the begining 
		boolean gameWon=false;
		
		// for loop starts from current switch to the end AKA bulb 
		for( int i= startIndex ; i<easyObject.arrayLabel.size() ; i++){
			
					// bulb don't rotate so here we just update the bulb 
					if (i==easyObject.arrayLabel.size()-1){
						
						//if previous switch is ON and the current label touchs the previous label 
						if( easyObject.arrayOnOff.get(i-1) & intersects(easyObject.arrayLabel.get(i),easyObject.arrayLabel.get(i-1))){
							easyObject.arrayLabel.get(i).setIcon(new ImageIcon("onbulb.png"));
							gameWon=true;
						}
						
						// if it is false in anyone conditions 
						else{
							easyObject.arrayLabel.get(i).setIcon(new ImageIcon("bulb.png"));
						}
					}
					
					//if previous switch is ON and the current label touchs the previous label 
					else if(easyObject.arrayOnOff.get(i-1) & intersects(easyObject.arrayLabel.get(i),easyObject.arrayLabel.get(i-1))){
						easyObject.arrayLabel.get(i).setIcon(new RotatedIcon(new ImageIcon("onswitch.png"), easyObject.degree.get(i-1)));
						easyObject.arrayOnOff.set(i,true);
					}
					
					// if it is false in anyone conditions 
					else{
						easyObject.arrayLabel.get(i).setIcon(new RotatedIcon(new ImageIcon("offswitch.png"), easyObject.degree.get(i-1)));
						easyObject.arrayOnOff.set(i,false);
					}
				}
				
		// return the true if bulb is on 
		return gameWon;
		
	}
	
	static boolean intersects(JLabel testa, JLabel testb){
			Rectangle rectB = testb.getBounds();

			Rectangle result = SwingUtilities.computeIntersection(testa.getX(), testa.getY(), testa.getWidth(), testa.getHeight(), rectB);

			return (result.getWidth() > 0 && result.getHeight() > 0);
	}
	

}

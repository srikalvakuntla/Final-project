package light;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SecondFrame extends JButton implements ActionListener{
JFrame mainFrame;
JPanel firstPanel;
JPanel secondPanel;
JLabel firstLabel;
JButton start;

JButton easy;
JButton medium;
JButton hard;
public SecondFrame(){
	
	// main frame creation
	this.mainFrame = new JFrame("Connecting dots");
	this.mainFrame.setPreferredSize(new Dimension(400, 600));
	this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.mainFrame.pack();
	this.mainFrame.setVisible(true);
	this.mainFrame.setResizable(true);
	
	//main panel creation
	this.firstPanel = new JPanel();
	this.firstPanel.setBackground(new Color(0,255,255));
	this.mainFrame.add(this.firstPanel);
	
	
	
	// Jlabel 
	this.firstLabel = new JLabel();
	this.firstLabel.setText("Select the game level");
	this.firstLabel.setPreferredSize(new Dimension(280, 400));
	this.firstLabel.setFont(new Font("Papyrus", Font.BOLD, 30));
	this.firstPanel.add(this.firstLabel);
	
	
	
	// add jbutton
	this.easy = new JButton("easy");
	this.easy.setFont(new Font("Papyrus", Font.PLAIN, 20));
	this.easy.setBounds(90, 230, 100, 50);
	this.easy.addActionListener(this);
	
	// add jbutton
	this.medium = new JButton("medium");
	this.medium.setFont(new Font("Papyrus", Font.PLAIN, 20));
	this.medium.setBounds(90, 280, 100, 50);
	this.medium.addActionListener(this);
	
	//hard button
	this.hard = new JButton("hard");
	this.hard.setFont(new Font("Papyrus", Font.PLAIN, 20));
	this.hard.setBounds(90, 330, 100, 50);
	this.hard.addActionListener(this);
	
	// add jbutton to the panel
	this.firstLabel.add(this.hard);
	
	// add jbutton to the panel
	this.firstLabel.add(this.medium);
	
	// add jbutton to the panel
	this.firstLabel.add(this.easy);
	
		
}
@Override
public void actionPerformed(ActionEvent action)
    {
		String input =action.getActionCommand();
		System.out.println(input);
		
}



}

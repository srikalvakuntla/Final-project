import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Dummy {
	 int i =0;
	 int j =0;
	 int i1=2;
	 int j1=2;
	 int a=0;
	public static void main(String[] args){
		
		JFrame frame = new JFrame();
		frame.setTitle("Picture Application");
		frame.setPreferredSize(new Dimension(400, 600));
		//frame.setPreferredSize(new Dimension(400, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		ImageIcon pic = new ImageIcon("abc.png");
		ImageIcon pic1 = new ImageIcon("abc.png");
		ImageIcon power = new ImageIcon("power.png");
		ImageIcon bulb = new ImageIcon("bulb.png");
		
		//RotatedIcon pic = new RotatedIcon(pic, 45.0);
		JLabel label = new JLabel();
		JLabel label1 = new JLabel();
		JLabel labelPower = new JLabel();
		JLabel labelBulb = new JLabel();
		
		
		
		//Dimension size = labelPower.getPreferredSize();
		//labelPower.setBounds(100, 100, size.width, size.height);
		
		label.setBounds(150, 115, 36, 10);
		label1.setBounds(149, 146, 35, 15);
		
		labelPower.setBounds(130, 10 , 80,95);
		labelBulb.setBounds(137, 165 , 60, 78);
		
		panel.setBackground(new Color(0,255,240));
	
		label.setIcon(pic);	
		label1.setIcon(pic1);	
		labelPower.setIcon(power);
		labelBulb.setIcon(bulb);
		//labelPower.setIcon(new ImageIcon("power.png"));
		//pic.getImage().flush();
		
		// borders so important 
		//labelBulb.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
		//labelPower.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
		//label.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		//label1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
		
		panel.add(labelBulb);
		panel.add(labelPower);
		panel.add(label);
		panel.add(label1);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		//frame.getContentPane().setBackground(Color. RED);
		Dummy dum = new Dummy();
		
		label.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            dum.i+=90;
            if(dum.i1%2==0){
				label.setBounds(164, 100, 10, 40);
			}
			else{
				
				label.setBounds(150, 115, 35, 10);
			}
			
			pic.getImage().flush();
			if (intersects(label,labelPower)){
				RotatedIcon pic11 = new RotatedIcon(new ImageIcon("dc.png"), dum.i);
				label.setIcon(pic11);	
				
				if (intersects(label,label1)){
					RotatedIcon pic21 = new RotatedIcon(new ImageIcon("dc.png"), dum.j);
					label1.setIcon(pic21);
					}
					
				else{
					RotatedIcon pic21 = new RotatedIcon(new ImageIcon("abc.png"), dum.j);
					label1.setIcon(pic21);
				}
			}
			else{
				RotatedIcon pic11 = new RotatedIcon(new ImageIcon("abc.png"), dum.i);
				label.setIcon(pic11);
				if (!intersects(label,label1)){
					RotatedIcon pic21 = new RotatedIcon(new ImageIcon("abc.png"), dum.j);
					label1.setIcon(pic21);
					
					}
			}
			if (intersects(label1,labelBulb) & intersects(label1,label)){
				labelBulb.setIcon(new ImageIcon("on.png"));
				
			}
			else{
				labelBulb.setIcon(new ImageIcon("bulb.png"));
			}
			dum.i1++;
            
            
        }


    });
    
    label1.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            dum.j+=90;
            
			if(dum.j1%2==0){
				label1.setBounds(163, 137, 10, 40);
			}
			else{
				label1.setBounds(149, 146, 35, 10);
			}
            dum.j1++;
            if (intersects(label,label1)){
				
            RotatedIcon pic21 = new RotatedIcon(new ImageIcon("dc.png"), dum.j);
            label1.setIcon(pic21);
		}
			else{
			RotatedIcon pic21 = new RotatedIcon(new ImageIcon("abc.png"), dum.j);
			label1.setIcon(pic21);
			}
			
			System.out.println(intersects(label1,labelBulb));
			if (intersects(label1,labelBulb) & intersects(label1,label)){
				labelBulb.setIcon(new ImageIcon("on.png"));
				System.out.println("Game Over");
			}
			else{
				labelBulb.setIcon(new ImageIcon("bulb.png"));
			}
        }
    });  
        }
    static boolean intersects(JLabel testa, JLabel testb){
		Rectangle rectB = testb.getBounds();

		Rectangle result = SwingUtilities.computeIntersection(testa.getX(), testa.getY(), testa.getWidth(), testa.getHeight(), rectB);

		return (result.getWidth() > 0 && result.getHeight() > 0);
}
        
        static void easy(){
			
			
		}
	
        
    

}



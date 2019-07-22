package MainDriver;

import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.Color;
import java.awt.Component;

import javax.swing.*;
import java.awt.HeadlessException;


public class Splash extends JWindow{

	//static boolean isRegistered;
	private static JProgressBar progressBar = new JProgressBar();
	private static Splash execute;
	private static int count;
	private static Timer timer1;
	private static int bool=0;
	
	public static int boolCheck() {
		return bool;
	}
	
	public Splash() {
		Container container = getContentPane();
		container.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBorder(new javax.swing.border.EtchedBorder());
		panel.setBackground(new Color(0,255,255));
		panel.setBounds(10, 10, 628, 250);
		panel.setLayout(null);
		container.add(panel);
		
		JLabel label = new JLabel("Student Profiling And Career Analysis");
		label.setFont(new Font("Serif", Font.BOLD, 12));
		label.setBounds(45, 0, 280, 30);
		panel.add(label);
				
		JLabel label2 = new JLabel("LOADING...");
		label2.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 12));
		label2.setBounds(45, 50, 280, 30);
		panel.add(label2);
		
	/*	JLabel label3 = new JLabel(image);
		label2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label2.setBounds(45, 50, 280, 30);
		panel.add(label2);
	*/	
		progressBar.setMaximum(200);
		progressBar.setBounds(55, 180, 250, 15);
		container.add(progressBar);
		loadProgressBar(this);
		setSize(370,215);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void loadProgressBar(Splash exe) {
		ActionListener al = new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				count++;
				progressBar.setValue(count/2);
				System.out.println(count);
				
				if(count==200) {
                    //createFrame();
                    exe.setVisible(false);
                    bool++;
                    timer1.stop();
				}
			}
			
		/*	private void createFrame() throws HeadlessException{
				JFrame frame = new JFrame("STUDENT PROFILING AND CAREER ANALYSIS", null);
				frame.setSize(500, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}*/
		};
		timer1 = new Timer(20, al);
		timer1.start();
	}
	
	/*public static void main(String [] args) {
		execute = new Splash();
	}*/
}

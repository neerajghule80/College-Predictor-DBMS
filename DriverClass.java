package MainDriver;

import Student.*;
import College.*;

/*The User Interface components*/
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Delayed;


public class DriverClass extends JWindow{

	static Splash sp;
	static LoginPage lp;
//	Container theme = getContentPane();
		
	public static void main(String[] args ) throws InterruptedException{
		
		
		sp = new Splash();
		Thread.sleep(4000);
		lp = new LoginPage();
		
	}
}

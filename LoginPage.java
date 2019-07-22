package MainDriver;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

import Server.*;

public class LoginPage extends JWindow{

	static JButton login;
	static JButton enter;
	static JButton enter1;
	static JButton sign_up;
	static JButton LOGIN;
	static JButton SIGN_UP;
	static JButton BACK;
	static DataBase db;
	public static String Name="";
	public static String user = "";
	public static String password = null;
	public static String email="";
	public static String phone="";
	public static String cate="";
	public static String exam="";
	public static String cat_rank="";
	public static String brnh;
	public static String JEE_result;
	public static String GATE_result;
	static JTextField area;
	static JTextField area1;
	static JTextField area2;
	static JTextField area3;
	static	JPasswordField pass_login;
	static	JPasswordField pass_signin;
	static	JPasswordField pass_visib;
	static	JLabel name;
	static	JTextField name_area ;
	static	JLabel id ;
	static	JTextField id_area;
	static	JLabel pword ;
	static	JLabel email1 ;
	static	JLabel cat;
	static	JLabel disc;
	static JLabel rank; 
	static	JTextField email_area; 
	static	JLabel phone1 ;
	static	JTextField phone_area ;
	static  LoginPage obj;
	
	static int details_check=0;
	static int firstPage_check=0;
	static int login_check=0;
	static int sign_check=0;
	static int gate_check=0;
	static int JEE_check=0;
	static int GATE_check=0;
	
	final JTextPane arr=new JTextPane();
	final JTextPane arrG=new JTextPane();
	static final JFrame activity_details=new JFrame("Student Profiling and Career Analysis-Login");
	static final JFrame activity_details1=new JFrame("Student Profiling and Career Analysis-Login");
	static final JFrame activity_firstPage=new JFrame("Student Profiling and Career Analysis-Login");
	static final JFrame activity_loginPage=new JFrame("Student Profiling and Career Analysis-Login");
	static final JFrame activity_signupPage=new JFrame("Student Profiling and Career Analysis-Login");
	static final JFrame activity_printJEE=new JFrame("Student Profiling and Career Analysis-Login");
	static final JFrame activity_printGATE=new JFrame("Student Profiling and Career Analysis-Login");
	
	static JComboBox <String> c;
	static JComboBox <String> xm; 
	static JComboBox <String> brnch;
	
	static int signup_check = 0;
	
	LoginPage(){
		obj=this;
		firstPage();
		//loginPage();
	}
	
	private void firstPage() throws HeadlessException{
		//activity_firstPage= ;
		if(firstPage_check == 0) {
			firstPage_check = 1;
			activity_firstPage.setSize(400, 400);
			activity_firstPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			activity_firstPage.getContentPane().setLayout(new FlowLayout());
			
			JPanel p1 = new JPanel();
			p1.setBounds(80, 80, 300, 50);
			JPanel p2 = new JPanel();
			p2.setBounds(160, 160, 300, 50);
			
			
			LOGIN = new JButton("LOGIN");
			LOGIN.setToolTipText("Press to open login panel");
			LOGIN.setBounds(100, 250, 75, 50);
			
		
			SIGN_UP = new JButton("SIGN UP");
			SIGN_UP.setToolTipText("Press to open sign up panel");
			SIGN_UP.setBounds(100, 250, 75, 50);
			
			TheSecondPage secondPage1 = new TheSecondPage();
			LOGIN.addActionListener(secondPage1);
			
		//	TheSecondPage secondPage2 = new TheSecondPage();
			SIGN_UP.addActionListener(secondPage1);
			
			p1.add(LOGIN);
			p2.add(SIGN_UP);
			activity_firstPage.add(p1);
			activity_firstPage.add(p2);		
			activity_firstPage.setVisible(true);
		}
	}
		
		
	private void loginPage() throws HeadlessException{
			if(login_check == 0) {
				login_check = 1;
				activity_loginPage.setSize(400, 400);
				activity_loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				activity_loginPage.getContentPane().setLayout(new FlowLayout());
				
				JPanel f1 = new JPanel();
				f1.setBounds(0, 0, 300, 50);
				JPanel f2 = new JPanel();
				f2.setBounds(80, 80, 300, 50);
				JPanel f3 = new JPanel();
				f3.setBounds(160, 160, 300, 50);
				
				JLabel id = new JLabel("StudentID");
				id.setBounds(0, 120, 0, 0);
							
				area = new JTextField(20);
				area.setBounds(0, 25,200,20);
				area.setText("Username");
				
				f1.add(id);
				f1.add(area);
				
				JLabel pword = new JLabel("Password");
				id.setBounds(50, 120, 0, 0);
				pass_login = new JPasswordField(20);
				pass_login.setBounds(50, 25,200,20);		
				
				login = new JButton("Login");
				login.setToolTipText("Press to login");
				login.setBounds(100, 250, 75, 50);
				
				TheHandler handler = new TheHandler();
				login.addActionListener(handler);
				
				
				BACK = new JButton("Back");
				BACK.setToolTipText("Go to previous page");
				BACK.setBounds(100, 350, 75, 50);
				
				
				TheBack handler2 = new TheBack();
				BACK.addActionListener(handler2);
				
				
				f2.add(pword);
				f2.add(pass_login);
				f3.add(login);
				f3.add(BACK);
				
				activity_loginPage.add(f1);
				activity_loginPage.add(f2);
				activity_loginPage.add(f3);

			}
			pass_visib=pass_login;	
			activity_loginPage.setVisible(true);
	}

	
	private void signupPage() throws HeadlessException{
		if(sign_check==0) {
			sign_check=1;
			//activity_signupPage= new JFrame("Student Profiling and Career Analysis-Login");
			activity_signupPage.setSize(400, 400);
			activity_signupPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			activity_signupPage.getContentPane().setLayout(new FlowLayout());
			
			JPanel f1 = new JPanel();
			f1.setBounds(0, 0, 300, 50);
			JPanel f2 = new JPanel();
			f2.setBounds(0, 50, 300, 50);
			JPanel f3 = new JPanel();
			f3.setBounds(0, 100, 300, 50);
			JPanel f4 = new JPanel();
			f4.setBounds(0, 150, 300, 50);
			JPanel f5 = new JPanel();
			f5.setBounds(0, 200, 300, 50);
			JPanel f6 = new JPanel();
			f6.setBounds(0, 250, 300, 50);
			
			name = new JLabel("Name    ");	//name
			name.setBounds(0, 40, 0, 0);
						
			name_area = new JTextField(20);
			name_area.setBounds(0, 25,200,20);
			//LoginPage.setNameLogin(name_area.getText());
			
			id = new JLabel("Student ID");	//name_id
			id.setBounds(0, 180, 0, 0);
						
			id_area = new JTextField(20);
			id_area.setBounds(0, 25,200,20);
			//user = id_area.getText();
			
			pword = new JLabel("Password");	//password
			id.setBounds(50, 120, 0, 0);
			
			pass_signin = new JPasswordField(20);
			pass_signin.setBounds(50, 25,200,20);
			//password=pass.getPassword();
		
			email1 = new JLabel("Email ID");	//emailid
			email1.setBounds(0, 160, 0, 0);
						
			email_area = new JTextField(20);
			email_area.setBounds(0, 25,200,20);
			//email = email_area.getText();
		
			phone1 = new JLabel("Phone no");	//phoneno
			phone1.setBounds(0, 200, 0, 0);
				
			phone_area = new JTextField(20);
			phone_area.setBounds(0, 25,200,20);
			//phone = phone_area.getText();
			//	check_user = area.getText().toCharArray();
			
			f1.add(name);
			f1.add(name_area);
			
			f2.add(id);
			f2.add(id_area);
			
			f3.add(pword);
			f3.add(pass_signin);
			
			f4.add(email1);
			f4.add(email_area);
			
			f5.add(phone1);
			f5.add(phone_area);
			
			
			sign_up = new JButton("Sign up");
			sign_up.setToolTipText("Press to signup");
			sign_up.setBounds(100, 250, 75, 50);
			
			TheSignInHandler handler = new TheSignInHandler();
			sign_up.addActionListener(handler);
			
			BACK = new JButton("Back");
			BACK.setToolTipText("Go to previous page");
			BACK.setBounds(100, 350, 75, 50);
			
			TheBack handler1 = new TheBack();
			BACK.addActionListener(handler1);
			
			f6.add(sign_up);
			f6.add(BACK);
			activity_signupPage.add(f1);
			activity_signupPage.add(f2);
			activity_signupPage.add(f3);
			activity_signupPage.add(f4);
			activity_signupPage.add(f5);
			activity_signupPage.add(f6);
			activity_signupPage.setVisible(true);
		}
	}
	
	
	public void enterDetails_page() throws HeadlessException{
		if(details_check==0) {
			gate_check=0;
			details_check=1;
			activity_details.setSize(400, 400);
			activity_details.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			activity_details.getContentPane().setLayout(new FlowLayout());
			
			JPanel f1 = new JPanel();
			f1.setBounds(0, 0, 300, 50);
			JPanel f2 = new JPanel();
			f2.setBounds(80, 80, 300, 50);
			JPanel f3 = new JPanel();
			f3.setBounds(160, 160, 300, 50);
			JPanel f4 = new JPanel();
			f4.setBounds(240, 240, 300, 50);
			
			cat = new JLabel("Category");
			cat.setBounds(0, 120, 0, 0);
						
			
			String [] choice= {"-SELECT-","open","obc","sc","st"};
			c = new JComboBox<String>(choice);
			c.setBounds(50, 120, 0, 0);
			cate = (String)c.getSelectedItem();
			
			
			f1.add(cat);
			f1.add(c);
			
			JLabel exa = new JLabel("Exam");
			exa.setBounds(50, 240, 0, 0);
			String [] choice1= {"-SELECT-","JEE","GATE"};
			xm = new JComboBox<String>(choice1);
			xm.setBounds(50, 120, 0, 0);
			exam = (String)xm.getSelectedItem();
			
			rank = new JLabel("Category_rank");
			rank.setBounds(50, 240, 0, 0);
			
			area3 = new JTextField(20);
			area3.setBounds(50, 25,200,20);		
			cat_rank = area3.getText();
			
			enter = new JButton("Enter");
			enter.setToolTipText("Press to see results");
			enter.setBounds(100, 450, 75, 50);
			
		
			TheEnter handler3 = new TheEnter();
			enter.addActionListener(handler3);
			
			BACK = new JButton("Back");
			BACK.setToolTipText("Go to previous page");
			BACK.setBounds(100, 450, 75, 50);
			
			TheBack handler2 = new TheBack();
			BACK.addActionListener(handler2);
			
			f2.add(exa);
			f2.add(xm);
			f3.add(rank);
			f3.add(area3);
			f4.add(enter);
			f4.add(BACK);
		
			activity_details.add(f1);
			activity_details.add(f2);
			activity_details.add(f3);
			activity_details.add(f4);
		}
		activity_details.setVisible(true);
	}
	
	public void get_colleges() throws HeadlessException{
		db=new DataBase();
		
		if(exam == "GATE") {
			
			activity_details.setVisible(false);
			if(gate_check==0) {
				activity_details1.setSize(400, 400);
				activity_details1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				activity_details1.getContentPane().setLayout(new FlowLayout());
				
				gate_check=1;
				disc = new JLabel("Discipline");
				disc.setBounds(0, 100,0, 0);
				
				String [] choice= {"-SELECT-","computer science","design (mechanical engineering)","structural engg(civil engineering)"};
				brnch = new JComboBox<String>(choice);
				brnch.setBounds(50, 100, 0, 0);
				
				
				activity_details1.add(disc);
				activity_details1.add(brnch);
				
				
				enter1 = new JButton("Enter");
				enter1.setToolTipText("Press to see results");
				enter1.setBounds(100, 450, 75, 50);
				
			
				TheEnter1 handler4 = new TheEnter1();
				enter1.addActionListener(handler4);
			
				
				activity_details1.add(enter1);	
				activity_details1.add(BACK);
				
			}
			activity_details1.setVisible(true);
		}else {
			JEE_result=db.get_JEEcollege(cate, cat_rank);
			printJEE();
		}
	}
	
	public void printJEE() {
		arr.setText(JEE_result);
		if(JEE_check==0) {
			JEE_check=1;
			activity_printJEE.setSize(500, 500);
			activity_printJEE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			activity_printJEE.getContentPane().setLayout(new FlowLayout());
			
			
			arr.setEditable(false);
			
			
			JScrollPane scr = new JScrollPane(arr);
			scr.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			scr.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
			BACK = new JButton("Back");
			BACK.setToolTipText("Go to previous page");
			BACK.setBounds(100, 450, 75, 50);
			
			TheBack handler2 = new TheBack();
			BACK.addActionListener(handler2);
		
			
			activity_printJEE.getContentPane().add(scr);
			activity_printJEE.add(arr);
			activity_printJEE.add(BACK);

		}
				//arr.setText(JEE_result);
				activity_printJEE.setVisible(true);
	}

	public void printGATE() {
		this.arrG.setText(GATE_result);
		if(GATE_check==0) {
			GATE_check=1;
			activity_printGATE.setSize(500, 500);
			activity_printGATE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			activity_printGATE.getContentPane().setLayout(new FlowLayout());
			
			
			this.arrG.setEditable(false);
			
			
			JScrollPane scr = new JScrollPane(arrG);
			scr.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			scr.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
			BACK = new JButton("Back");
			BACK.setToolTipText("Go to previous page");
			BACK.setBounds(100, 400, 75, 50);
			
			TheBack handler5 = new TheBack();
			BACK.addActionListener(handler5);
		
			
			activity_printGATE.getContentPane().add(scr);
			activity_printGATE.add(this.arrG);
			activity_printGATE.add(BACK);

		}
				//arr.setText(JEE_result);
				activity_printGATE.setVisible(true);
	}
	
	/***********************HANDLER CLASSES**************************/
	private class TheHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			int verify;
			activity_loginPage.setVisible(true);
			signup_check=0;
			user=area.getText();
			password=pass_visib.getText();
			if(user.length()!=0 && password.length() != 0) {
				db=new DataBase();
				verify=db.login_verify(user,password);
				if(verify==1) {
					JOptionPane.showMessageDialog(null, "User is Entered\n"+user);
					System.out.println(password);
					signup_check=1;
					area.setText("");
					pass_visib.setText("");
					pass_login.setText("");
				}else if(verify==0){
					JOptionPane.showMessageDialog(null, "Wrong user ID or password.\nNew User? Sign in");
				}
			}else if(user.length() == 0 && password.length() == 0) {
				JOptionPane.showMessageDialog(null, "User and password Not Entered");
			}else if(user.length() == 0) {
				JOptionPane.showMessageDialog(null, "User Not Entered");
			}else if(password.length() == 0) {
				JOptionPane.showMessageDialog(null, "Password Not Entered");
			}
			if(signup_check==1) {
				activity_loginPage.setVisible(false);;
				enterDetails_page();
			}
		}
	}
	
	
	private class TheSecondPage implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == SIGN_UP) {
				signupPage();
				obj.activity_signupPage.setVisible(true);
			}
			else if(event.getSource() == LOGIN) {
				loginPage();
				obj.activity_loginPage.setVisible(true);
			}
		}
	}
	
	private class TheSignInHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			obj.activity_signupPage.setVisible(true);
			Name=name_area.getText();
			user = id_area.getText();
			password=pass_signin.getText();
			email = email_area.getText();
			phone = phone_area.getText();
			System.out.println(Name+" "+user+" "+password+" "+email+" "+phone);
			if(Name.length()==0 || user.length()==0 || password.length()==0 || email.length()==0 || phone.length()==0) {
				JOptionPane.showMessageDialog(null, "Please Enter all the fields");
			}
			else {
				JOptionPane.showMessageDialog(null, "User entered successfully");
				System.out.println("Inserting in database...");
				try {
					db=new DataBase();
					db.insert(Name,user,password,email,phone);
					name_area.setText("");
					id_area.setText("");
					email_area.setText("");
					phone_area.setText("");
					pass_signin.setText("");
					System.out.println("Successfully Inserted in database");
					//signup_check=1;
				}catch(Exception e) {
					System.out.println("LoginPage is Unable to insert "+e.getLocalizedMessage());
				}
				}
			}
	}
	
	private class TheEnter implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			cate = (String)c.getSelectedItem();
			exam = (String)xm.getSelectedItem();
			cat_rank=area3.getText();
			try {
				if(cate == "-SELECT-" || exam == "-SELECT-" || cat_rank.length()==0) {
					JOptionPane.showMessageDialog(null, "Please enter all the required fields");
				}else {
					JOptionPane.showMessageDialog(null, "Successfully entered");
					activity_details.setVisible(false);
					get_colleges();	
					if(exam!="GATE") {
						c.setSelectedIndex(0);
						xm.setSelectedIndex(0);
						area3.setText("");
					}
				}
			}catch(Exception e) {
				System.out.println("Exception while pressing enter "+e);
			}
		}
	}
	
	private class TheEnter1 implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			try {
				brnh = (String)brnch.getSelectedItem();
				System.out.println(brnh);
				GATE_result=db.get_GATEcollege(cate,cat_rank, brnh);
				printGATE();
			}catch(Exception e) {
				System.out.println("Exception while pressing enter1 "+e);
			}
		}
	}
	
	private class TheBack implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			try {
		if(activity_loginPage.isEnabled() ||activity_loginPage.isVisible()) {
					activity_loginPage.setVisible(false);
					activity_loginPage.dispose();
					Thread.sleep(100);
				}
				if(activity_signupPage.isEnabled() || activity_signupPage.isVisible()) {
					activity_signupPage.setVisible(false);
					activity_signupPage.dispose();
					Thread.sleep(100);
				}
				if(activity_details.isEnabled() || activity_details.isVisible()) {
					activity_details.setVisible(false);
					activity_details.dispose();
					Thread.sleep(100);
				}
				if(activity_printJEE.isEnabled() || activity_printJEE.isVisible()) {
					activity_printJEE.setVisible(false);
					activity_printJEE.dispose();
					Thread.sleep(100);
				}
				if(activity_printGATE.isEnabled() || activity_printGATE.isVisible()) {
					activity_printGATE.setVisible(false);
					activity_printGATE.dispose();
					Thread.sleep(100);
				}
				obj.activity_firstPage.setVisible(true);
			}catch(Exception e) {
				System.out.println("in TheBack Class "+e);
			}
			}
	}


}

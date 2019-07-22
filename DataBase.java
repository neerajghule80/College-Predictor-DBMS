package Server;

import MainDriver.*;
import java.sql.*;

public class DataBase {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/proj3";
	
	static final String USER = "root";
	static final String PASS = "tiger";
	
	Connection conn = null;
	PreparedStatement stmt = null;
	Statement st=null;
	
	public DataBase(){
		try{
			Class.forName(JDBC_DRIVER);
			
			System.out.println("Connecting to the database");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected to the databse successfully!");
			
			
			
		}catch(Exception e){
			System.out.println("Unable to connect to the database. " + e.getLocalizedMessage());
		}
	}
	
	public void execute(String query) throws SQLException{
		stmt.execute(query);
	}
	
	public void insert(String name,String user,String pass,String email,String phone) throws SQLException{
		try {
			System.out.println("INSERT INTO student_table(name,name_id,password,email_id,ph_number) values ('"+name+"','"+user+"','"+pass+"','"+email+"','"+phone+"')");
			stmt=conn.prepareStatement("INSERT INTO student_table(name,name_id,password,email_id,ph_number) values(?,?,?,?,?)");
			stmt.setString(1, name);
			stmt.setString(2, user);
			stmt.setString(3, pass);
			stmt.setString(4, email);
			stmt.setString(5, phone);
			stmt.executeUpdate();
		}catch(Exception e){
			System.out.println("Cannot insert "+e.getLocalizedMessage());
		}
		}

	public final int login_verify(String name,String pass) {
		ResultSet rs; 
		st=null;
		try {
			st=conn.createStatement();
			System.out.println("SELECT * FROM student_table WHERE name = '"+name+"' AND password = '"+pass+"'");
			rs= st.executeQuery("SELECT * FROM student_table WHERE name_id = '"+name+"' AND password = '"+pass+"'");
			if(!rs.next()) {
				rs.close();
				return 0;
			}else {
				return 1;
			}
		}catch(Exception e) {
			System.out.println("Exception while login verification in database class "+e); //$NON-NLS-1$
		}
		return 1;
	}
	
	public String get_JEEcollege(String category,String rank) {
		String result="";
		String curr="";
		System.out.println("In the GET JEE COLLEGE method"); //$NON-NLS-1$
		ResultSet rs; 
		this.st=null;
		try {
			this.st=this.conn.createStatement();
			System.out.println("Select distinct col.college_name, col.college_rank,cat.branch FROM "+ //$NON-NLS-1$
					"category_table cat, college_table col, branch_table br,student_table stu WHERE "+	//$NON-NLS-1$
					"col.college_name IN (SELECT col.college_name FROM college_table col WHERE "+	//$NON-NLS-1$
					"col.college_id IN (SELECT cat.college_id FROM category_table cat, college_table "+	//$NON-NLS-1$
					"col WHERE cat.category = '"+category+"' AND cat.cutoff_rank > "+Integer.parseInt(rank)+" AND "+	//$NON-NLS-1$
					"(cat.branch = 'computer engineering' or cat.branch='civil engineering' or "+	//$NON-NLS-1$
					"cat.branch='mechanical engineering'))) AND col.college_rank IN "+	//$NON-NLS-1$
					"(SELECT col.college_rank FROM college_table col WHERE col.college_id IN "+	//$NON-NLS-1$
					"(SELECT cat.college_id FROM category_table cat, college_table col WHERE "+	//$NON-NLS-1$		
					"cat.category = '"+category+"' AND cat.cutoff_rank > "+Integer.parseInt(rank)+" AND (cat.branch ='computer engineering' or "+	//$NON-NLS-1$
					"cat.branch='mechanical engineering' or cat.branch='civil engineering') ) ) "+	//$NON-NLS-1$
					"AND cat.branch IN (SELECT cat.branch FROM category_table cat, college_table "+	//$NON-NLS-1$	
					"col WHERE cat.category = '"+category+"' AND cat.cutoff_rank > "+Integer.parseInt(rank)+" AND "+	//$NON-NLS-1$		
					"(cat.branch= 'computer engineering' or cat.branch= 'mechanical engineering' or cat.branch= 'civil engineering' ))");	//$NON-NLS-1$
			
			
			rs= st.executeQuery("Select distinct col.college_name, col.college_rank,cat.branch FROM "+	//$NON-NLS-1$
					"category_table cat, college_table col, branch_table br,student_table stu WHERE "+	//$NON-NLS-1$
					"col.college_name IN (SELECT col.college_name FROM college_table col WHERE "+	//$NON-NLS-1$
					"col.college_id IN (SELECT cat.college_id FROM category_table cat, college_table "+	//$NON-NLS-1$
					"col WHERE cat.category = '"+category+"' AND cat.cutoff_rank > "+Integer.parseInt(rank)+" AND "+	//$NON-NLS-1$
					"(cat.branch = 'computer engineering' or cat.branch='civil engineering' or "+	//$NON-NLS-1$
					"cat.branch='mechanical engineering'))) AND col.college_rank IN "+	//$NON-NLS-1$
					"(SELECT col.college_rank FROM college_table col WHERE col.college_id IN "+	//$NON-NLS-1$
					"(SELECT cat.college_id FROM category_table cat, college_table col WHERE "+	//$NON-NLS-1$										
					"cat.category = '"+category+"' AND cat.cutoff_rank > "+Integer.parseInt(rank)+" AND (cat.branch ='computer engineering' or "+	//$NON-NLS-1$
					"cat.branch='mechanical engineering' or cat.branch='civil engineering') ) ) "+	//$NON-NLS-1$
					"AND cat.branch IN (SELECT cat.branch FROM category_table cat, college_table "+	//$NON-NLS-1$
					"col WHERE cat.category = '"+category+"' AND cat.cutoff_rank > "+Integer.parseInt(rank)+" AND "+	//$NON-NLS-1$
					"(cat.branch= 'computer engineering' or cat.branch= 'mechanical engineering' or cat.branch= 'civil engineering' ))");	//$NON-NLS-1$
			result+= "College \t\t College Rank\t\t Branch "+"\t"+"\n";	
			
			while(rs.next()) {
					result += rs.getString("college_name")+"\t\t"+rs.getString("college_rank")+"\t\t"+rs.getString("branch")+"\n";
				}
			System.out.println(result);
			}catch(Exception e) {
			System.out.println("Exception while selecting colleges for JEE in database class "+e); //$NON-NLS-1$
		}
		return result;
	}
	
	public String get_GATEcollege(String category,String rank,String PG_prog) {
		String result="";
		String curr="";
		System.out.println("In the GET GATE COLLEGE method"); //$NON-NLS-1$
		ResultSet rs; 
		this.st=null;
		try {
			this.st=this.conn.createStatement();
			System.out.println("Select distinct col.college_name, col.college_rank,cat.branch FROM category_table cat, college_table col, branch_table br,student_table stu WHERE col.college_name IN (SELECT col.college_name FROM college_table col WHERE col.college_id IN (SELECT cat.college_id FROM category_table cat, college_table col WHERE cat.category = '"+category+"' AND cat.cutoff_rank > '"+rank+"' AND cat.branch ='"+PG_prog+"' )) AND col.college_rank IN (SELECT col.college_rank FROM college_table col WHERE col.college_id IN (SELECT cat.college_id FROM category_table cat, college_table col WHERE cat.category = '"+category+"' AND cat.cutoff_rank > '"+rank+"' AND cat.branch ='"+PG_prog+"' ) ) AND cat.branch = '"+PG_prog+"'");	//$NON-NLS-1$
			

			
			rs= st.executeQuery("Select distinct col.college_name, col.college_rank,cat.branch FROM category_table cat, college_table col, branch_table br,student_table stu WHERE col.college_name IN (SELECT col.college_name FROM college_table col WHERE col.college_id IN (SELECT cat.college_id FROM category_table cat, college_table col WHERE cat.category = '"+category+"' AND cat.cutoff_rank > '"+rank+"' AND cat.branch ='"+PG_prog+"' )) AND col.college_rank IN (SELECT col.college_rank FROM college_table col WHERE col.college_id IN (SELECT cat.college_id FROM category_table cat, college_table col WHERE cat.category = '"+category+"' AND cat.cutoff_rank > '"+rank+"' AND cat.branch ='"+PG_prog+"' ) ) AND cat.branch = '"+PG_prog+"'");
			result+= "College \t\t College Rank\t\t Branch "+"\t"+"\n";	
			
			while(rs.next()) {
					result += rs.getString("college_name")+"\t\t"+rs.getString("college_rank")+"\t\t"+rs.getString("branch")+"\n";
				}
			System.out.println(result);
			}catch(Exception e) {
			System.out.println("Exception while selecting colleges for JEE in database class "+e); //$NON-NLS-1$
		}
		return result;
	}
	
	public String select(String exam,String category,String category_rank) throws SQLException{
		ResultSet rs;
		try {
			if(exam == "gate") {
				stmt=conn.prepareStatement("Select col1.college_name,col1.college_rank,br.UG_seats from college_table col1, category_table cat1 WHERE (SELECT cat2.college_id FROM college_table cat2 WHERE cat2.cutoff_rank > student_table."+category_rank+") AND br1.college_id=(SELECT cat2.college_id FROM college_table cat2 WHERE cat2.cutoff_rank > student_table.category_rank)\n" + 
						"\n" +"");
			}else {
				stmt=conn.prepareStatement("Select col1.college_name,col1.college_rank,br.UG_seats from college_table col1, category_table cat1 WHERE (SELECT cat2.college_id FROM college_table cat2 WHERE cat2.cutoff_rank > student_table."+category_rank+") AND br1.college_id=(SELECT cat2.college_id FROM college_table cat2 WHERE cat2.cutoff_rank > student_table.category_rank)\n" + 
						"\n" +"");
			}
			
			}catch(Exception e){
			System.out.println("Cannot insert "+e.getLocalizedMessage());
		}
		rs=stmt.executeQuery();
		return rs.toString();
		}
}

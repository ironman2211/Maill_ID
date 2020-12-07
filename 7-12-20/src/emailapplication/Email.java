package emailapplication;

import java.util.Scanner;

public class Email {
	private String fname;
	private String lname;
	private String department;
	private String password;
	private int defaultpass=10;
	private String email;
	private String company="JAVaMNC";
	private int mailboxcapacity=80;
	private String alternateemail;
	private String setpass;
	Email(){
		System.out.println(mailboxcapacity);
	}

	Email(String fname,String lname){
		
		
		this.fname=fname;
				
		this.lname=lname;
		System.out.println("---MAIL HAS BEEN CREATED--- ");
		this.department=setdepartment();
		System.out.println("\nDEPARTMENT:"+this.department+"\n          WELCOME TO "+this.department.toUpperCase()+"DEPARTMENT");
		email=fname.toLowerCase()+"."+lname.toLowerCase()+"@"+department+company+"."+"com";
		System.out.println("\nYOUR MAIL ID Is : "+email);
		this.password=setpass(defaultpass);
		System.out.println("YOUR PASSWORD IS : "+this.password);
		
			}
	private String setdepartment() {
		System.out.println("ENTER YOUR DEPARTMENTMETAL CODE \n1: SALES \n2:DEVELOPMENT \n3:ACCOUNT");
		Scanner in=new Scanner(System.in);
	    int option=in.nextInt();
	    switch(option) {
	    case 1:return "sales";
	    case 2:return "dev";
	    case 3:return "accont";
	    default:System.out.println("");
	    }
		
		return "";
	}
	
	
	public String setpass(int length) {
		String take="ABCDEFGHIJKLMNOPQRSTUVWXXYZ1234567890@#$%&*";
		char[]v=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random() *take.length());
			v[i]=take.charAt(rand);
			
		}
		return new String (v) ;
	
		
}
	public void setMailboxcapacity(int capacity) {
		this.mailboxcapacity=capacity;
	}
	public void setAltmailid(String altemail) {
		this.alternateemail=altemail;
	}
	public void setPassword(String pass) {
		this.setpass=pass;
	}
	
	
	public String getAltmailid() {return alternateemail;}
	public String getPassword() {return setpass;}
	public int getMailboxcapacity() {
		return mailboxcapacity;
	}
}


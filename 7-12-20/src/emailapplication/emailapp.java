package emailapplication;

import java.util.Scanner;

public class emailapp {

	public static void main(String[] args) {
		System.out.println("ENTER YOUR FIRST NAME and LASTNAME");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();

		Email n=new Email(a,b);
		
	n.setPassword("brahma.7873");
	n.setMailboxcapacity(899);
	n.setAltmailid("ajaynagar@gmail.com");
System.out.println(n.getPassword());
System.out.println(n.getMailboxcapacity());
System.out.println(n.getAltmailid());
	}

}

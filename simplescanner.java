//Yelizaveta Pystina
//CS1B : Assignment One

package assignment_one;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
	
		System.out.print("Welcome." + "\n" +"Please enter a single digit or letter"+ "\n"); 
		System.out.print("Input your choice : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		char ch = s.charAt(0);
		
		
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is an uppercase letter");
		}
		else if (ch >= 'a' && ch <= 'z') {
		System.out.println(ch + " is a lowercase letter");
			
		}
		else if (ch >= '0' && ch <= '9') {
				
			System.out.println(ch + " is a numerical value");	
		}
		else {
			System.out.println(ch + " is an invalid entry. Please try again");
			return;
		}
		
	}
}


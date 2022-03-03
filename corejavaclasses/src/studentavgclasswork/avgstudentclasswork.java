package studentavgclasswork;

import java.text.ParseException;
import java.util.Scanner;

public class avgstudentclasswork {
	//variables
	int studentRoll;
	static int physicsMarks;
	static int socialmarks;
    static int chemistrymrks;
    static int averageMarks;
	
	
	
	Scanner sc  = new Scanner(System.in);
	//methods to access above variables
	void readStudentDetails() throws ParseException {
		System.out.println("Enter Student data:  ");
		System.out.println("Enter student roll:");
		studentRoll = sc.nextInt();
		System.out.println("Enter physics marks:");
		physicsMarks = sc.nextInt();
		System.out.println("Enter sociL marks:");
		socialmarks = sc.nextInt();
		System.out.println("Enter chemistry marks:");
		chemistrymrks= sc.nextInt();
	}
	
		public void avgstudentclasswork() {
			System.out.println( averageMarks = ( physicsMarks + socialmarks + chemistrymrks ) / 3);
		}
	
		
	
	
	void displayStudentDetails(){
		System.out.println("Entered the Student data ...............");
		System.out.println("Student roll number = " + studentRoll);
		System.out.println("Student physics marks = " + physicsMarks);
		System.out.println("Student social marks = " + socialmarks);
		System.out.println("Student chemistry marks = " + chemistrymrks);
		System.out.println("Student average marks = " + averageMarks);
	}

}


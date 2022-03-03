package employe;



import java.text.ParseException;
import java.util.Scanner;

public class EmployeeCRUD {

	employedetailsclasswork[] listOfEmployee = new employedetailsclasswork[30];
	employedetailsclasswork employee;
	int noOfEmployee;
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
public void menu() throws ParseException {
while (ch == 'y') {
	System.out.println("Enter your choice");
			System.out.println("add : to add employe in the array");
			System.out.println("update:to update employe ");
			System.out.println("delete:to delete employe ");
			System.out.println("display: display all employe");
			System.out.println("search: search for a employe");
			sc.nextLine();
			String choice = sc.nextLine();
			switch (choice) {
			case "add":
				addEmployee();
				break;
			case "update":
				updateEmployee();
				break;
			case "delete":
				deleteEmployee();
				break;
			case "display":
				displayEmployee();
				break;
			case "search":
				searchEmployee();
				break;
			default:
				System.out.println("Not perfect");
				break;
			}
System.out.println("continue....??");
			System.out.println("Enter 'y' to continue");
			ch = sc.next().charAt(0);
} 
	}
int count = 0;
	int j=0;
	void searchEmployee() {
		System.out.println("Enter the  employe details for searching ");
		System.out.println("Enter the  employe id for searching");
		int eId = sc.nextInt();
		for (int i = 0; i < noOfEmployee; i++) {
			if(listOfEmployee[i].employeeId == eId) {
				count++;
				j = i;
			}
		}

		if(count > 1) {
			System.out.println("got student ");
			listOfEmployee[j].displayEmployeeDetails();
			}else {
			System.out.println("no student");
		}
	}
	void displayEmployee() {
		System.out.println("Enter  employe details to display");
			for (int i = 0; i < noOfEmployee; i++) {
			if(listOfEmployee[i] == null) {
				continue;
			}
			listOfEmployee[i].displayEmployeeDetails();
		}
	}
void deleteEmployee() {
	System.out.println("Enter student details to delete");
		System.out.println("Enter student id to delete");
		int eId = sc.nextInt();
		for (int i = 0; i < noOfEmployee; i++) {
			if(listOfEmployee[i].employeeId == eId) {
				listOfEmployee[i] = null;
				break;
			}else {
				System.out.println("no employe");
			}
		}
	}

	void updateEmployee() {
		System.out.println("Enter details of employe update");
		int eId = sc.nextInt();
		for (int i = 0; i < noOfEmployee; i++) {
			if(listOfEmployee[i].employeeId == eId) {
				System.out.println("Enter new details of employe to update");
				System.out.println("Enter new email of employe");
				sc.nextLine();
				listOfEmployee[i].employeeEmail = sc.nextLine();
				break;
			}else {
				System.out.println("Employee Not Found");
			}
		}
	}
void addEmployee() throws ParseException {
		System.out.println("Enter the employe details");
		System.out.println("Enter number of employes");
		noOfEmployee = sc.nextInt();
		for (int i = 0; i < noOfEmployee; i++) {
			employee = new employedetailsclasswork();
			employee.readEmployeeDetails();
			listOfEmployee[i] = employee;

		}
	}

}
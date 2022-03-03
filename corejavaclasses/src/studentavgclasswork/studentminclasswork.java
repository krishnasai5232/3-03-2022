package studentavgclasswork;

public class studentminclasswork {
	
	public static void main(String[] args) throws Throwable{
		
		avgstudentclasswork[] sa = new avgstudentclasswork[8];
		avgstudentclasswork student;
	
		for(int i=0;i<sa.length;i++) {
			student = new avgstudentclasswork();
			student.readStudentDetails();
			sa[i] = student;
		}
		
		for(int i=0;i<sa.length;i++) {
		
			sa[i].displayStudentDetails();
		}
		
}

}

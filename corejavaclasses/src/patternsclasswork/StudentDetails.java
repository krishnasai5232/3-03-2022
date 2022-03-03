package patternsclasswork;

 
	public class StudentDetails
	{
	   private String name;
	   private String[] year= {"Freshman","sophomore","Junior","Senior"};
	   private int courses;
	   private double gpa;
	  
	   public StudentDetails()
	   {
	       name = "Sunil Giri";
	       courses = 6;
	       gpa = 4.0;
	   }
	   
	   
	   public StudentDetails(String name, int courses, double gpa)
	   {
	       this.name = name;     
	       this.courses = courses;
	       this.gpa = gpa;
	   }
	   
	   public String getName()
	   {
	       return name; 
	   }
	   public int getCourses()
	   {
	       return courses;
	   }
	   public double getGpa()
	   {
	       return gpa;
	   }
	  
	   
	   public void setName(String name)
	   {
	       this.name=name;
	   }
	   public void setGpa(double gpa)
	   {
	       this.gpa=gpa;
	   }
	   public void setCourses(int courses)
	   {
	       this.courses=courses;
	   }



	public static class studentReal
	    {
	       public static void main(String[] args)
	       {
	    	   StudentDetails student1= new StudentDetails(" ganesh", 4, 9.2);
	    	   StudentDetails student2= new StudentDetails("prasad", 1,7.9);
	    	   StudentDetails student3= new StudentDetails("mahesh babu",5,5.8);
	           System.out.println(student1.getName() + ", Year:- " + student1.year[0]+ ", No of courses:- " + student1.getCourses() + ", GPA:- " + student1.getGpa());
	           System.out.println(student2.getName() + ", Year:- " + student2.year[3]+ ", No of courses:- " + student2.getCourses() + ", GPA:- " + student2.getGpa());
	           System.out.println(student3.getName() + ", Year:- " + student3.year[2]+ ", No of courses:- " + student3.getCourses() + ", GPA:- " + student3.getGpa());
	       }
	    }
	}


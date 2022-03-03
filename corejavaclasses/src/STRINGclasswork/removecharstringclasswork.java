package STRINGclasswork;

public class removecharstringclasswork {
	
	public static void main(String args[])   
	{  
	String str = "Hello+-^Java+ -Programmer^ ^^-- ^^^ +!";  
	str = str.replaceAll("[-+^]*", " ");  
	   //we can also use this regular expression  
	System.out.println(str);  
	}  

}

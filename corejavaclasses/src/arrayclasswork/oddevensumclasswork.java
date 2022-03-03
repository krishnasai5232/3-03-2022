package arrayclasswork;

public class oddevensumclasswork {
	public static void main(String[] args) {
        int[] array = {29,49,59,92,9,93};
        sum(array);
        sum2(array);
}

   public static int sum(int[] y) {
      int sum = 0;
      int i = 0;
      while(i < y.length){
    	   if(i % 2 == 1){ 
    	      sum += y[i];
    	   }
    	   i++;
    	}
      System.out.println("Sum of all odd indexes:"+sum);
      return i;
   }
   
   public static int sum2(int[] y) {
	      int sum = 0;
	      int i = 0;
	      while(i < y.length){
	    	   if(i % 2 == 0){ 
	    	      sum += y[i];
	    	   }
	    	   i++;
	    	}
	      System.out.println("Sum of all even indexes:"+sum);
	      return i;
	   }
}


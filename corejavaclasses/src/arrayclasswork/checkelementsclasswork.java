package arrayclasswork;

public class checkelementsclasswork {
	public static boolean areSame(Integer arr[])
    {
       Integer first = arr[0];
       for (int i=1; i<arr.length; i++)
           if (arr[i] != first)
                return false;
       return true;
    }
 
public static void main(String[] args)
    {
        Integer[] arr = { 5,2,3,4,1,1};
        if (areSame(arr))
            System.out.println("All Elements are Same");
        else
            System.out.println("Not all Elements are Same");
    }
}



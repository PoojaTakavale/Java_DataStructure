import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter M : ");    
        
        int M = scan.nextInt();
       // list<integer> lst = scan.getInt();
              
        ArrayList<Double> numbers = new ArrayList<Double>();
 
     // Scanner in = new Scanner(System.in);
      System.out.println("Please enter a list of numbers: ");
       
      while (scan.hasNextDouble())
      {
         double input = scan.nextDouble();
         numbers.add(input);
      }
        
        for(int i=numbers.size()-1; i>=0 ;i--)
            {
        	
        	System.out.println("Inside for");
                if(numbers.get(i)==  M)
                    {
                	System.out.println("Hurray U got it !!" +i);
                }
        }
        
        
 
        
    }
}
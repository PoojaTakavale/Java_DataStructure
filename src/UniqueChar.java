import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Enter the string :");
		String [] inputarr = new String [12];
		String input = "";
		
		Scanner in = new Scanner(System.in);
		 input = in.nextLine();
		 System.out.println(" Entered string is :" +input);
		 
		 boolean res = isUnique(input);
		 System.out.println("Result " +res);
		 if (res == true)
				 {
			 		System.out.println("Unique");
				 }
		 else
		 {
			 System.out.println("Not Unique");
		 }
	}
	
	public static boolean isUnique(String input)
	{
		 int checker = 0;
		 for(int i = 0; i<input.length();i++)
		 {
			 int val = input.charAt(i) - 'a';
			 if((checker & (1 << val)) > 0)
			 {
				 return false;
			 }
			 checker |= (1<< val);
		 }
		 return true;
	}

}
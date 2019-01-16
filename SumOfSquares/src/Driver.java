import java.util.Scanner;

public class Driver 
{
	 public static void main(String[] args)
	   {
	       System.out.println("Enter positive integer");
	       Scanner scan = new Scanner(System.in);
	       int value = scan.nextInt();
	       //instantiating Utility object
	       sum obj = new sum();
	       //calling method that returns the sum of the positive integer values
	       
	       System.out.println("Sum of first " + value + " squared equals " + obj.sumSquares(value));
	       
	   }
}


public class sum 
{
	  public int sumSquares(int n)
	    {
	        int counter = 1, sum = 0;
	        while(counter <= n)
	        {
	            //multiply counter by itself will makes the positive integer squared
	            sum = sum + counter * counter;
	            counter++;
	        }
	        return sum;
	    }
}

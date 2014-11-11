/*
 * Problem 6
 */
public class PR006SumOfAllFears
{
	public static void main(String[] args)
	{
		final int start = 1;
		final int end = 100;
		
		int sumOfSqures = 0;
		int sum = 0;
		int squareOfSum = 0;
		
		for (int i = start; i <= end; i++)
		{
			final int square = i * i; 
			sum = sum + i;
			sumOfSqures = sumOfSqures + square;
		}
		
		squareOfSum = sum * sum;
		final int result = squareOfSum - sumOfSqures;
		System.out.println(result);
	}
}

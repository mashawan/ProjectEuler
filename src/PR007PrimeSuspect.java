/*
* Problem 7
* 
* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
*
* What is the 10 001st prime number?
*/
public class PR007PrimeSuspect
{
	private int[] mPrimes;
	private int mTargetCount;
	private int mPrimesIndex = 0;
	private int mPrimeCandidate = 2;
	
	public PR007PrimeSuspect(int targetCount)
	{
		mPrimes = new int[targetCount];
		mTargetCount = targetCount;
	}
	
	public int calculate()
	{
		while (mPrimesIndex != mTargetCount)
		{
			if (isPrime(mPrimeCandidate))
			{
				mPrimes[mPrimesIndex] = mPrimeCandidate;
				mPrimesIndex++;
			}
			if (mPrimesIndex < mTargetCount)
			{
				mPrimeCandidate++;
			}
		}
		return mPrimeCandidate;
	}

	private boolean isPrime(int candidate)
	{
		for (int i = 0; i < mPrimesIndex; i++)
		{
			if (candidate % mPrimes[i] == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		final long start = System.currentTimeMillis();
		
		PR007PrimeSuspect primeSuspect = new PR007PrimeSuspect(10001);
		int thePrime = primeSuspect.calculate();
		
		final long end = System.currentTimeMillis();
		final long duration = end - start;
		System.out.println(thePrime + " in " + duration);
	}
}

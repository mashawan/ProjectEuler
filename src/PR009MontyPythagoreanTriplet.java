import java.util.Random;

/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a(2) + b(2) = c(2)
 * 
 * For example, 3(2) + 4(2) = 9 + 16 = 25 = 5(2).
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * 
 * Find the product abc.
 */
public class PR009MontyPythagoreanTriplet
{
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		
		int aCandidate = 0;
		int bCandidate = 0;
		int cCandidate = 0;

		while(!isSpecialPythagoreanTriplet(aCandidate, bCandidate, cCandidate))
		{
			Random random = new Random();

			aCandidate = random.nextInt(500);
			
			bCandidate = random.nextInt(500);
			if (bCandidate < aCandidate)
			{
				bCandidate = random.nextInt(500);
			}
			
			cCandidate = random.nextInt(500);
			if (cCandidate < bCandidate)
			{
				cCandidate = random.nextInt(500);
			}
		}
		
		final int product = aCandidate * bCandidate * cCandidate;
		
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println("Took " + duration + " millis.");
		
		System.out.println("The product of " + aCandidate + " + " + bCandidate + " + " + cCandidate + " = " + product);
	}

	private static boolean isSpecialPythagoreanTriplet(int aCandidate, int bCandidate, int cCandidate)
	{
		long a2 = aCandidate * aCandidate;
		long b2 = bCandidate * bCandidate;
		long c2 = cCandidate * cCandidate;
		
		if (a2 + b2 == c2)
		{
			int specialNumber = 1000;
			if (aCandidate + bCandidate + cCandidate == specialNumber)
			{
				return true;
			}
		}
		return false;
	}
}

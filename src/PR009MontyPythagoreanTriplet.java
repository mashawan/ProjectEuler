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
	private static final int SPECIAL_TOTAL = 1000;

	public static void main(String[] args)
	{
		final int lowestNumberToTry = 1;
		final int loops = (SPECIAL_TOTAL / 2) - lowestNumberToTry;
		
		for (int a = 1; a < loops; a++)
		{
			for (int b = a + 1; b < loops; b++)
			{
				final int specialC = SPECIAL_TOTAL - (a + b);

				if (isPythagoreanTriplet(a, b, specialC))
				{
					final int product = a * b * specialC;
					System.out.println("The product of " + a + " + " + b + " + " + specialC + " = " + product);
					return;
				}
			}
		}
	}

	private static boolean isPythagoreanTriplet(int aCandidate, int bCandidate, int cCandidate)
	{
		long a2 = aCandidate * aCandidate;
		long b2 = bCandidate * bCandidate;
		long c2 = cCandidate * cCandidate;

		if (a2 + b2 == c2)
		{
			return true;
		}
		return false;
	}
}

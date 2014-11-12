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

		final int loops = 500;
		for (int a = 0; a < loops; a++)
		{
			for (int b = a + 1; b < loops; b++)
			{
				int c = 1000 - (a + b);

				if (isSpecialPythagoreanTriplet(a, b, c))
				{
					final int product = a * b * c;

					long end = System.currentTimeMillis();
					long duration = end - start;
					System.out.println("Took " + duration + " millis.");
					System.out.println("The product of " + a + " + " + b + " + " + c + " = " + product);
					return;
				}
			}
		}
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

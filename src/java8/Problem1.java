package java8;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1
{
    public static void main(String[] args)
    {
        final List<Integer> numbers = generateNumbers(1, 1000);
        final List<Integer> criteria = Lists.newArrayList(3,5);

        final int result = numbers.stream()
                .filter(number -> isMultipleOfAllCriteria(number, criteria))
                .mapToInt(i -> i)
                .sum();

        System.out.println("The sum is " + result);
    }

    private static boolean isMultipleOfAllCriteria(Integer i, List<Integer> criteria)
    {
        return criteria.stream()
                .filter(c -> i % c == 0)
                .findAny()
                .isPresent();
    }

    private static List<Integer> generateNumbers(int first, int last)
    {
        final List<Integer> numbers = new ArrayList<>();

        for (int i = first; i <= last ; i++)
        {
            numbers.add(i);
        }
        return numbers;
    }
}

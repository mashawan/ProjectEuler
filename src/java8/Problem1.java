package java8;

import com.google.common.collect.Lists;

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
        final List<Integer> numbers = Lists.newArrayList(1,2,3,4,5,6,7,8,9);
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
}

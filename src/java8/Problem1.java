package java8;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Stream;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1
{
    private static int firstNumber = 1;
    private static final int lastNumber = 1000;

    public static void main(String[] args)
    {
        final Stream<Integer> numbers = Stream.generate(() -> firstNumber++).limit(lastNumber);
        final List<Integer> criteria = Lists.newArrayList(3, 5);

        final int result = numbers
                .filter(number -> isMultipleOfAnyCriteria(number, criteria))
                .mapToInt(i -> i)
                .sum();

        System.out.println("The sum is " + result);
    }

    private static boolean isMultipleOfAnyCriteria(Integer number, List<Integer> allCriteria)
    {
        return allCriteria.stream()
                .filter(criteria -> number % criteria == 0)
                .findAny()
                .isPresent();
    }
}

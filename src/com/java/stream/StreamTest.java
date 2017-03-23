package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("10 is prime number:" + isPrime(10));
        System.out.println("5 is prime number:" + isPrime(5));

        Integer[] num = { 1, 2, 3, 4, 5 };
        List<Integer> numbers = Arrays.asList(num);
        System.out.println(sumWithCondition(numbers, i -> i >= 2));
        System.out.println(sumWithCondition(numbers, i -> i >= 0));
        System.out.println(sumWithCondition(numbers, i -> true));
        System.out.println(sumWithCondition(numbers, i -> i % 2 == 0));

        Integer[] num1 = { 1, 2, 3,7,8,9};
        List<Integer> numbers1 = Arrays.asList(num1);
        System.out.println(findSquareOfMaxOdd(numbers1));
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        // it's range() method returns a sequential ordered IntStream from
        // startInclusive (inclusive) to endExclusive (exclusive) by an
        // incremental step of 1.
        IntStream range = IntStream.range(2, number);
        // noneMatch() method returns whether no elements of this stream match
        // the provided predicate.
        return range.noneMatch(index -> number % index == 0);
    }

    public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
        // i -> i is nothing fancy, takes an i and return straight away.
        return numbers.parallelStream().filter(predicate).mapToInt(i -> i).sum();
    }

    public static int findSquareOfMaxOdd(List<Integer> numbers) {
        // int max = 0;
        // for (int i : numbers) {
        // if (i % 2 != 0 && i > 3 && i < 11 && i > max) {
        // max = i;
        // }
        // }
        // return max * max;
//        return numbers.stream().filter(StreamTest::isOdd).filter(StreamTest::isGreaterThan3)
//                .filter(StreamTest::isLessThan11).max(Comparator.naturalOrder()).map(i -> i * i).get();
        
         Stream<Integer> stream = numbers.stream().filter(StreamTest::isOdd).filter(StreamTest::isGreaterThan3)
                .filter(StreamTest::isLessThan11);
         
         Optional<Integer> optionalStream = stream.max(Comparator.naturalOrder());
         Integer value = optionalStream.map(i -> i * i).get();
        return value;
    }

    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static boolean isGreaterThan3(int i) {
        return i > 3;
    }

    public static boolean isLessThan11(int i) {
        return i < 11;
    }
}

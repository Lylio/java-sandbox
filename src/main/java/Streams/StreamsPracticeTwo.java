package Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamsPracticeTwo {

    public static void main(String[] args) {

        // 1. Integer Stream
        System.out.println("---- Ex. 1 ----");
        IntStream
                .range(1, 10)
                .forEach(System.out::println);

        // 2. Integer Stream with skip
        System.out.println("---- Ex. 2 ----");
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x)); //Lambda for the hell of it

        // 3. Integer Stream with sum
        System.out.println("---- Ex. 3 ----");
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum()
        );

        // 4. Stream.of, sorted and findFirst
        System.out.println("---- Ex. 4 ----");
        Stream.of("Ava", "Anna", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // 5. Stream from Array, sort,filter and print (to be continued www.youtube.com/watch?v=t1-YZ6bF-g0)
        System.out.println("---- Ex. 5 ----");
    }
}

package StringJava8Questions.TheCuriousCoder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddSeparation {


    public static void EvenOdd(List<Integer> myList)
    {
        Map<Boolean, List<Integer>> evenOdd = myList.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(evenOdd);

        //The primary difference between Collectors.partitioningBy and Collectors.groupingBy
        // is that partitioningBy always splits a stream into exactly two groups (true and false),
        // while groupingBy can split a stream into any number of groups based on a key
    }
}

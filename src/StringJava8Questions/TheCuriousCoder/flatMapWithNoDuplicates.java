package StringJava8Questions.TheCuriousCoder;

import java.util.List;
import java.util.stream.Collectors;

public class flatMapWithNoDuplicates {

    public static void flattenedListWithNoDuplicates(List<List<Integer>> listOfLists)
    {
        List<Integer> collect = listOfLists.stream().flatMap(x -> x.stream()).distinct().collect(Collectors.toList());

        System.out.println(collect);


    }



}

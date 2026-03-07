package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapQuestion {
    public static void main(String[] args) {

        //Q: Flatten a list of lists using Flatmap

        List<List<String>> listOfLists = new ArrayList<>();

        // Create the inner lists
        List<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Dog", "Cat", "Bird"));

        listOfLists.add(list1);
        listOfLists.add(list2);

        List<String>   result = listOfLists.stream().flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(result);


    }
}

package StringJava8Questions.TheCuriousCoder;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestString {

    public static void longestString(List<String> listOfString)
    {
        Integer len = listOfString.stream().map(x -> x.length()).sorted(Comparator.reverseOrder()).findFirst().get();


        System.out.println(listOfString.stream().filter(x -> x.length() == len).collect(Collectors.toList()));
    }

    //better approach
    public static void longestString2(List<String> listOfString)
    {
        Optional<String> longest = listOfString.stream().max(Comparator.comparing(ele -> ele.length()));

        if(longest.isPresent())
        {
            System.out.println(longest.get());
        }



    }
}

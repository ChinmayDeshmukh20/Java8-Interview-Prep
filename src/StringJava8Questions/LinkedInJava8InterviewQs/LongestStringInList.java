package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class LongestStringInList {

    public static void main(String[] args) {

        List<String> list = List.of("xyz", "acbcdsdasdasjbkbakdbdabd", "sfgsgsfdsffasfas", "afadfad");

        // Q - Find Longest String in the list
        int length = 0;

        for(String ele: list)
        {
            if(ele.length()>length)
            {

                length = ele.length();
            }
        }


        for(String e : list)
        {
            if(e.length()==length)
            {
                System.out.println(e);
                break;
            }
        }


        // Java 8 approach

        int maxLength =  list.stream().mapToInt(x -> x.length()).max().orElse(0);
        System.out.println(maxLength);

        list.stream().filter(x -> x.length()==maxLength).forEach(System.out::println);


        // approach 2

        String maxString = list.stream().max(Comparator.comparing(x -> x.length())).orElse(null);
        System.out.println(maxString);

    }
}

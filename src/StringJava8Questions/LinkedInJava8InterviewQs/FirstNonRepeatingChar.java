package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

    public static void main(String[] args)
    {
        //Ques : Find First Non-repeating character in the string

        String question = "aaaaddasssee";

        Character result =question.chars()
                .mapToObj( i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue()==1)
                .findFirst()
                .map(x -> x.getKey())   // can be also written as Map.Entry::getKey
                .orElse(null);
        System.out.println(result);


// It stores key-value pairs while maintaining the insertion order of the entries. It maintains the order in which elements are added.
// Initial Mappings: {20=Geeks, 25=Welcomes, 10=Geeks, 30=You, 15=for}
//The set is: [20=Geeks, 25=Welcomes, 10=Geeks, 30=You, 15=for]
// EntrySet() method provides a Set view of the mappings in the HashMap. Each element in the set is a Map.Entry object that represents a key-value pair.



    }



}

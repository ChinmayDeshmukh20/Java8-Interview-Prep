package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveduplicatesFromList {

    public static void main(String[] args) {
        List<String> list = List.of("Chin","desh", "Chin" , "was" , "is" , "is");

        //Ques : Remove duplicates from list

        List<String> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);


        Set<String> distinctSet = new HashSet<>();

        list.stream().filter(x -> distinctSet.add(x)).forEach(System.out::println);

        List<String> distinctList2 = list.stream()
                .collect(Collectors.toSet())
                .stream()
                .collect(Collectors.toList());

        System.out.println(distinctList2);

    }
}


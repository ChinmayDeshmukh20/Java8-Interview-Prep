package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {

    public static void main(String[] args) {
        //Ques : Find the second highest number in the list

        List<Integer> list = List.of(1,22,3,40,5,60,7);

        Integer ans=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

        System.out.println(ans);

// Approach 2:





    }





}

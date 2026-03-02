package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage {

    public static void main(String[] args) {

        // Ques : Find Sum and Average of list of Numbers

        List<Integer> list = List.of(1,2,0,3,4,5,7,7,80,6,-1);

        int sum = list.stream().mapToInt(x -> x).sum();

        System.out.println(sum);

        OptionalDouble average =  list.stream().mapToInt(x -> x).average();
        System.out.println(average.orElse(0.0));


        double avg = list.stream().mapToInt(x -> x).summaryStatistics().getAverage();
        System.out.println(avg);



    }


}

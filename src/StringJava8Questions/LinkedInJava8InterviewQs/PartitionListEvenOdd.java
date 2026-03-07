package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionListEvenOdd {
    public static void main(String[] args) {

        //Q : Partition list into even and odd numbers

        List<Integer> myList = List.of(1,2,3,4,5,6);

        List<Integer> evenList = myList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        List<Integer> oddList=myList.stream().filter(x -> x%2!=0).collect(Collectors.toList());

        System.out.println(evenList);
        System.out.println(oddList);


        // Using Partition By

        Map<Boolean, List<Integer>> evenOdd = myList.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(evenOdd);
    }
}

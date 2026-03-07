package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.List;
import java.util.function.Predicate;

public class ConditionMatchAllElements {

    public static void main(String[] args) {
        //Q : Check if all elements in list match the condition

        List<Integer> myList = List.of(2,4,6,8,11);

        Predicate<Integer> isEven= x -> x%2==0;

        boolean answer = myList.stream().allMatch(x -> x % 2 == 0);
        System.out.println(answer);

    }
}

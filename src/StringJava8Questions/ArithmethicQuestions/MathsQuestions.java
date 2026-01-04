package StringJava8Questions.ArithmethicQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class MathsQuestions {

    public static void main(String[] args)
    {

        // calculate sum of squares of even numbers from list

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

         Optional result =list.stream().filter(n -> n%2==0).map(n -> n*n).reduce(Integer::sum);

        int result2 = list.stream().filter(n -> n%2==0).mapToInt(n -> n*n).sum();   // this is better approach , since we are directly using primitive type(int) and no unnecesaary boxing , unboxing is needed

         System.out.println(result.get());

         System.out.println(result2);

        // Use flatMap to flatten the list

        List<List<Integer>> nestedList = new ArrayList<>();

        nestedList.add(List.of(1,2,3,4));
        nestedList.add(List.of(5,6,7,8));
        nestedList.add(List.of(9,10,11,12));

        System.out.println(nestedList);

        // flattening the nested list

        //nestedList.stream().flatMap(List::stream).forEach(System.out::print);
       List<Integer> flattenedList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
       System.out.println(flattenedList);





    }


}

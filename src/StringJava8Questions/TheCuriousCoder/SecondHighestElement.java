package StringJava8Questions.TheCuriousCoder;

import java.util.Comparator;
import java.util.List;

public class SecondHighestElement {

    public static int findSecondHighestNumber(List<Integer> myList)
    {

       return myList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
        // orElse condition is necessary in case all elements of list are same , then there will be no second highest number
    }




}

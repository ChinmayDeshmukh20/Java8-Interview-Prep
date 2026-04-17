package StringJava8Questions.TheCuriousCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNoSquare {





    //find odd number and square
    public static List<Integer> oddNumbers(List<Integer> myList)
    {
       return myList.stream().filter(x -> x%2!=0).map(x -> x*x).collect(Collectors.toList());
    }

}

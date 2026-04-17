package StringJava8Questions.TheCuriousCoder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find2And3Element {

    public static List<Integer> findSecondAndThirdElement(List<Integer> myList)
    {

        int second = myList.stream().skip(1).findFirst().get();

        int third = myList.stream().skip(2).findFirst().get();

        List<Integer> returnList = Arrays.asList(second,third);

        //---------------------------------------------------------------
        //better solution using Limit
        List<Integer> returnList2 = myList.stream().skip(1).limit(2).collect(Collectors.toList());



        return returnList2;

    }
}

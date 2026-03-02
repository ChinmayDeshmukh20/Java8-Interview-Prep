package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsIdentification {


    public static void main(String[] args) {
        // Question : Identiy duplicate elements in list

        List<String> list = List.of("Chin","desh", "Chin" , "was" , "is" , "is");

     //   List<Integer> list = List.of(1,1,1,2,3,5,2,2);
        //distinct elements
        List<String> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

//        list.stream().collect(Collectors.groupingBy(Function.identity() , HashMap::new ,Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(x -> x.getValue()>1)
//                .map(x -> x.getKey())
//                .forEach(x -> System.out.println(x));
//

        //groupingBy automatically creates a Map
        //
        //By default, it uses a HashMap


        //🔍 When do you need to pass HashMap::new explicitly?
        //
        //Only when you want control over the map type, like:
        //
        //LinkedHashMap → preserve order
        //TreeMap → sorted keys
        //ConcurrentHashMap → thread-safe

        list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);



    //    ✅ Find duplicates without groupingBy
        Set<String> seen = new HashSet<>();

        list.stream()
                .filter(x -> !seen.add(x))   //“Keep only elements that were already seen before” // simple - Set only adds unique values, by using ! opposite will happen
                .forEach(System.out::println);
























    }



























}

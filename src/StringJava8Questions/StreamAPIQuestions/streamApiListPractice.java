package StringJava8Questions.StreamAPIQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class streamApiListPractice {



    // how can you create immutable list with Java Streams that allows null values?

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(2);

        System.out.println(myList);

        // when we use List.of() to create list , it creates immutuable list , which means it cannot be modified later
        List<Integer> myList2 = List.of(1,2,3,4,5,6);   // this does not allow null values   // you need to use Stream.of() to add null values
        System.out.println(myList2);
       // myList2.add(7);   // will throw error
       // System.out.println(myList2);


        // other way of creating immutable list which can contain null values

        var myList3 =Stream.of(10,20,30,40,null).toList();
        System.out.println(myList3);

        //==============================================================================================================

        //How do you create a modifiable list that allows null values using Java Streams?

        List<String> myList4=Stream.of("red","blue","orange").collect(Collectors.toList());   // Modifiable list with null values also

        System.out.println(myList4);
        myList4.add("purple");
        System.out.println(myList4);
        myList4.add(null);
        System.out.println(myList4);






    }



}

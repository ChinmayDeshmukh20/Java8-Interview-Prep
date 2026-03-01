package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurence {


    public static void main(String args[])
    {
        // Q1:
        // Count character occurences in String
        //determine how many times 'a' comes in the given string
        // determine frequency of each Character

        String question = "banana";

         Map<Character, Long> answerMap    = question.chars().mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy( Function.identity(), Collectors.counting()));

            System.out.println(answerMap);



        // .collect(Collectors.groupingBy( x- > x ,  Collectors.counting()) ;   ====> same as using Function.identity()


        //chars() → gives IntStream
        //mapToObj(c -> (char) c) → converts to Stream<Character>
        //groupingBy(Function.identity(), counting())
        //groups same characters together
        //counts how many times each appears



        // groupingBy needs:
        //
        //How to group elements (key)
        //What to do with grouped values

        //Here:
        //
        //Stream elements → Character (like 'a', 'b', 'n')
        //
        //We want to group by the character itself
        //So: Function.identity()









    }


















}


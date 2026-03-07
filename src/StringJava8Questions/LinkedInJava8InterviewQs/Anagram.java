package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        // Que : Find whether string is anagram using Java 8

//        String str = "amanxaaxnama";
////    palindrome
//        String reverseString = new StringBuilder(str).reverse().toString();
//        if(reverseString.equals(str))
//        {
//            System.out.println("is Anagram");
//        }
//        else {
//            System.out.println("Not Anagram");
//
//        }
//

        //

        //An anagram means both strings contain the same characters with the same frequency.

        String s1 = "listen";
        String s2 = "silent";

        if(s1.length()==s2.length())
        {
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();

            for(int i=0; i<s1.length() ; i++)
            {
                int freq = map1.getOrDefault(s1.charAt(i) , 0);
                map1.put(s1.charAt(i) , freq+1);

            }
            for(int j=0 ; j<s2.length() ; j++)
            {
                int freq = map2.getOrDefault(s2.charAt(j) , 0);
                map2.put(s2.charAt(j) , freq + 1);
            }

            if(map1.equals(map2))
            {
                System.out.println("is anagram");
            }else{
                System.out.println("Not anagram");
            }


        }
        else
        {
            System.out.println("Not anagram");
        }

      // Core Java Better approach

        char[] a = s1.toCharArray();
        char[] b= s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(s1.length()!=s2.length())
        {
            System.out.println("Not anagram");
            return;
        }
        else {
            if(Arrays.equals(a,b))
            {
                System.out.println("is Anagram");
                //return ;
            }
            else
            {
                System.out.println("Not anagram");
            }

        }


        // Java 8 approach

        boolean ans =s1.chars().sorted().boxed().collect(Collectors.toList())
                .equals(s2.chars().sorted().boxed().collect(Collectors.toList()));

        if(ans==true)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }

        // The reason we use .boxed() here is because of the type of stream returned by chars()
        // chars() returns IntStream
        // .boxed() will convert it to Stream<Integer>
        // Why we need it here
        //Because we are doing:
        //.collect(Collectors.toList())
        //
        //Collectors.toList() works with object streams, not primitive streams.


        // Java 8 another approach

        boolean isAnagram = s1.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .equals(
                        s2.chars().mapToObj(c -> (char) c)
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())
                                ));

        if(isAnagram)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");

        }
    }

    //What mapToObj() does
    //.mapToObj(c -> (char) c)
    //
    //Converts:
    //
    //IntStream → Stream<Character>
    //because grouping works on objects like Character, not primitive int.
}

package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String[] args) {
        //Ques : Reverse a String

        String s = "egoog";
        String ans = "";

        for(int i=s.length()-1; i>=0 ; i--)
        {

            ans = ans + s.charAt(i);
        }
        System.out.println(ans);

        // approach 2
        String reverseString = new StringBuilder(s).reverse().toString();
        System.out.println(reverseString);

        // Using Java 8


       String ans2 =IntStream.range(0, s.length())
               .mapToObj(i -> s.charAt(s.length()-1-i))
               .map(String::valueOf)
               .collect(Collectors.joining());

       System.out.println(ans2);


    }

}




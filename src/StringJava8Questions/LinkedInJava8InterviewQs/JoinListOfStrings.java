package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.List;
import java.util.stream.Collectors;

public class JoinListOfStrings {
    public static void main(String[] args) {
      //Q : Join list of Strings using delimiter

        List<String> listToJoin = List.of("axbdg" , "akjbkjabfkajbf" , "endssad");

        String joinedString = listToJoin.stream().collect(Collectors.joining(","));
        System.out.println(joinedString);



    }
}

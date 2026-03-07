package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStringToChar {

    public static void main(String[] args) {
        // Q : You have a list of sentences, and you must extract all characters into one list.

        List<String> sentences = List.of(
                "Java Stream",
                "FlatMap Example"
        );

        List<Character> chars =sentences.stream().flatMap(c -> c.chars().mapToObj(s -> (char) s))   // Convert each string to a stream of characters. This creates: Stream<Stream<Character>>
                .filter(c -> !Character.isWhitespace(c))
                .collect(Collectors.toList());   //flatMap merges them : Stream<Character>

        System.out.println(chars);
    }
}
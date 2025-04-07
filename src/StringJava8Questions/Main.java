package StringJava8Questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Question : Sort a list of strings in natural order (ascending) using Java 8.

        List<String> listOfUnsortedNames = new ArrayList<>();

        listOfUnsortedNames.add("Nitin");
        listOfUnsortedNames.add("Putin");
        listOfUnsortedNames.add("Chinmay");
        listOfUnsortedNames.add("Akash");
        listOfUnsortedNames.add("Rammohan");
        listOfUnsortedNames.add("Parag");

        List<String> sortedNames = listOfUnsortedNames.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println(sortedNames);


        //=====================================================================
        // Question : Sort a list of strings in reverse order using Java 8.


        List<String> sortedNamesinReverseOrder = listOfUnsortedNames.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedNamesinReverseOrder);

        // ===================================================================================

        // Question : Sort a list of strings based on length using Java 8 Comparator.

        List<String> sortedNamesOnLength=listOfUnsortedNames.stream().sorted(Comparator.comparingInt(x -> x.length())).collect(Collectors.toList());
        System.out.println(sortedNamesOnLength);



        // ===================================================================================

        // Question : Find the longest and shortest words in a list using Streams.

        sortedNamesOnLength.stream().findFirst().ifPresent(System.out::println);
        sortedNamesOnLength.stream().skip(sortedNamesOnLength.size()-1).findFirst().ifPresent(System.out::println);

        // alternate way

        String shortest = listOfUnsortedNames.stream().min(Comparator.comparingInt(String::length)).orElse(null);
        String longest = listOfUnsortedNames.stream().max(Comparator.comparingInt(String::length)).orElse(null);

        System.out.println(shortest);
        System.out.println(longest);

        // but what if we want to print all the shortest & all the longest words in list , as min() , max() will only print first occurence

        int minLen= listOfUnsortedNames.stream().mapToInt(String::length).min().orElse(0);
        List<String> shortestWords = listOfUnsortedNames.stream().filter(x -> x.length()==minLen).collect(Collectors.toList());

        System.out.println("List of all shortest words" +shortestWords);

        // similarly it can be done for longest words in list











//        🔥 Java 8 String-Based Coding Questions 🔥
//        1. String Transformations & Formatting
//✅ Q1: Convert a list of strings to uppercase using Java 8.
//✅ Q2: Convert a list of strings to a comma-separated string using Collectors.joining().
//✅ Q3: Remove duplicate characters from a given string using Java 8.
//✅ Q4: Reverse a string using Java 8 Streams.
//✅ Q5: Remove spaces from a string using Java 8.
//
//        2. Finding & Filtering Strings
//✅ Q6: Find the first non-repeating character in a string using Java 8.
//✅ Q7: Find all duplicate characters in a string using Streams.
//✅ Q8: Count occurrences of each character in a string using Collectors.groupingBy().
//✅ Q9: Count the occurrences of each word in a given sentence using Java 8.
//✅ Q10: Find the longest word in a sentence using Streams.
//✅ Q11: Filter a list of strings to keep only those starting with a specific letter (e.g., "A").
//
//        3. Palindrome & Anagram Problems
//✅ Q12: Check if a given string is a palindrome using Java 8 Streams.
//✅ Q13: Check if two given strings are anagrams using Java 8.


        //4. Sorting and Manipulation
        //✅ Q14: Sort a list of strings in natural order (ascending) using Java 8.
        //✅ Q15: Sort a list of strings in reverse order using Java 8.
        //✅ Q16: Sort a list of strings based on length using Java 8 Comparator.
        //✅ Q17: Find the longest and shortest words in a list using Streams.
        //✅ Q18: Sort a list of strings case-insensitively.
        //
        //5. String Modifications
        //✅ Q19: Remove vowels from a given string using Java 8.
        //✅ Q20: Replace multiple spaces in a string with a single space.
        //✅ Q21: Extract only numeric values from an alphanumeric string using Java 8.
        //✅ Q22: Convert a sentence into title case (capitalize the first letter of each word).
        //
        //6. Functional Programming with Strings
        //✅ Q23: Use Predicate<String> to filter strings of a certain length.
        //✅ Q24: Use Function<String, Integer> to find the length of each string in a list.
        //✅ Q25: Use Optional<String> to check if a string is empty or null.
    }
}
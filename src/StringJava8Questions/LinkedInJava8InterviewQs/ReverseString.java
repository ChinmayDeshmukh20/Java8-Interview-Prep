package StringJava8Questions.LinkedInJava8InterviewQs;

public class ReverseString {

    public static void main(String[] args) {
        //Ques : Reverse a String

        String s = "abcdsfed";
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




    }

}

package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.List;

public class MaxMinValue {


    public static void main(String[] args) {

        //Question : find min max values using streams
        List<Integer> list = List.of(1,2,0,3,4,5,7,7,80,6,-1);

        Integer minValue = list.stream().min((a, b) -> a - b).get();
        System.out.println(minValue);

        Integer maxValue=list.stream().max((a,b) -> a - b).get();
        System.out.println(maxValue);





    }











}

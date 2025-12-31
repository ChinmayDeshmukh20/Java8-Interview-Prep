package StringJava8Questions.StreamAPIQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class groupingByPractice {


    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);    // this will internally create array of fix size;
        // In Arrays.asList() , we can have element as null at time of creation , but we cannot add it later on through list.add() method ;


        // try to group elements greater than 5 and less than 5

        Map<Boolean, List<Integer>> result =myList.stream().collect(Collectors.groupingBy(x->x>4));
        //groupingBy() returns a Map because it groups elements based on a key, and in this case the key is a boolean, so the map has only true and false keys.
        System.out.println(result);


        Map<Boolean, Long> collect = myList.stream().collect(Collectors.groupingBy(x -> x > 4 , Collectors.counting()));   // will count elements in each category
        System.out.println(collect);


        // practicing grouping by on Objects

        List<product> productList = new ArrayList<>();
        productList.add(new product("iphone16" , "Mobile" , 60000));
        productList.add(new product("iphone17" , "Mobile" , 80000));
        productList.add(new product("ipad10" , "Tablet" , 50000));
        productList.add(new product("Sony1000mx5" , "Headphones" , 25000));
        productList.add(new product("OnePlusPro3Buds" , "Headphones" , 11000));
        productList.add(new product("LGOled" , "Television" , 130000));


        // grouping by product category

        Map<String , List<product>> categoryList=productList.stream().collect(Collectors.groupingBy(product::category));
        System.out.println(categoryList);

            // product::category == product -> product.category


        //=============================================================================================================
        //aggregating
        //calculate total price of products in each category

        Map<String, Integer> pricePerCategory=productList.stream().collect(Collectors.groupingBy(product::category,Collectors.summingInt(product::price)));
        System.out.println(pricePerCategory);

        // calculate average price of products in each category
        Map<String, Double> avgPricePerCategory=productList.stream().collect(Collectors.groupingBy(product::category,Collectors.averagingInt(product::price)));
        System.out.println(avgPricePerCategory);

        //count products available in each category
        Map<String, Long> productsPerCategory=productList.stream().collect(Collectors.groupingBy(product::category,Collectors.counting()));
        System.out.println(productsPerCategory);


        // product with min price in each category
        Map<String, Optional<product>> minPricePerCategory = productList.stream().collect(Collectors.groupingBy(product::category,Collectors.minBy(
                Comparator.comparing(product::price)
        )));
        System.out.println(minPricePerCategory);

        // product with min price across all category
        Optional<product> minPrice = productList.stream().collect(Collectors.minBy(
                Comparator.comparing(product::price)
        ));
        System.out.println(minPrice);


        // Using SummaryStatistics on product prices
         Map<String, IntSummaryStatistics>summaryStats    =productList.stream().collect(Collectors.groupingBy(product::category,Collectors.summarizingInt(product::price)));
        System.out.println( "summary stats are for each category: "  + summaryStats);

        // partitioning by

        // partition products above and below 50000 price

        var partitionedResult=productList.stream().collect(Collectors.partitioningBy(product -> product.price()>50000));
        System.out.println(partitionedResult);








    }
}

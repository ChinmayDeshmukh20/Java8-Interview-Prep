package StringJava8Questions.TheCuriousCoder;

import java.util.*;
import java.util.stream.Collectors;

public class CommonEleInList {


    public static void findCommonElementsInList(List<Integer> l1, List<Integer> l2)
    {

        HashMap<Integer , Integer> map1 = new HashMap<>();

        for(int i=0 ; i<l1.size() ; i++)
        {
            if(map1.containsKey(i))
            {
                int freq = map1.get(i);
                freq = freq + 1;
                map1.put(l1.get(i) , freq);
            }
            else
            {
                map1.put(l1.get(i) , 1);
            }

        }

        List<Integer> commonElements = new ArrayList<>();
        for(int j =0 ; j<l2.size(); j++)
        {
            if(map1.containsKey(l2.get(j)))
            {
                commonElements.add(l2.get(j));
            }

        }

        System.out.println(commonElements);



        //  using Java 8   - O(n2)

        List<Integer> collect = l1.stream().filter(ele -> l2.contains(ele)).collect(Collectors.toList());
        System.out.println(collect);

        // better approach using Java 8 - bcoz here we are not iterating on list completely to find element
        Set<Integer> set = new HashSet<>(l1);

        List<Integer> collect1 = l2.stream().filter(ele -> set.contains(ele)).collect(Collectors.toList());
        System.out.println(collect1);

    }




}

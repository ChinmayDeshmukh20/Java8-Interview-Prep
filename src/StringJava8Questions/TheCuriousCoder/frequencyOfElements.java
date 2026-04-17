package StringJava8Questions.TheCuriousCoder;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyOfElements {

    public static Map<Integer , Long> frequencyOfElements(List<Integer> elements)
    {
        return elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }


}

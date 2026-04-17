package StringJava8Questions.TheCuriousCoder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class frequencyOfEmployeesByDept {

    public static void frequencyOfEmployeesByDepartment(List<Employee> employeeList)
    {
        Map<String, Long> freq = employeeList.stream().collect(Collectors.groupingBy(x -> x.getDepartment(), Collectors.counting()));
        System.out.println(freq);

    }

}

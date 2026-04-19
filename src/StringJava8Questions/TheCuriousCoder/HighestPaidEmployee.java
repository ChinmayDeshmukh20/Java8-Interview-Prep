package StringJava8Questions.TheCuriousCoder;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmployee {

    public static void highestPaidEmployeePerDept(List<Employee> employeeList)
    {
        Map<String, Optional<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(x -> x.getDepartment(), Collectors.maxBy(Comparator.comparingInt(e -> e.getSalary()))));

        System.out.println(collect);
    }
}

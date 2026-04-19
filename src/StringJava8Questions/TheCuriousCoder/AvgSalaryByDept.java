package StringJava8Questions.TheCuriousCoder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgSalaryByDept {

    public static void findAvgSalaryAmtByDept(List<Employee> employeeList)
    {
        Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(x -> x.getDepartment(), Collectors.averagingInt(x -> x.getSalary())));

        System.out.println(collect);
    }
}

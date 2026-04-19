package StringJava8Questions.TheCuriousCoder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TotalSalaryByDept {

    public static void findTotalSalaryAmtByDept(List<Employee> employeeList)
    {
        Map<String, Integer> collect = employeeList.stream().collect(Collectors.groupingBy(x -> x.getDepartment(), Collectors.summingInt(x -> x.getSalary())));

        System.out.println(collect);
    }
}

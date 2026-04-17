package StringJava8Questions.TheCuriousCoder;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortBySalaryAndThenName {

    public static void sortBySalaryAndThenByName(List<Employee> employeeList)
    {
        List<Employee> employeeList1 =  employeeList.stream().sorted(Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println(employeeList1);


    }
}

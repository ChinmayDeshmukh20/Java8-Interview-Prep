package StringJava8Questions.TheCuriousCoder;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TwoHighestPaidEmp {


    public static List<Employee> topTwoHighestPaidEmp(List<Employee> employees)
    {
       return employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
               .limit(2).collect(Collectors.toList());



       //  employees.stream().sorted(Comparator.comparingInt(e -> -1 * e.getSalary()))   // trick is to multiply by -1 to reverse the list
        //               .limit(2).collect(Collectors.toList());
    }


}

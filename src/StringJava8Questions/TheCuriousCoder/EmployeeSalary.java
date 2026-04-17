package StringJava8Questions.TheCuriousCoder;

import java.util.List;
import java.util.Optional;

public class EmployeeSalary {



    // find first employee whose salary is greater than 50,000
    public static void employeeWithSalary(List<Employee> employees)
    {
        Optional<Employee> firstEmployee = employees.stream().filter(x -> x.salary > 50000).findFirst();

        if(firstEmployee.isPresent())
        {
            System.out.println(firstEmployee.get());
        }


    }

}

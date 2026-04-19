package StringJava8Questions.TheCuriousCoder;

import java.util.List;

public class TotalSalaryOfEmp {

    public static void totalCombinedSalary(List<Employee> employeeList)
    {
        Integer sum = employeeList.parallelStream().map(emp -> emp.getSalary()).reduce(Integer::sum).get();

        System.out.println(sum);
        // reduce(0 , (a,b) -> a+b)  ........can also be written like this &&&  reduce is thread safe


    }
}

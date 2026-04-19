package StringJava8Questions.TheCuriousCoder;

import java.util.List;

public class printEmployeeNames {

    public static void printFastEmployeeList(List<Employee> employeeList)
    {
        employeeList.stream().map(emp -> emp.getName()).forEach(System.out::println);

        System.out.println("=================");
        // to do more faster use paralled streams/multithreading

        employeeList.parallelStream().map(emp -> emp.getName()).forEach(System.out::println);
    }
}

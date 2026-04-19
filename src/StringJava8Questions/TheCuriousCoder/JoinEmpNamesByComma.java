package StringJava8Questions.TheCuriousCoder;

import java.util.List;
import java.util.stream.Collectors;

public class JoinEmpNamesByComma {


    public static void JoinEmpNamesByComma(List<Employee> employeeList){

        String collect = employeeList.stream().map(x -> x.getName()).collect(Collectors.joining(","));

        System.out.println(collect);

    }
}

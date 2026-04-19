package StringJava8Questions.TheCuriousCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Arrays.asList(...)
        //
        //Returns a fixed-size list backed by an array
        //Then new ArrayList<>(...) creates a separate copy
        //So final list is fully mutable

        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        OddNoSquare obj = new OddNoSquare();
        System.out.println(OddNoSquare.oddNumbers(myList)); // since made the method static now

       // System.out.println(obj.oddNumbers(myList));  // without making method static


        System.out.println(Find2And3Element.findSecondAndThirdElement(myList));


        //Second Highest number
        System.out.println(SecondHighestElement.findSecondHighestNumber(myList));

        //Even Odd numbers separation

        EvenOddSeparation.EvenOdd(myList);

        List<String> stringList = new ArrayList<>(Arrays.asList("Api" , "Springboottt" , "Java"));
        LongestString.longestString2(stringList);


        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Amit Sharma", "Engineering", 50000),
                new Employee("Priya Verma", "HR", 60000),
                new Employee("Rahul Mehta", "Finance", 70000),
                new Employee("Sneha Iyer", "Engineering", 95000),
                new Employee("Karan Patel", "Marketing", 70000),
                new Employee("Neha Kapoor", "HR", 65000),
                new Employee("Arjun Reddy", "Engineering", 88000),
                new Employee("Meera Nair", "Finance", 72000),
                new Employee("Vikram Singh", "Marketing", 78000),
                new Employee("Pooja Desai", "Engineering", 91000)
        ));

        EmployeeSalary.employeeWithSalary(employees);

        System.out.println(TwoHighestPaidEmp.topTwoHighestPaidEmp(employees));

        sortBySalaryAndThenName.sortBySalaryAndThenByName(employees);


        List<Integer> elements = new ArrayList<>(Arrays.asList(1,2,2,2,3,4,3,4,5,6,6,7));
        System.out.println(frequencyOfElements.frequencyOfElements(elements));

        frequencyOfEmployeesByDept.frequencyOfEmployeesByDepartment(employees);

        TotalSalaryByDept.findTotalSalaryAmtByDept(employees);

        AvgSalaryByDept.findAvgSalaryAmtByDept(employees);

        HighestPaidEmployee.highestPaidEmployeePerDept(employees);

        JoinEmpNamesByComma.JoinEmpNamesByComma(employees);

        List<Integer> list1 = Arrays.asList(1,2,3,4 , 7 , 8);

        List<Integer> list2 = Arrays.asList(2,3,5,6,7 , 4);

        CommonEleInList.findCommonElementsInList(list1 , list2);


        List<List<Integer>> listOfLists = Arrays.asList(

                Arrays.asList(1, 2, 3, 4 ),
                Arrays.asList(3, 4, 5, 6),
                Arrays.asList(7, 8, 1, 2),
                Arrays.asList(9, 10, 5, 6),
                Arrays.asList(11, 12, 7, 8)

        );

        flatMapWithNoDuplicates.flattenedListWithNoDuplicates(listOfLists);

        printEmployeeNames.printFastEmployeeList(employees);

        TotalSalaryOfEmp.totalCombinedSalary(employees);
    }
}

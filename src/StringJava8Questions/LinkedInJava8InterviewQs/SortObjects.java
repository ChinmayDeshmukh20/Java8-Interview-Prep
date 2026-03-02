package StringJava8Questions.LinkedInJava8InterviewQs;

import StringJava8Questions.Entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortObjects {

    public static void main(String[] args) {
        // Question : Sort objects based on specific field

        //sort students based on age

        List<Student> studentList = new ArrayList<>();


        studentList.add(new Student("120","Hopkin",90,23));
        studentList.add(new Student("123","John",67,27));
        studentList.add(new Student("121","Raju",99,23));
        studentList.add(new Student("122","Rahul",49,32));
        studentList.add(new Student("124","Kajal",88,29));

        Comparator<Student> comparingAge = Comparator.comparingInt(x -> x.getAge());
        studentList.stream().sorted(comparingAge).forEach(System.out::println);

        //  //sort students based on Name
        System.out.println("Comparing on basis of Name : ");
        Comparator<Student> comparingName = Comparator.comparing(x -> x.getName());
        studentList.stream().sorted(comparingName).forEach(System.out::println);

        // if want to sort on basis on Age and if age is same thhen use Name

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        studentList.stream().sorted(comparingAge.thenComparing(comparingName)).forEach(System.out::println);

//Comparator.comparingInt(Student::getAge)
//          .thenComparing(Student::getName)

        // no need to extract to variable



        // Ques: Convert List to Map
        Map<String, Integer> studentMap =studentList.stream().collect(Collectors.toMap(x -> x.getId() , y -> y.getAge() , (a, b) -> a)); // a or b (decide which to keep) in case of duplicates


        System.out.println(studentMap);

        Map<String, Student> map =
                studentList.stream()
                        .collect(Collectors.toMap(
                                Student::getId,
                                Function.identity()    // to store entire objects
                        ));
        System.out.println(map);

    }

}

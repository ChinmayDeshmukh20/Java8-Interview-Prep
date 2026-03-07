package StringJava8Questions.LinkedInJava8InterviewQs;

import java.util.List;
import java.util.stream.Collectors;

public class DepartmentStudentFlatMapQ {

    //Problem
    //
    //You have a list of departments, each department has a list of students.
    //
    //You want to extract all student names into one list.

    static class Student {
        String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<List<Student>> departments = List.of(
                List.of(new Student("Rahul"), new Student("Amit")),
                List.of(new Student("Neha"), new Student("Kajal")),
                List.of(new Student("John"))
        );

         List<String> flattened =  departments.stream().flatMap(x -> x.stream())
                 .map(x -> x.getName())
                 .collect(Collectors.toList());

        System.out.println(flattened);




    }



}

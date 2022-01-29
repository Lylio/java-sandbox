package Streams;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPracticeThree {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Leesa", "Hendo", 88));
        students.add(new Student("Frankie", "Asquith", 91));
        students.add(new Student("Hoony", "Salvador", 92));
        students.add(new Student("Acker", "Bilko", 66));
        students.add(new Student("Sweemly", "Coldo", 99));

        List<Student> over70pass = students.stream()
                .filter(student -> student.gradeAverage >= 70)
                .collect(Collectors.toList());

        System.out.println(over70pass.toString());
    }


    @ToString
    static class Student {

            String nameFirst;
            String nameLast;
            int gradeAverage;

            public Student (String nameFirst, String nameLast, int gradeAverage) {
                this.nameFirst = nameFirst;
                this.nameLast = nameLast;
                this.gradeAverage = gradeAverage;
            }
        }
}




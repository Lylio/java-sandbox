package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Sammy", "Smith", 45));
        people.add(new Person("Alfie", "Jones", 50));
        people.add(new Person("Patty", "Crystal", 19));
        people.add(new Person("Sara", "Coby", 40));

        List<Person> overThirtyClub = people.stream()
                .filter(person -> person.age > 30)
                .collect(Collectors.toList());

        overThirtyClub.forEach(person -> System.out.println(person.nameFirst + " " + person.nameLast));

        System.out.println("- - - - - - - - - - - - -");

        List<Person> sorterOverThirtyClub = people.stream()
                .filter(person -> person.age > 30)
                .sorted(Comparator.comparing(person -> person.nameFirst))
                .collect(Collectors.toList());

        sorterOverThirtyClub.forEach(person -> System.out.println(person.nameFirst + " " + person.nameLast));

    }

static class Person {
        String nameFirst;
        String nameLast;
        int age;

        public Person(String nameFirst, String nameLast, int age) {
            this.nameFirst = nameFirst;
            this.nameLast = nameLast;
            this.age = age;
        }
    }
}

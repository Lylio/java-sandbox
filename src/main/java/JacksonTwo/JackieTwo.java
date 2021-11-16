package JacksonTwo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JackieTwo {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        String myJson = "{\"name\":\"Sammy\", \"age\":21}";

        // Create a Student object with the JSON string above (myJson) mapped onto it
        try {
            Student sam = mapper.readValue(myJson, Student.class);
            System.out.println(sam);

            String newJson = mapper.writeValueAsString(sam);
            System.out.println(newJson);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

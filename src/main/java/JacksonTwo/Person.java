package JacksonTwo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    private String nameFirst;
    private String nameSecond;
    private int age;
    private Boolean isMarried;

}


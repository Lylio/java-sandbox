package jacksontester;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JacksonDemo {

    public static void main(String[] args) throws IOException {

        // Java Object to JSON
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("Yellow", "Renault");
        objectMapper.writeValue(new File("./target/car.json"), car);

        // JSON to Java Object - method 1 (requires empty default constructor)
        String myJSON = "{\"car-colour\" : \"Black\", \"type\" : \"BMW\" }";
        Car car2 = objectMapper.readValue(myJSON, Car.class);
        System.out.println(car2.getColour());

        //JSON to Java Object - method 2 (using an external file)
        Car car3 = objectMapper.readValue(new File("src/main/resources/json_car.json"), Car.class);
        System.out.println(car3.getType());

        //Java Map from JSON String
        String myjson2 = "{ \"car-colour\" : \"White\", \"type\" : \"Honda\" }";
        Map<String, Object> map = objectMapper.readValue(myjson2, new TypeReference<Map<String,Object>>(){});
        System.out.println(map.values());

    }
}

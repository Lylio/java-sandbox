package JacksonTwo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

public class JacksonTwo {

    public static void main(String[] args) throws IOException {

        //Person p1 = new Person("Sam", "Davies", 48, false);

        final ObjectMapper mapper = new ObjectMapper();
        final StringWriter buffer = new StringWriter();

        //mapper.writeValue(buffer, p1);
        System.out.println(buffer.toString());
    }
}


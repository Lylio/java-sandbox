package JacksonTre;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;

@Slf4j
public class ObjMapperDemo {

    public static void main(String[] args) throws IOException {

        // Serialisation: Java object to JSON
        // Serialise a Java object into JSON using Jackson's Object Mapper
        // i.e. Create a .json file of a Java object

        ObjectMapper serialiseMapper = new ObjectMapper();
        BlogPost blogPost = new BlogPost("CheesyToast1996", "10-10-22", "My Cat Died", "My cat died. He was 19 years old. Bye.", 8);
        log.info(blogPost.toString());

        serialiseMapper.writeValue(new File("target/blogpost.json"), blogPost);

        // Deserialisation: JSON into a Java object

        ObjectMapper deserialiser = new ObjectMapper();
        BlogPost newBlogPost = deserialiser.readValue(new File("src/main/java/JacksonTre/newblogpost.json"), BlogPost.class);
        log.info(newBlogPost.toString());

    }
}


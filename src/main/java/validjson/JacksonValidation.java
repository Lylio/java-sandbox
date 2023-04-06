package validjson;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonValidation {

    public static void main(String[] args) {

        String json = "\"name\":\"john\"";
        ValidatorTool validatorTool = new ValidatorTool();

        System.out.println(validatorTool.isJsonValid(json));
    }

     static class ValidatorTool {

        ObjectMapper mapper = new ObjectMapper();

        public Boolean isJsonValid(String json) {
            try {
                mapper.readTree(json);
            } catch (JacksonException e) {
                return false;
            }
            return true;
        }
    }
}


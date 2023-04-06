package validjson;

/*
https://www.baeldung.com/java-validate-json-string
 */

import org.json.JSONException;
import org.json.JSONObject;

public class JsonApiValidation {

    public static void main(String[] args) {

        String testJson = "{\"colour\":\"blue\",\"day\":\"Friday\"}";

        System.out.println(isValidJson(testJson));

    }

    // Check if the String is valid JSON by creating a JSONObject
    public static Boolean isValidJson(String json) {
        try {
            new JSONObject(json);
        } catch (JSONException e) {
            return false;
        }
        return true;
    }
}


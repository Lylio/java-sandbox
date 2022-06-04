package uuid;
import java.util.UUID;

public class UUIDDemo {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();

        System.out.println("uuid: " + uuid);

        /* A UUID in the format of a String can be converted to a
        UUID object, but the String has to be in a legal format */
        try {
            String badlyFormedUUID = "5j4835-5843j-845h-845u354h3";
            UUID uuid2 = UUID.fromString(badlyFormedUUID);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }

        /* A legal UUID object is an 128-bit long unique value, made up
        of 36 characters with 4-hyphens
         */

        try {
            String wellFormedUUID = "0b84e72c-d080-11eb-b8bc-0242ac130003";
            UUID uuid3 = UUID.fromString(wellFormedUUID);
            System.out.println("valid UUID string: " + uuid3);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }

    }

}


package UUID;
import java.util.UUID;

public class UUIDDemo {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();

        System.out.println("uuid: " + uuid);

        int hashCode = uuid.hashCode();

        System.out.println("HashCode = " + hashCode);

    }

}


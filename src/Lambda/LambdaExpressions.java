package Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {

        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        items.forEach(item -> System.out.println(item*item));

        System.out.println(" - - - - - - - - - - - - - ");

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) * items.get(i));
        }

    }
}


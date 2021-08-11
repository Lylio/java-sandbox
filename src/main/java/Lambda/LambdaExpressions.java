package Lambda;

import java.util.ArrayList;
import java.util.List;

interface MyFunctionalInterface {
    public String sayHello();
}


public class LambdaExpressions {

    public static void main(String[] args) {


        List<Integer> items = new ArrayList<>();
        items.add(12);
        items.add(25);
        items.add(33);
        items.add(40);

        System.out.println(" - - - - The Old Way - - - - ");

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) * items.get(i));
        }

        System.out.println(" - - - - The Cool Wλy - - - - ");

        items.forEach(item -> System.out.println(item*item));

        System.out.println(" - - - - More Lλmdλ Practice - - - - ");

        MyFunctionalInterface msg = () -> {
            return "Hello";
        };

        System.out.println(msg.sayHello());
    }
}


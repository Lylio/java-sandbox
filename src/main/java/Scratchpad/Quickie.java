package scratchpad;

import java.util.ArrayList;
import java.util.List;

public class Quickie {
    public static void main(String[] args) {


        List<String> myColours = new ArrayList<>();

        myColours.add("orange");
        myColours.add("orange");
        myColours.add("red");
        myColours.add("orange");
        myColours.add("green");
        myColours.add("blue");

        System.out.println(myColours.toString());

        delDuplicates(myColours);

        System.out.println(myColours.toString());
    }

    public static void delDuplicates(List<String> items) {
        int arrayLength = items.size();
        for (int i = 0; i < arrayLength; i++) {

            //System.out.println(items.get(i));


        }
    }
}


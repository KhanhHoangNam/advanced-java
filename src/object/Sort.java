package object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("KhanhHN");
        stringList.add("AnhPT");
        stringList.add("AnhPTQ");
        stringList.add("QuynhNT");

        System.out.println("-----------------Before sorting-----------------");

        for (String name : stringList) {
            System.out.println(name);
        }

        System.out.println("-----------------After sorting-----------------");
        Collections.sort(stringList);

        for (String name : stringList) {
            System.out.println(name);
        }
    }
}

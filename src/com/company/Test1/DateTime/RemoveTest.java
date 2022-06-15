package src.com.company.Test1.DateTime;

import java.util.ArrayList;
import java.util.List;

public class RemoveTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(new Integer(0));

//        indexOf removes the matching element
        list.remove(list.indexOf(0));
//        .remove removes the index
        list.remove(0);

        System.out.println(list);


        String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str2 = str1);
    }
}

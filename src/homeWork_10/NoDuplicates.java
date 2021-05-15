package homeWork_10;

import java.util.*;

public class NoDuplicates {
    public static <C> Collection<C> noDuplicate(Collection<C> collection){
       return new HashSet<>(collection);
    }

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        System.out.println(list);
        System.out.println(noDuplicate(list));
    }
}

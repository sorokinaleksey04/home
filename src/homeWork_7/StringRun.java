package homeWork_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringRun{

    public static void main(String[] args) {

        String[] mass = new String[]{"1","2","3","4","5","6","7","8","9","10"};

        CollectionString cs = new CollectionString();
        //cs.addIndex(mass,6,"вставка по индексу");
        //cs.addValue(mass, "вставка по значению");
        //cs.deleteIndex(mass,5);
        //cs.deleteValue(mass,"8");
        cs.getIndex(mass,0);

    }
}

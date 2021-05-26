import homeWork_8.ImplementArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MassTest {

    @Test
     void addObg() {
        Mass<String> str = new Mass<>();
        str.addObg("объект1");
        List<Mass> actual = new ArrayList<>();
        actual.add(str);
        assertEquals(str, actual);
    }

    @Test
    void addIndex() {
        Mass<String> str = new Mass<>();
        str.addObg("объект1");
        str.addObg("объект3");
        str.addObg("объект4");
        str.addIndex(1, "объект2");
        List<Mass> actual = new ArrayList<>();
        actual.add(str);
        assertEquals(str, actual);
    }

    @Test
    void deleteObj() {
        Mass<String> str = new Mass<>();
        str.addObg("объект1");
        str.addObg("объект2");
        str.addObg("объект3");
        str.deleteObj("объект2");
        List<Mass> actual = new ArrayList<>();
        actual.add(str);
        assertEquals(str, actual);
    }

    @Test
    void get() {
        Mass<String> str = new Mass<>();
        str.addObg("объект1");
        assertEquals(str, str.get(0));

    }


    @Test
    void testEquals() {
        Mass<String> str = new Mass<>();
        str.addObg("объект1");
        List<Mass> actual = new ArrayList<>();
        actual.add(str);
        assertEquals(str, actual);
    }

    @Test
    void clear() {
        Mass<String> str = new Mass<>();
        str.addObg("объект1");
        str.addObg("объект2");
        str.addObg("объект3");
        str.clear();
        List<Mass> actual = new ArrayList<>();
        actual.add(str);
        assertEquals(str, actual);
    }

    @Test
    void size() {

        Mass<String> str = new Mass<>();
        str.addObg("объект1");
        str.addObg("объект2");
        str.addObg("объект3");

        List<String> newMass = new ArrayList<String>(str.size());
        Collections.copy(str,newMass);
        assertEquals(str.size(), newMass.size());
    }


}
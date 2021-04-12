package homeWork_6;

import java.lang.reflect.Array;
import java.text.CollationKey;
import java.text.Collator;
import java.util.*;

public class PhoneImplement implements phonefunction{


    //сведения об абонентах, у которых время внутригородских разговоров превышает заданное
    @Override
    public void timeTalk(Phone[] timeTalk) {
        for (Phone p : PhoneGenerator.phoneGenerate()){
            if (p.getTimeTalk() > 600){
                System.out.println(p.toString());
            }
        }
    }
    //сведения об абонентах, которые пользовались междугородной связью
    @Override
    public void overTalk(Phone[] overTalk) {
        for (Phone p : PhoneGenerator.phoneGenerate()){
            if (p.getOverTalk() > 0){
                System.out.println(p.toString());
            }
        }
    }
    //сведения об абонентах в алфавитном порядке
    @Override
    public void alphabetList(Phone[] phones) {
        List<Phone> phoneList = new ArrayList<Phone>();
        Collections.sort(phoneList, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

    }
        //сведения об первых 10 абонентов у который самый большой трафик интернета
        

}


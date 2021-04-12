package homeWork_6;

public interface phonefunction {


    //сведения об абонентах, у которых время внутригородских разговоров превышает заданное
    void timeTalk(Phone[] timeTalk);
    //сведения об абонентах, которые пользовались междугородной связью
    void overTalk(Phone[] overTalk);
    //сведения об абонентах в алфавитном порядке
    void alphabetList(Phone[] phones);
    //сведения об первых 10 абонентов у который самый большой трафик интернета
    //void traffic(Phone[] internetTraffic);
}

package homeWork_6;

public class PhoneRun {
    public static void main(String[] args) {
        Phone[] phones = PhoneGenerator.phoneGenerate();

        new PhoneImplement().timeTalk(phones);
        System.out.println("-----------");
        new PhoneImplement().overTalk(phones);
        System.out.println("-----------");
        new PhoneImplement().alphabetList(phones);
        System.out.println("-----------");
       // new PhoneImplement().traffic(phones);
    }
}

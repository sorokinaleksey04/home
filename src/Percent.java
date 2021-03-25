public class Percent {
    public static void main(String[] args){
        int money = 20000;
        int month = 36;
        double percent = 6.9;

        for (int i = 0; i < month; i++){
        money += (money * percent) / 100;
        }
        System.out.println(money);
    }
}

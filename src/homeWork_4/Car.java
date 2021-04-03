package homeWork_4;

public class Car {
    public final int volumeTank = 35;        //объем бака
    public float balanceTank = (float) 0f;    //остаток в баке
    public float gasMileage = 8f;             //расход топлива на 100км
    public float distance =  480f;             //расстояние

    public float fullTank(){                   //залить полный бак с учетом объема остатка
        //int addGas = 0;
        if (balanceTank < volumeTank) {
            balanceTank = (int) (volumeTank - balanceTank);
            //addGas = (int) (volumeTank - balanceTank);
        }
        //return addGas;
        return balanceTank;
    }

    public float getBalanceTank(){             //определить остаток топлива по преодолении N км
        float distanceForGas = 0;            //потрачено топлива по преодалении N км

            distanceForGas = gasMileage / 100 * distance;
            balanceTank = volumeTank - distanceForGas;
        return balanceTank;
    }

    public float getGas(){                     //определить сколько надо до заправить топлива при преодолении N км
        float gas = 0;
        gas = distance / 100 * 8;
        return gas;
    }

    public static void main(String[] args) {
          Car car = new Car();
          System.out.println("Топливо на весь маршрут: " + car.getGas() + "л");

          int costGas = 0;
          for (String i : args){
           costGas = Integer.valueOf(i);
          }
        System.out.println("Стоимость топлива за поездку: " + car.getGas() * costGas + "грн");
        System.out.println("-----------------");
        System.out.println("Вначале поездки заливаем полный бак - " + car.fullTank());
                   //Первая остановка. Одесса -  Кривое Озерао - 180 км (дозаправка)
        car.distance = 180;
        System.out.println("Остаток таплива после 180 км - " + car.getBalanceTank());
        System.out.println("Дозаправка до полного восле 180 км - " + car.fullTank());
                   //Вторая остановка. Кривое Озеро  -  Жашков - 50 км (дозаправка)
        car.distance = 50;
        System.out.println("Остаток таплива после 50 км - " + car.getBalanceTank());
        System.out.println("Дозаправка до полного восле 50 км - " + car.fullTank());
        car.distance = 150;
                   //Третья остановка. Жашков - Киев - 150 км (остаток топлива)
        System.out.println("Остаток таплива после 150 км - " + car.getBalanceTank());
    }
}

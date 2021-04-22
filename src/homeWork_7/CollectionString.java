package homeWork_7;

import java.util.Arrays;

/*
Реализовать простую коллекцию для String на базе массива.
добавить следующие методы для работы с коллекцией:

добавлять (add), (по индеку или значению)
удалять(delete), (по индексу или значению)
доставать по индексу (get)
 */
public class CollectionString {

    String[] arStr = new String[]{};


   CollectionString(){
        this.arStr = new String[10];

   }


    public void addIndex(String[] a, int index, String value) {
        String[] result = new String[a.length + 1];
            for (int i = 0; i < index; i++) {
            result[i] = a[i];
            result[index] = value;
        }
            for (int j = index + 1; j < a.length + 1; j++) {
                result[j] = a[j - 1];
            }
            for (String s : result)
        System.out.println(s);
    }


    public void addValue(String[] a, String value){
          int index = 0;
        String[] result = new String[a.length + 1];
          for ( int i = 0; i < a.length; i ++){
            result[index] = a[i];
            index++;
          }
          result[index] = value;
        for (String s : result)
        System.out.println(s);

     }

     public void deleteIndex(String[] a, int index){
     String[] result = new String[a.length - 1];
     /*for (int i = 0; i < index; i++) {
         result[i] = a[i];
         result[index] = value;
     }
        for (int j = index + 1; j < a.length - 1; j++){
            result[j] = a[j + 1];
        }*/
         for (int j = index; j < a.length - 1; j++) {
             System.arraycopy(a,0,result,0,index);
             System.arraycopy(a,index +1,result,index,a.length - index - 1);
         }
        for (String s : result)
            System.out.println(s);
     }



    public void deleteValue(String[] a, String value){
        int index = 0;
       String[] result = new String[a.length - 1];
        for (int i = 0; i < a.length ; i ++)
            if (a[i].equals(value)) {
               index = i;

                for (int j = index; j < a.length - 1; j++) {
                    System.arraycopy(a,0,result,0,index);
                    System.arraycopy(a,index +1,result,index,a.length - index - 1);
                }
            }
             for (String s : result)
              System.out.println(s);
    }

    public void getIndex(String[] a, int index){
       for (int i = 0; i < a.length; i++){
           if (i == index){
               System.out.println(a[i]);
           }
       }

    }

}


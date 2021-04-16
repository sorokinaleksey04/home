package homeWork_7;

/*
Реализовать простую коллекцию для String на базе массива.
добавить следующие методы для работы с коллекцией:

добавлять (add), (по индеку или значению)
удалять(delete), (по индексу или значению)
доставать по индексу (get)
 */
public class CollectionString {

    //String[] arStr = new String[]{"1","2","4","5"};


   /* CollectionString(){
        this.arStr = new String[10];

}
*/

    public String[] addIndex(String[] a, int index, String value) {
        String[] result = new String[a.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = a[i];
            i = i + 1;
            result[i] = value;
            while (i <  a.length){
                result[i] = a[i - 1];
            }
            result[i + 1] = a[i];
        }
            return result;

    }

    public String[] addValue(String[] a,String value){
          int index = 0;
        String[] result = new String[a.length + 1];
          for (String i : result){
            result[index] = i;
            index++;
          }
          result[index++] = value;
          return result;

     }

     public String[] deleteIndex(String[] a, int index, String value){
     String[] result = new String[a.length - 1];
     for (int i = 0; i < index; i++){
         result[i] = a[i];
         i = i - 1;
         result[i] = value;
         while (i < a.length){
             result[i] = a[i + 1];
         }
         result[i - 1] = a[i];
     }
     return result;
     }

     public String[] delete(String[] a, String value){
      int index = 0;
      String[] result = new  String[a.length - 1];
      for (String i : result){
          result[index] = i;
          index--;
      }
      result[index--] = value;
      return result;
    }

    public String getIndex(String[] a,int index){
        String value = new String();
        for (String s : a){
            if (s.equals(index)){
             value = s;
            }
        }
        return value;
    }

}


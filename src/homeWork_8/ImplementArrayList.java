package homeWork_8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Реализовать простую коллекцию для String на базе массива использую интерфейс
Interface collection:

boolean add(Object o);
boolean add(index, Object o);
boolean delete (Object o);
Object get(int index);
boolean contain(Object o);
boolean equals (Collection str),
boolean clear(),
int size(),
* */

public class ImplementArrayList<Obj>{
    private int sizeArray = 16;
    private Object[] mass = new Object[sizeArray];
    private int elementCount = 0;


        public boolean addObg(Object obj){
            if (elementCount >= mass.length/2){
               mass = Arrays.copyOf(mass, mass.length*2);
            }
            mass[elementCount++] = obj;
            return true;
        }

    public boolean addIndex(int index, Object o){
        if (elementCount >= mass.length/2){
            mass = Arrays.copyOf(mass, mass.length*2);
        }
        for (int i = 0; i < mass.length; i++){
             if (mass[i] == mass[index]){
                 mass[index] = o;
             }
        }
            return true;
    }

    public void deleteObj (Object obj){
            int index = 0;
        Object[] temp = new Object[mass.length - 1];
        for (int i = 0; i < mass.length; i ++) {
            if (mass[i].equals(obj)){
                index = i;
                //System.out.println(index);
            }
        }
        for (int j = index; j < mass.length - 1; j++) {
            System.arraycopy(mass,0,temp,0,index);
            System.arraycopy(mass,index +1, temp, index,mass.length - index - 1);
        }

    }

    public Object get(int index){
            return mass[index];
    }

    boolean contain(Object obj){
            for (int i = 0; i < mass.length; i++){
                if (mass[i].equals(obj))
                    return true;
            }
            return false;
    }

    public boolean equals(Object obj){
         if (this == obj){
             return true;
         }
         if (!(obj instanceof Object)){
             return false;
        }
         Object o = (Object) obj;
         return true;
    }

    boolean clear(){
            for (int i = 0; i < mass.length; i++){
                mass[i] = null;
            }
            return true;
    }

    int size(){
            int count = 0;
            for (int i = 0; i < mass.length; i++){
                count++;
            }
            return count;
    }

    public static void main(String[] args) {
       ImplementArrayList<String> impStr = new ImplementArrayList<>();
       impStr.addObg("добавили");
       //impStr.addIndex(1, "добавили2");
       impStr.deleteObj("добавили");
       System.out.println(impStr.get(0));
      // System.out.println(impStr.get(1));
        //System.out.println(impStr.contain("добавили"));
       // impStr.clear();
        //System.out.println(impStr.get(0));
        //System.out.println(impStr.get(1));
        //System.out.println(impStr.size());
        //System.out.println(impStr.get(0).equals(impStr.get(1)));
        }
    }



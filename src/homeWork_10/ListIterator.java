package homeWork_10;

import homeWork_8.ImplementArrayList;

import java.util.Arrays;
import java.util.Iterator;

public class ListIterator {
    public static class ImplementArrayList<Obj> implements Iterator {
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

        @Override
        public boolean hasNext() {
            return elementCount < mass.length;
        }

        @Override
        public Object next() {
           if (!hasNext()){
           }
            return mass[elementCount++];
        }
    }
}

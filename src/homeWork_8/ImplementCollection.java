package homeWork_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
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

public class ImplementCollection implements Collection {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");                //add(Object o)
        list.add("2");                //add(Object o)
        list.add("3");                //add(Object o)
        list.add("4");                //add(Object o)
        list.add("5");                //add(Object o)
        list.add("6");                //add(Object o)
        list.add(2, "88");  //add(index, Object o)
        list.remove(3);            //delete (Object o)



        for (String s : list){
            System.out.println(s);

        }
        System.out.println(list.get(4));  //get(int index)
        System.out.println(list.contains("88"));    //contain(Object o)
        System.out.println(list.equals(list));     //equals (Collection str)

        System.out.println(list.size());           //size()
        list.clear();                            //clear()
        System.out.println(list.size());         //size()
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

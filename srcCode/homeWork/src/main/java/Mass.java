import java.util.Arrays;
import java.util.List;

public class Mass<Obj> {

    public int sizeArray = 16;
    public Object[] mass = new Object[sizeArray];
    public int elementCount = 0;

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
        Object[] temp = new Object[mass.length];
        for (int i = 0; i < mass.length; i ++) {
            if (mass[i] == obj){
                index = i;
            }

        }
        System.arraycopy(mass,index + 1, mass, index,mass.length - index - 1);

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
        Object[] newMass = new  Object[mass.length];
        System.arraycopy(newMass,0,mass,0,newMass.length);
        elementCount = 0;
        return true;
    }

    int size(){
        for (int i = 0; i < mass.length; i++){
            elementCount++;
        }
        return elementCount;
    }


}

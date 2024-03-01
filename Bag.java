import java.util.ArrayList;
import java.util.Random;

public class Bag<T> {
    // initialize a array to store elements in bag
    private ArrayList<T> elements;
    private int size;

    //constructor
    public Bag() {
        elements = new ArrayList<>();
        size =0;
    }
    
    //def add method
    public void add(T item){
        elements.add(item);
        size++;
    }
    // def clear method
    public void clear(){
        elements = new ArrayList<>();
        size =0;
    }

    // def contains method
    public boolean contains(T item) {
        boolean res = false;
        for(int i = 0; i < elements.size();i++){
            if(elements.get(i)==item){
                res =true;
                break;
            }
        }
        return res;
    }

    // def grab method
    public T grab() {
        if (size == 0) {
            return null; 
        }
        Random random = new Random();
        return elements.get(random.nextInt(elements.size()));
    }

    // def grab method
    public boolean isEmpty() {
        return size == 0;
    }

    // def remove method
    public boolean remove(T item) {
        size --;
        return elements.remove(item);
    }

    //def size method
    public int size() {
        return size;
    }
    // def toArray method
    public Object[] toArray() {
        return elements.toArray();
    }

    // def toArray method
    public String toString() {
        return elements.toString();
    }






    
}
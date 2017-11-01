package hrlovecraft;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Warehouse <T> {


    private ArrayList<T> list = new ArrayList<T>();


    public void add(T item){
        list.add(item);
    };

    public ArrayList<T> getList() {
        return list;
    }

}

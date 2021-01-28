package demo;
import java.lang.reflect.Array;
import java.util.*;
public class CustomEnumeration implements Enumeration{

    private final int arraySize;
    private int arrayCursor;
    private final Object array;

    public CustomEnumeration(Object obj) {
        arraySize = Array.getLength(obj);
        array = obj;
    }

    @Override
    public boolean hasMoreElements() {
        return arrayCursor<arraySize;
    }

    @Override
    public Object nextElement() {
        return Array.get(array, arrayCursor++);
    }
}

package lecture2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/***
 * Псевдокод как выглядить ArrayList под капотом
 * @param <T>
 */
public class MyArrayList<T extends Object> implements Collection<T> {
     Object[] data;
     private final static int DEFAULT_SIZE = 5;

     private int size;

     private int maxSize = 1000;

    public MyArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object obj : this.data) {
            if (obj.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return this.data;
    }

    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (size < maxSize) {
            if (data.length == this.size) {
                grow();
            }
            data[this.size] = t;
            this.size++;
            return true;
        } else {
            return false;
        }
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (T) this.data[index];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        if (this.data.length == 0) {
            stringBuilder.append("]");
        } else {
            for (Object obj : this.data) {
                if (obj != null) {
                    stringBuilder.append(obj).append(",");
                }
            }
        }
        String s = stringBuilder.toString();
        if (s.length() == 1) {
            return s + "]";
        } else {
            return s.substring(0, s.length() - 1) + "]";
        }
    }

    private void grow() {
        this.data = Arrays.copyOf(this.data, this.data.length + DEFAULT_SIZE);
    }

    @Override
    public boolean remove(Object o) {
        boolean contains = contains(o);
        if (contains) {

        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {
        this.data = new Object[DEFAULT_SIZE];
    }
}

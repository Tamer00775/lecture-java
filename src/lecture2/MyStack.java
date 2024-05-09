package lecture2;

import java.util.Arrays;
import java.util.NoSuchElementException;

/***
 * Псевдокод как выглядит Стек под капотом
 * @param <T>
 */
public class MyStack<T> {
    Object[] data; // [1, 2, 3, 4, 5]
    private final Object[] EMPTY_DATA = new Object[0];
    private int size;

    public MyStack() {
        data = new Object[0];
    }

    public T push(T t) {
        if (data == EMPTY_DATA) {
            data = Arrays.copyOf(data, data.length + 1);
        }
        if (data.length == size) {
            data = Arrays.copyOf(data, data.length + 1);
        }
        data[size++] = t;
        return t;
    }

    public T peek() {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        return (T) this.data[size - 1];
    }

    public T pop() {
        T peek = peek();
        removeAt(this.size - 1);
        return peek;
    }

    private void removeAt(int index) {
        Object[] newData = new Object[this.data.length - 1];
        for (int i = 0; i < index; i++) {
            newData[i] = this.data[i];
        }

        for (int i = index + 1; i < this.data.length; i++) {
            newData[newData.length - i] = this.data[i];
        }
        this.data = newData;
        this.size = data.length;
    }
}

package lecture2;

import java.util.NoSuchElementException;

/**
 * Псевдокод реализации MyLinkedList
 * @param <T>
 */
public class MyLinkedList<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    public boolean add(T t) {
        linkLast(t);
        return true;
    }

    public int getSize() {
        return this.size;
    }

    public T getFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.item;
    }

    public T getLast() {
        if (this.last == null) {
            throw new NoSuchElementException();
        }
        return last.item;
    }
    public void linkLast(T item) { // 2
        Node<T> oldLast = this.last; // 1
        Node<T> newNode = new Node<>(last, item, null);
        this.last = newNode;
        if (oldLast == null) {
            this.first = newNode;
        } else {
            oldLast.next = newNode;
        }
        size++;
    }

    public void linkFirst(T item) {
        Node<T> first = this.first;
        Node<T> newNode = new Node<>(null, item, first); //  null <- [0] -> [1]
        this.first = newNode;
        if (first == null) {
            this.last = newNode;
        } else {
            first.prev = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (this.first == null) {
            throw new NoSuchElementException();
        }
        return unLinkFirst(this.first);
    }

    public T removeLast() {
        if (this.last == null) {
            throw new NoSuchElementException();
        }
        return unLinkLast(this.last);
    }

    public T unLinkFirst(Node<T> first) {
        // [0] -> [1] -> [2]
        Node<T> next = first.next; // 1
        T item = next.item; // 1
        first.item = null; // 0 -> null
        first.prev = null; //
        this.first = next;
        if (next == null) {
            this.last = null;
        } else {
            next.prev = null;
        }
        this.size--;
        return item;
    }

    public T unLinkLast(Node<T> last) {
        Node<T> prev = last.prev;
        T item = last.item;
        this.last = prev;
        if (prev == null) {
            this.first = null;
        } else {
            prev.next = null;
        }
        this.size--;
        return item;
    }

    public String toString() {
        if (this.first == null) {
            return "[]";
        }
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node<T> temp = this.first;
        while(true) {
            str.append(temp.item).append(", ");
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        if (str.length() == 0) {
            return "[]";
        }
        return str.substring(0,  str.length() - 2) + "]";
    }
}
class Node<T> {
    T item;
    Node<T> next;
    Node<T> prev;

    Node(Node<T> prev, T item, Node<T> next) {
        this.prev = prev;
        this.item = item;
        this.next = next;
    }
}

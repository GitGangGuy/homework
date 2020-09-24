package linkedlist;

import java.lang.reflect.Array;

final public class LinkedList<T> {
    private T[] objects;

    private void Rewrite(Class<T> _objects) {
        @SuppressWarnings("unchecked")
        final T[] objects = (T[]) Array.newInstance(_objects, _objects.length);
        this.objects = objects;
    }

    public LinkedList(Class<T> _val, int _size) {

    }

    public void add(T item) {

    }
}
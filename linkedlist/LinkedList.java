package linkedlist;

import java.lang.reflect.Array;
import java.util.Arrays;

final public class LinkedList<T> {
    private T type;
    private T[] items;

    private Class<? extends Object> typeToClass() {
        return type.getClass();
    }

    private T[] TypeArray(int _length) {
        @SuppressWarnings("unchecked")
        final T[] __array = (T[]) Array.newInstance(typeToClass(), _length);
        return __array;
    }

    private void Reset() {
        this.items = TypeArray(0);
    }

    private void addItem(T _item) {
        final int size = items.length + 1;
        final T[] __items = Arrays.copyOf(items, size);
        __items[size] = _item;
        items = __items;
    }

    private void InsertItem(T _item, int _pos) {
        final int size = items.length + 1;
        final T[] __items = Arrays.copyOfRange(items, 0, _pos);
        __items[_pos] = _item;
        // todo
        items = __items;
    }

    public LinkedList() {
        Reset();
    }

    public void add(T _item) {
        addItem(_item);
    }

    public void addLast(T _item) {
        addItem(_item);
    }

    public void addFirst()

    public void remove()
}
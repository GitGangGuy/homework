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
        try {
            @SuppressWarnings("unchecked")
            final T[] __array = (T[]) Array.newInstance(typeToClass(), _length);
            return __array;
        } catch (Exception e) {
            throw new RuntimeException("Passed invalid type for generic array");
        }
    }

    private T[] Reset() {
        return TypeArray(0);
    }

    private T[] AddItem(T[] _array, T _item) {
        final int __size = _array.length + 1;
        T[] __array = Arrays.copyOf(_array, __size);
        __array[__size - 1] = _item;
        return __array;
    }

    private T[] InsertItem(T[] _array, T _item, int _pos) {
        final int __size = _array.length + 1;
        T[] __array = AddItem(Arrays.copyOf(_array, _pos), _item);
        __array = Arrays.copyOf(__array, __size);
        for (int i = _pos + 1; i < __size; i++) {
            __array[i] = _array[i];
        }
        return __array;
    }

    private T[] RemoveItem(T[] _array, int _pos) {
        final int __size = _array.length - 1;
        T[] __array = Arrays.copyOf(Arrays.copyOf(_array, _pos), __size);
        for (int i = _pos; i < __size; i++) {
            __array[i] = _array[i + 1];
        }
        return __array;
    }

    public LinkedList() {
        this.items = Reset();
    }

    public void insert(T _item, int _pos) {
        this.items = InsertItem(this.items, _item, _pos);
    }

    public void add(T _item) {
        this.items = AddItem(this.items, _item);
    }

    public void addLast(T _item) {
        this.add(_item);
    }

    public void addFirst(T _item) {
        this.insert(_item, 0);
    }

    public void remove(int _pos) {
        this.items = RemoveItem(this.items, _pos);
    }

    public int size() {
        return this.items.length;
    }

    public T get(int _pos) {
        return this.items[_pos];
    }
}
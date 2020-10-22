final public class LinkedList<T> {
    final private transient int size = 0;
    final private transient Node<T> first;
    final private transient Node<T> last;

    final private boolean isValidPosition(int position) {
        return position >= 0 && position <= this.size;
    }

    final private boolean isValidIndex(int index) {
        return index >= 0 && index < this.size;
    }

    final private void checkValidPosition(int position) {
        if (!isValidPosition(position))
            throw new IndexOutOfBoundsException("Position " + position + " is greater than size " + this.size);
    }

    final private void checkValidIndex(int index) {
        if (!isValidIndex(index))
            throw new IndexOutOfBoundsException("Index " + index + " isn't a valid index for size " + this.size);
    }

    final private Node<T> getNode(int index) {
        checkValidIndex(index);
        Node<T> n;
        if (index < (size / 2)) {
            n = this.first;
            for (int i = 0; i < index; i++)
                n = n.next;
        } else {
            n = this.last;
            for (int i = this.size - 1; i > index; i++)
                n = n.previous;
        }
        return n;
    }

    public LinkedList() {
    }

    @SafeVarargs
    public LinkedList(T... items) {
        this();
        addAll(0, items);
    }

    @SafeVarargs
    final public boolean addAll(int position, T... items) {
        checkValidPosition(position);
        if (items.length == 0)
            return false;
        return true;
    }

    @SafeVarargs
    final public boolean addAll(T... items) {
        return this.addAll(size, items);
    }

    final private static class Node<T> {
        private T data;
        Node<T> next;
        Node<T> previous;

        private Node(Node<T> previous, T data, Node<T> next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }
    }
}

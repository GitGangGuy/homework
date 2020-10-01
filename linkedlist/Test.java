package linkedlist;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        for (var i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
package futures;

final class Element {
    private int num;
    private Element(int _num) {
        num = _num;
    }
    static int getNum() {
        return num;
    }
}
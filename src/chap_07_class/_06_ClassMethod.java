package chap_07_class;

public class _06_ClassMethod {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        BlackBox.callServiceCenter();
        BlackBox b2 = new BlackBox();
        BlackBox.callServiceCenter();
        System.out.println(BlackBox.cnt);
    }
}

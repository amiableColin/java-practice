package chap_09_generics;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // Wrapper 클래스: Integer, Double, Character, Float, Byte와 같이, 기본 자료형을 객체 자료형으로 사용할 수 있도록 하는 자료형.
        Integer i = 123;    // int i = 123;
        Double d = 1.0;     // double d = 1.0;
        Character c = 'A';  // char c = 'A';
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println("------------------------");

        // 래퍼 클래스의 기능들(메서드들)
        System.out.println(i.byteValue());
        System.out.println(d.intValue());   // 실수를 int로 바꾼 형변환 데이터 출력
        System.out.println(c.charValue());
        System.out.println("------------------------");

        System.out.println(i.toString().getClass().getName());
    }
}

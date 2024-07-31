package chap_09_generics;

import java.util.Arrays;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스: 다양한 타입의 객체를 지원하는 클래스나 인터페이스, 메서드를 정의하는 방법.
        int[] iArray = {1,2,3,4,5};
        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A","B","C","D","E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);
        System.out.println("------------------------------------------");

        // 별도의 여러 개의 메서드 구현이 필요하지 않고, 제네릭스를 사용하면 하나의 메서드만으로도 모든 타입에 대응할 수 있음.
        printAnyArray(Arrays.stream(iArray).boxed().toArray(Integer[]::new));  // 기본자료형은 제네릭스 사용 시 오류가 발생. 제네릭스는 객체자료형만 지원.
        printAnyArray(Arrays.stream(dArray).boxed().toArray(Double[]::new));   // 그렇기 때문에 박싱을 통해 객체자료형(래퍼클래스)로 변환.
        printAnyArray(sArray);
    }

    // T: 타입을 의미함. T가 아닌 다른 이름도 가능하니, 굳이 국한되지 않도록 하자.
    // 제네릭 문자들: T(Type), K(Key), V(Value), E(Element)
    private static <T> void printAnyArray(T[] array) {
        for (T t: array)
            System.out.print(t + " ");
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s:sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] dArray) {
        for (double d:dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(int[] iArray) {
        for (int i:iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

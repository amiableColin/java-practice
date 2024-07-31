package chap_09_generics;

import chap_07_class.BlackBox;
import chap_09_generics.coffee.*;
import chap_09_generics.user.User;
import chap_09_generics.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스.
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();
        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();
        CoffeeByName c3 = new CoffeeByName(15);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();
        int c3Name = (int) c3.getName();    // 리턴 타입은 오브젝트이므로, 형변환 필요.
        System.out.println("주문 고객 번호: " + c3Name);
        String c4Name = (String) c4.getName();
        System.out.println("주문 고객 이름: " + c4Name);
        // 만약, 개발자가 실수로 c4Name에 c3.getName()을 넣으려고 시도한 경우, 코드를 실행해보기 전까지는 오류가 났는지 여부를 알 수 없음. <오브젝트 클래스의 한계>
        // c4Name = (String) c3.getName();
        System.out.println("----------------------------------------------------");
        // 제네릭 클래스의 장점: 코드 실행 전 다른 타입을 넣으면 오류가 발생. <오브젝트 클래스의 한계 극복>
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        int c5Name = c5.name;   // 형변환 역시 필요 X
        System.out.println("주문 고객 번호: " + c5Name);
        String c6Name = c6.name;
        System.out.println("주문 고객 이름: " + c6Name);
        System.out.println("---------------------------------------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();

        // 제네릭 타입을 제한을 걸었는데, 다른 객체를 넣으면 어떻게 될까?
        // CoffeeByUser<User> c9 = new CoffeeByUser<>(new BlackBox()); -> 오류 발생.

        System.out.println("-----------------------------");
        orderCoffee("김영철");
        orderCoffee(36);
        orderCoffee("김희철", "아메리카노");
        orderCoffee(37, "라떼");
    }
    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료: " + name);
    }
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료: " + name);
    }
}

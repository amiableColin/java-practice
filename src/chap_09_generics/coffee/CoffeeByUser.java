package chap_09_generics.coffee;

import chap_09_generics.user.User;

public class CoffeeByUser <T extends User> {    // User란 클래스를 상속하는 T를 사용해야 함. (제네릭스에 들어갈 타입 제한 가능.)
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + user.name);
        user.addPoint();
    }
}

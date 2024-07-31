package chap_09_generics.coffee;

public class Coffee <T> {   // 제네릭 클래스
    public T name;

    public Coffee(T name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + name);
    }
}

package chap_09_generics.coffee;

public class CoffeeByName {
    private Object name;

    public Object getName() {
        return name;
    }

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + name);
    }
}

package chap_09_generics.coffee;

public class CoffeeByNumber {
    private int waitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + waitingNumber);
    }
}

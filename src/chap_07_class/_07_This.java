package chap_07_class;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        System.out.println("b1의 모델명: " + b1.getModelName());
        System.out.println("---------------------------------------------------------------");
        BlackBox b2 = new BlackBox("까망이", "FHD", 200_000, "블랙");
        b2.appendModelName("(최신형)");
        System.out.println("b2의 모델명: " + b2.getModelName());
        b2.setPrice(-5000); // 이상한 값 삽입.
        System.out.println("이상한 값이 삽입된 후 b2의 가격: " + b2.getPrice());
    }
}

package chap_07_class;

public class _01_Class {
    public static void main(String[] args) {

//        // 차량용 블랙박스: 모델명, 해상도, 가격, 색상
//
//        // 첫 번째 제품
//        String modelName = "까망이";
//        String resolution = "FHD";
//        int price = 200_000;
//        String color = "블랙";
//
//        // 두 번째 제품
//        String modelName2 = "하양이";
//        String resolution2 = "UHD";
//        int price2 = 300_000;
//        String color2 = "화이트";

        // 또 다른 제품 개발
        BlackBox bbox = new BlackBox("까망이", "FHD", 200_000, "블랙");
        // BlackBox 클래스로부터 bbox '객체' 생성
        // bbox '객체'는 BlackBox 클래스의 '인스턴스'
        bbox.printData();
        System.out.println("-----------------------------------------");
        BlackBox bbox2 = new BlackBox("하양이", "UHD", 300_000, "화이트");
        bbox2.printData();

    }
}

package chap_08_abstract_class_and_interface;

import chap_08_abstract_class_and_interface.camera.Camera;
import chap_08_abstract_class_and_interface.camera.FactoryCam;
import chap_08_abstract_class_and_interface.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 -> 몰라도 되는 데이터를 숨기고, 추상화
        // 추상 클래스: 아직 완성되지 않은 클래스.
        // 추상 메서드: 추상 클래스와 인터페이스에서만 사용 가능한 껍데기만 있는 메서드.
        Camera camera1 = new FactoryCam();  // 추상 클래스의 업캐스팅
        Camera camera2 = new SpeedCam();    // 추상 클래스의 업캐스팅
        camera1.showMainFeature();
        camera2.showMainFeature();
    }
}

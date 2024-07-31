package chap_08_abstract_class_and_interface;

import chap_08_abstract_class_and_interface.camera.FactoryCam;
import chap_08_abstract_class_and_interface.detector.AdvancedFireDetector;
import chap_08_abstract_class_and_interface.detector.Detectable;
import chap_08_abstract_class_and_interface.detector.FireDetector;
import chap_08_abstract_class_and_interface.reporter.NormalReporter;
import chap_08_abstract_class_and_interface.reporter.Reportable;
import chap_08_abstract_class_and_interface.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스: 추상 클래스와는 다르게, 뼈대만 제공해줌.
        // + 자바의 추상 클래스는 단일 상속만 가능하다는 단점을 보완.
        Reportable normalReporter = new NormalReporter();  // 인터페이스 역시 업캐스팅 가능.
        normalReporter.report();

        System.out.println("----------------------------------------------");
        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("----------------------------------------------");
        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        System.out.println("----------------------------------------------");
        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();
        System.out.println();

        System.out.println("----------------------------------------------");
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(new AdvancedFireDetector()); // 익명 객체 전달.
        factoryCam.setReporter(new VideoReporter());
        factoryCam.detect();
        factoryCam.report();
    }
}

package chap_08_abstract_class_and_interface.detector;

public class AccidentDetector implements Detectable {
    @Override
    public void detect() {
        System.out.println("교통 사고를 감지합니다.");
    }
}

package chap_08_abstract_class_and_interface.reporter;

public class NormalReporter implements Reportable {
    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다.");
    }
}

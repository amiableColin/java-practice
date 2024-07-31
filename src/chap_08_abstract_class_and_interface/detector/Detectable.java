package chap_08_abstract_class_and_interface.detector;

public interface Detectable { // 화재 감지 기능
    // String name = "감지자";    // 이 형태는 public static final임.
    void detect();  // 자동으로 public abstract가 들어감.
}

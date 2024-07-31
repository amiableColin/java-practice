package chap_08_abstract_class_and_interface;
import chap_08_abstract_class_and_interface.camera.SpeedCam;
import chap_08_abstract_class_and_interface.detector.AccidentDetector;
import chap_08_abstract_class_and_interface.reporter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}

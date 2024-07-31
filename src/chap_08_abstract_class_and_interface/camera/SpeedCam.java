package chap_08_abstract_class_and_interface.camera;

import chap_08_abstract_class_and_interface.detector.AccidentDetector;
import chap_08_abstract_class_and_interface.detector.Detectable;
import chap_08_abstract_class_and_interface.reporter.Reportable;
import chap_08_abstract_class_and_interface.reporter.VideoReporter;

public class SpeedCam extends Camera {
    private Detectable accidentDetector;
    private Reportable videoReporter;

    public void setDetector(AccidentDetector accidentDetector) {
        this.accidentDetector = accidentDetector;
    }

    public void setReporter(VideoReporter videoReporter) {
        this.videoReporter = videoReporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect() {
        if (this.accidentDetector != null)
            this.accidentDetector.detect();
        else System.out.println("객체가 생성되지 않았습니다.");
    }

    public void report() {
        if (this.videoReporter != null)
            this.videoReporter.report();
        else
            System.out.println("객체가 생성되지 않았습니다.");
    }
}

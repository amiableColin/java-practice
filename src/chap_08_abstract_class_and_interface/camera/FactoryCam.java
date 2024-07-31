package chap_08_abstract_class_and_interface.camera;

import chap_08_abstract_class_and_interface.detector.AdvancedFireDetector;
import chap_08_abstract_class_and_interface.detector.Detectable;
import chap_08_abstract_class_and_interface.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    private Detectable detector;
    private Reportable reporter;

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        this.detector.detect();
    }

    @Override
    public void report() {
        this.reporter.report();
    }
}

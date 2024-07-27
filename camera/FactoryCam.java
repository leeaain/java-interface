package org.chap_08.camera;

import org.chap_08.detector.Detectable;
import org.chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    private Detectable detectable;
    private Reportable reportable;

    public void setDetectable(Detectable detectable) {
        this.detectable = detectable;
    }

    public void setReportable(Reportable reportable) {
        this.reportable = reportable;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    // interface
    @Override
    public void detect() {
        detectable.detect();
    }

    @Override
    public void report() {
        reportable.report();
    }
}

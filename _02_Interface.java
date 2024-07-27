package org.chap_08;

import org.chap_08.camera.FactoryCam;
import org.chap_08.reporter.*;
import org.chap_08.detector.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        // detect 인터페이스
        Detectable normalDetector = new FireDetector();
        normalDetector.detect();

        Detectable advancedDetector = new AdvancedFireDetector();
        advancedDetector.detect();

        System.out.println("======================================");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetectable(advancedDetector); // "일반 성능으로 화재를 감지합니다."를 출력함
        factoryCam.setReportable(videoReporter); // "일반 화재 신고를 진행합니다."를 출력함
        factoryCam.detect();
        factoryCam.report();
    }
}

package org.chap_08.reporter;

public class VideoReporter implements Reportable {
    @Override
    public void report() {
        System.out.println("직전 30초 영상과 함께 신고 진행");
    }

}

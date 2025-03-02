package org.chap_08.camera;

public class SpeedCamera extends Camera{
    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    // interface
    public void detect() {
        System.out.println("사고를 감지합니다.");
    }

    public void report() {
        System.out.println("사고 신고를 진행합니다.");
    }
}

package org.chap_08.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진 촬영함.");
    }

    public void recordVideo() {
        System.out.println("동영상 녹화함.");
    }

    // 추상 메소드 선언
    public abstract void showMainFeature();
}

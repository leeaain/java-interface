package org.chap_08;

import org.chap_08.camera.Camera;
import org.chap_08.camera.FactoryCam;

public class _01_AtstractClass {
    public static void main(String[] args) {
        // 데이터 추상화(Data Abstraction)
        Camera factoryCam = new FactoryCam();
        factoryCam.showMainFeature();
    }
}

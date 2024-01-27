package no_1_Strategy.camerazoom;

import no_1_Strategy.ICameraZoom;

public class NoCameraZoom implements ICameraZoom {
    @Override
    public void detail() {
        System.out.println("no camera zoom");
    }
}

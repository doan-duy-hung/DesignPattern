package no_1_Strategy;

public class Phone {

    private IWaterProtect waterProtect;

    private ICameraZoom cameraZoom;

    public Phone(IWaterProtect waterProtect, ICameraZoom cameraZoom) {
        this.waterProtect = waterProtect;
        this.cameraZoom = cameraZoom;
    }

    public void detail() {
        System.out.println("detail this phone;");
        this.waterProtect.detail();
        this.cameraZoom.detail();
    }
}

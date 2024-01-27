package org.example;

import no_1_Strategy.IWaterProtect;
import no_1_Strategy.Phone;
import no_1_Strategy.camerazoom.CameraZoom;
import no_1_Strategy.camerazoom.NoCameraZoom;
import no_1_Strategy.waterprotect.NoWaterProtect;
import no_1_Strategy.waterprotect.WaterProtect;
import no_2_Observer.BinaryObserver;
import no_2_Observer.HexaObserver;
import no_2_Observer.OctalObserver;
import no_2_Observer.Subject;
import no_4_Factory_Method.Shape;
import no_4_Factory_Method.ShapeFactory;
import no_6_Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        /* 1 */
//        Phone noWaterProtect_noZoom = new Phone(new NoWaterProtect(), new NoCameraZoom());
//        noWaterProtect_noZoom.detail();
//        Phone noWaterProtect_Zoom = new Phone(new NoWaterProtect(), new CameraZoom());
//        noWaterProtect_Zoom.detail();
//        Phone waterProtect_noZoom = new Phone(new WaterProtect(), new NoCameraZoom());
//        waterProtect_noZoom.detail();
//        Phone waterProtect_Zoom = new Phone(new WaterProtect(), new CameraZoom());
//        waterProtect_Zoom.detail();

        /* 2 */
//        Subject subject = new Subject();
//        new HexaObserver(subject);
//        new OctalObserver(subject);
//        new BinaryObserver(subject);
//        subject.setState(15);
//        subject.setState(10);

        /* 4 */
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        /* 6 */
//        System.out.println(Singleton.getInstance().getS());
//        System.out.println(Singleton.getInstance().getS());
    }
}
package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CameraManagerTest {

    @Test
    void addCamera() {
        CameraManager cameraManager = new CameraManager();

        DigitalCamera digitalcamera1 = new DigitalCamera("Cannot", "QW-90", "JH12",
                "1234x3234", 5436.43, "SD", 1234);
        cameraManager.addCamera(digitalcamera1);
        assertTrue( cameraManager.cameras.contains(digitalcamera1));
    }


    @Test
    void findCameraByModel(){
        CameraManager cameraManager = new CameraManager();
        FilmCamera filmCamera = new FilmCamera("Lumix", "FX-34", "EF_S", "Slides ", 400);
        DigitalCamera digitalCamera = new DigitalCamera("Cannot", "QW-90", "JH12",
                "1234x3234",5436.43, "SD", 1234);
        cameraManager.addCamera(filmCamera);
        cameraManager.addCamera(digitalCamera);
assertTrue(cameraManager.findCameraByModel("FX-34").contains(filmCamera));
assertFalse(cameraManager.findCameraByModel("FX-34").contains(digitalCamera));
    }

    @Test
    void findCameraByBrand(){
        CameraManager cameraManager = new CameraManager();
        FilmCamera filmCamera = new FilmCamera("Lumix", "FX-34", "EF_S", "Slides ", 400);
        DigitalCamera digitalCamera = new DigitalCamera("Cannot", "QW-90", "JH12",
                "1234x3234",5436.43, "SD", 1234);
        cameraManager.addCamera(filmCamera);
        cameraManager.addCamera(digitalCamera);
        assertTrue(cameraManager.findCameraByBrand("Lumix").contains(filmCamera));
        assertFalse(cameraManager.findCameraByBrand("Lumix").contains(digitalCamera));
    }
}
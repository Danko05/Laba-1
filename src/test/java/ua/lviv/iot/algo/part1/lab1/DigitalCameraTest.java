package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalCameraTest {

    @Test
    void TestSavePhoto() {
        DigitalCamera digitalCamera = new DigitalCamera("Cannot", "QW-90", "JH12", "1234x3234", 5436.43, "SD", 1234);
        assertEquals(1234, digitalCamera.getPhotosCount());
        digitalCamera.savePhoto();
        assertEquals(1235, digitalCamera.getPhotosCount());

    }

    @Test
    void TestEraseMemory() {
        DigitalCamera digitalCamera = new DigitalCamera("Cannot", "QW-90", "JH12", "1234x3234", 5436.43, "SD", 1234);
        assertEquals(1234, digitalCamera.getPhotosCount());
        digitalCamera.eraseMemory();
        assertEquals(0, digitalCamera.getPhotosCount());
    }

    @Test
    void TestChangeSettings() {
        DigitalCamera digitalCamera = new DigitalCamera("Cannot", "QW-90", "JH12", "1234x3234", 5436.43, "SD", 1234);
        assertEquals("1234x3234", digitalCamera.getResolution());
        assertEquals(5436.43, digitalCamera.getZoom());
        digitalCamera.changeSettings(digitalCamera.getResolution(), digitalCamera.getZoom());
        assertNotEquals("1234x4000", digitalCamera.getResolution());
        assertNotEquals(3.0, digitalCamera.getResolution());
    }

    @Test
    void TestTakePhoto() {
        DigitalCamera digitalCamera = new DigitalCamera("Cannot", "QW-90", "JH12", "1234x3234", 5436.43, "SD", 1234);
        assertEquals("1234x3234 5436.43", digitalCamera.takePhoto());
    }

    @Test
    void testToString() {

        DigitalCamera digitalCamera1 = new DigitalCamera("Canon", "EOS 6D ", "EF 50mm ", "26.2MP", 1.0, "SD", 12);
        digitalCamera1.toString();
        assertEquals("DigitalCamera(resolution=26.2MP, zoom=1.0, memoryCardType=SD, photosCount=12)", digitalCamera1.toString());
    }
}
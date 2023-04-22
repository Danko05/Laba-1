package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.*;


import static org.junit.jupiter.api.Assertions.*;

class CameraWriterTest {
    CameraWriter cameraWriter = new CameraWriter();


    @Test
    void emptyWriteTOFileTest(){
        List<Camera> list = new ArrayList<>();
        cameraWriter.writeToFile(list);
        if (list.isEmpty()){
            System.out.println("Error");
        }
        else {
            System.out.println("List isn't empty");
        }
        assertTrue(list.isEmpty());
    }


@Test
    void testWriteToFile() throws IOException{
    DigitalCamera digitalcamera1 = new DigitalCamera("Cannot", "QW-90",
            "JH12", "1234x3234", 5436.43, "SD", 1234);
    DigitalCamera digitalcamera2 = new DigitalCamera("Cannot", "QW-34",
            "NM12", "7584x5372", 35.43, "SD", 10364);
    FilmCamera filmcamera1 = new FilmCamera("Lumix", "FX-34", "EF_S",
            "Slides ", 400);
    FilmCamera filmcamera2 = new FilmCamera("Cannot", "FE-67", "TR-S",
            "Slides ", 1600);
    VideoCamera videocamera1 = new VideoCamera("Cannot", "RX_3",
            "HOKO", "HD-CVI  ", 2);
    VideoCamera videocamera2 = new VideoCamera("Lumix", "RX_5",
            "HOKO", "AHD  ", 5);
    MirrorlessCameras mirrorlessCameras1 = new MirrorlessCameras("Cannot",
            "D5600", " AF-P", 1500, "MPEG-4");
    MirrorlessCameras mirrorlessCameras2 = new MirrorlessCameras("Nicon",
            "D478", " AF-G", 1200, "  MPEG-1");


    List<Camera> cameras = new ArrayList<>();
    cameras.add(digitalcamera1);
    cameras.add(digitalcamera2);
    cameras.add(filmcamera1);
    cameras.add(filmcamera2);
    cameras.add(videocamera1);
    cameras.add(videocamera2);
    cameras.add(mirrorlessCameras1);
    cameras.add(mirrorlessCameras2);

    cameraWriter.writeToFile(cameras);

    String expectedPath = "camera.csv";
    String resultPath = "Camera3.csv";
    Path expected = new File(expectedPath).toPath();
    Path result = new File(resultPath).toPath();
    assertEquals(-1L, Files.mismatch(expected, result));
}


}

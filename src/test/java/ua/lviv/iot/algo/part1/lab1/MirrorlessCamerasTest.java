package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MirrorlessCamerasTest {

    @Test
    void takePhoto() {


        MirrorlessCameras mirrorlessCameras = new MirrorlessCameras("Cannot", "D5600", " AF-P", 1500, " MPEG-4");
        mirrorlessCameras.takePhoto();
        assertEquals("1500 MPEG-4", mirrorlessCameras.takePhoto());
    }

    @Test
    void ToString() {


        MirrorlessCameras mirrorlessCameras1 = new MirrorlessCameras("Sony", "Alpha A7 III", "FE 24-70mm f/2.8 GM", 650, "4K UHD");
        mirrorlessCameras1.toString();
        assertEquals("MirrorlessCameras(weight=650, videoFormats=4K UHD)", mirrorlessCameras1.toString());
    }
}
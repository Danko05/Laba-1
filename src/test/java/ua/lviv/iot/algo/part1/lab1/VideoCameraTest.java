package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoCameraTest {


    @Test
    void takePhoto() {
        VideoCamera videoCamera = new VideoCamera("Cannot", "RX_3", "HOKO", "HD-CVI  ", 2);
        videoCamera.takePhoto();
        assertEquals("HD-CVI  2", videoCamera.takePhoto());
    }

    @Test
    void ToString() {
        VideoCamera videoCamera1 = new VideoCamera("HOCO", "PING-20", "HTC", "HD", 12);
        videoCamera1.toString();
        assertEquals("VideoCamera(videoFormat=HD, matrixSize=12)", videoCamera1.toString());
    }
}


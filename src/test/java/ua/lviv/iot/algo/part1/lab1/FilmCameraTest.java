package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmCameraTest {

    @Test
    public void testTakePhoto() {
        FilmCamera filmCamera = new FilmCamera("Lumix", "FX-34", "EF_S", "Slides ", 400);
        assertEquals("Slides 400", filmCamera.takePhoto());
    }


    @Test
    void ToString() {

        FilmCamera filmCamera1 = new FilmCamera("ZOMEI", "RW", "QW2", "Slides", 653);
        filmCamera1.toString();
        assertEquals("FilmCamera(filmType=Slides, filmISO=653)", filmCamera1.toString());
    }
}
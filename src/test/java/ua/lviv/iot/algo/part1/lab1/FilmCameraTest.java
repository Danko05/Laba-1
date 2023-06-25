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
        assertEquals("FilmCamera(filmType=Slides, filmISO=653)", filmCamera1.toString());
    }

    @Test
    void TestGetHeaders(){
        FilmCamera filmcamera1 = new FilmCamera("Lumix", "FX-34", "EF_S","Slides ", 400);
        assertEquals("brand,model,lens,filmType,filmISO",filmcamera1.getHeaders());
    }

@Test
    void TestToCSV(){
    FilmCamera filmcamera2 = new FilmCamera("Cannot", "FE-67", "TR-S","Slides ", 1600);
    assertEquals("Cannot,FE-67,TR-S,Slides ,1600",filmcamera2.toCSV());
}


}
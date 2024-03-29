package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.junit.Test;

@ToString
@Setter
@Getter

public class DigitalCamera extends Camera {

    private String resolution;
    private double zoom;
    private String memoryCardType;
    private int photosCount;


    DigitalCamera(final String brand, final String model, final String lens,
                  final String resolution, final double zoom,
                  final String memoryCardType, final int photosCount) {
        super(brand, model, lens);
        this.resolution = resolution;
        this.zoom = zoom;
        this.memoryCardType = memoryCardType;
        this.photosCount = photosCount;


    }

    public void savePhoto() {
        setPhotosCount(photosCount + 1);
    }

    public void eraseMemory() {
        setPhotosCount(0);
    }


    public void changeSettings(final String resolution, final double zoom) {
        setResolution(resolution);
        setZoom(zoom);
    }


    @Override
    public String takePhoto() {
        return resolution + " " + zoom;
    }


    public String getHeaders(){
        return super.getHeaders() + "," + "resolution,zoom,memoryCardType,photosCount";
    }

public String toCSV(){
        return super.toCSV() + "," + resolution + "," + zoom + "," + memoryCardType + "," + photosCount;
}
}

package ua.lviv.iot.algo.part1.lab1;

import lombok.*;


@ToString
@Setter

public class DigitalCamera extends Camera {

    private String resolution;
    private double zoom;
    private String memoryCardType;
    private int photosCount;


    DigitalCamera(String brand, String model, String lens, String resolution, double zoom, String memoryCardType, int photosCount) {
        this.resolution = resolution;
        this.zoom = zoom;
        this.memoryCardType = memoryCardType;
        this.photosCount = photosCount;
        setBrand(brand);
        setLens(lens);
        setModel(model);

    }


    public void savePhoto() {
        setPhotosCount(photosCount + 1);
    }

    public void eraseMemory() {
        setPhotosCount(0);
    }

    public void changeSettings(String resolution, double zoom) {
        setResolution(resolution);
        setZoom(zoom);
    }


    @Override
    public String takePhoto() {
        return resolution + " " + zoom;
    }
}
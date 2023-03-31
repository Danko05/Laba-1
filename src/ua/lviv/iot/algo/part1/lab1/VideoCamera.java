package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@ToString
public class VideoCamera extends Camera {

    private String videoFormat;
    private int matrixSize;

    VideoCamera(String brand, String model, String lens, String videoFormats, int matrixSize) {
        this.videoFormat = videoFormats;
        this.matrixSize = matrixSize;
        setBrand(brand);
        setLens(lens);
        setModel(model);
    }

    @Override
    public String takePhoto() {
        return videoFormat + matrixSize;
    }
}

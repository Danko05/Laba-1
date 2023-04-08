package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@ToString
public class MirrorlessCameras extends Camera {
    private int weight;
    private String videoFormats;

    MirrorlessCameras(String brand, String model, String lens, int weight, String videoFormats) {
        this.weight = weight;
        this.videoFormats = videoFormats;
        setBrand(brand);
        setLens(lens);
        setModel(model);
    }

    @Override
    public String takePhoto() {
        return weight + videoFormats;
    }
}

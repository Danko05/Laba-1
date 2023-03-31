package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

import java.io.File;


@ToString

public class FilmCamera extends Camera {

    private String filmType;
    private int filmISO;

    FilmCamera(String brand, String model, String lens, String filmType, int filmISO) {
        this.filmType = filmType;
        this.filmISO = filmISO;
        setBrand(brand);
        setLens(lens);
        setModel(model);
    }

    @Override
    public String takePhoto() {
        return filmType + filmISO;
    }


}

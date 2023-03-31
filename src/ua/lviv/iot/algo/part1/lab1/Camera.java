package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public abstract class Camera {

    private String brand;
    private String model;
    private String lens;


    public abstract String takePhoto();

    public void add(Camera camera) {
    }
}
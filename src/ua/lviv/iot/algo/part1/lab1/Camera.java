package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Camera {
    private String model;
    private String resolution;
    private double zoom;
    private String memoryCardType;
    private int photosCount;

    public static Camera instance = new Camera();

    public Camera() {
    }

    public static Camera getInstance() {
        return instance;
    }

    public void resetZoom() {
        setZoom(1.0d);
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

    public static void main(String[] args) {
        Camera[] cameras = {
                new Camera(),
                new Camera("Cannot","1024x750",438.9,"Sd",1000),
                Camera.getInstance(),
                Camera.getInstance()};

        for (Camera camera : cameras) {
            System.out.println(camera);
        }

    }
}

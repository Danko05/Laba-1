package ua.lviv.iot.algo.part1.lab1.Writer;

import ua.lviv.iot.algo.part1.lab1.Model.Camera;
import ua.lviv.iot.algo.part1.lab1.Model.DigitalCamera;

import java.io.*;
import java.util.*;


public class CameraWriter {
    public void writeToFile(List<Camera> cameras) {
        if (!cameras.isEmpty()) {
            String finalFileName = "camera.csv";
            try (PrintWriter printWriter = new PrintWriter(finalFileName)) {
                Collections.sort(cameras, Comparator.comparing(o -> o.getClass().getName()));
                Class current = null;
                for (Camera camera : cameras) {
                    if (camera.getClass() != current) {
                        printWriter.println(camera.getHeaders());
                        current = camera.getClass();
                    }
                    printWriter.println(camera.toCSV());
                }
            } catch (FileNotFoundException e) {

            }
        }

    }
}


























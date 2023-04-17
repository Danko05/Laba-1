package ua.lviv.iot.algo.part1.lab1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CameraWriter {


    public void writeToFile(List<Camera> cameras) {
        PrintWriter out = null;

        try {
            File csvFile = new File("camera.csv");
            out = new PrintWriter(new FileWriter(csvFile));
            Map<Class<? extends Camera >,String > headersMap= new HashMap<>();
            for (Camera camera : cameras) {
                Class<? extends Camera > cameraClass = camera.getClass();
                String headers = headersMap.get(cameraClass);
                if (headers == null){
                    headers = camera.getHeaders();
                    headersMap.put(cameraClass,headers);
                    out.println(headers);
                }
                out.println(camera.toCSV());
            }

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally{
            if (out != null){
                out.close();
            }
        }

    }
}


























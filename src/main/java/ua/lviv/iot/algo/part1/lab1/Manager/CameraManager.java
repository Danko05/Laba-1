package ua.lviv.iot.algo.part1.lab1.Manager;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import ua.lviv.iot.algo.part1.lab1.Model.*;
import ua.lviv.iot.algo.part1.lab1.Writer.CameraWriter;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor

@Setter
@Getter
@ToString
public final class CameraManager {
    public static List<Camera> cameras = new ArrayList<>();

    public List<Camera> findCameraByBrand(final String brand) {

        return cameras.stream()
                .filter(i -> i.getBrand() == brand)
                .collect(Collectors.toList());
    }


    public List<Camera> findCameraByModel(final String model) {
        return cameras.stream()
                .filter(i -> i.getModel() == model)
                .collect(Collectors.toList());

    }

    public void addCamera(final Camera camera) {
        cameras.add(camera);

    }

    public static void main(String[] args) throws FileNotFoundException {


        DigitalCamera digitalcamera1 = new DigitalCamera("Cannot", "QW-90",
                "JH12", "1234x3234", 5436.43, "SD", 1234);
        DigitalCamera digitalcamera2 = new DigitalCamera("Cannot", "QW-34",
                "NM12", "7584x5372", 35.43, "SD", 10364);
        cameras.add(digitalcamera1);
        cameras.add(digitalcamera2);


        FilmCamera filmcamera1 = new FilmCamera("Lumix", "FX-34", "EF_S",
                "Slides ", 400);
        FilmCamera filmcamera2 = new FilmCamera("Cannot", "FE-67", "TR-S",
                "Slides ", 1600);
        cameras.add(filmcamera1);
        cameras.add(filmcamera2);

        VideoCamera videocamera1 = new VideoCamera("Cannot", "RX_3",
                "HOKO", "HD-CVI  ", 2);
        VideoCamera videocamera2 = new VideoCamera("Lumix", "RX_5",
                "HOKO", "AHD  ", 5);
        cameras.add(videocamera1);
        cameras.add(videocamera2);

        MirrorlessCameras mirrorlessCameras1 = new MirrorlessCameras("Cannot",
                "D5600", " AF-P", 1500, "MPEG-4");
        MirrorlessCameras mirrorlessCameras2 = new MirrorlessCameras("Nicon",
                "D478", " AF-G", 1200, "  MPEG-1");
        cameras.add(mirrorlessCameras1);
        cameras.add(mirrorlessCameras2);

        for (Camera elements : cameras) {

            System.out.println(elements.takePhoto());
        }

        CameraWriter cameraWriter = new CameraWriter();
        cameraWriter.writeToFile(cameras);
    }

}


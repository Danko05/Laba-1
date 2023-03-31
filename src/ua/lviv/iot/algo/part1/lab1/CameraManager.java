package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class CameraManager {
    public static Camera addCamera(final Camera camera) {
        camera.add(camera);
        return camera;
    }

    public static void main(String[] args) {


        List<Camera> camera = new ArrayList<>();


        DigitalCamera digitalcamera1 = new DigitalCamera("Cannot", "QW-90", "JH12", "1234x3234", 5436.43, "SD", 1234);
        DigitalCamera digitalcamera2 = new DigitalCamera("Cannot", "QW-34", "NM12", "7584x5372", 35.43, "SD", 10364);
        camera.add(digitalcamera1);
        camera.add(digitalcamera2);


        FilmCamera filmcamera1 = new FilmCamera("Lumix", "FX-34", "EF_S", "Slides ", 400);
        FilmCamera filmcamera2 = new FilmCamera("Cannot", "FE-67", "TR-S", "Slides ", 1600);
        camera.add(filmcamera1) ;
        camera.add(filmcamera2);

        VideoCamera videocamera1 = new VideoCamera("Cannot", "RX_3", "HOKO", "HD-CVI  ", 2);
        VideoCamera videocamera2 = new VideoCamera("Lumix", "RX_5", "HOKO", "AHD  ", 5);
        camera.add(videocamera1);
        camera.add(videocamera2);

        MirrorlessCameras mirrorlessCameras1 = new MirrorlessCameras("Cannot", "D5600", " AF-P", 1500, "MPEG-4");
        MirrorlessCameras mirrorlessCameras2 = new MirrorlessCameras("Nicon", "D478", " AF-G", 1200, "  MPEG-1");
        camera.add(mirrorlessCameras1);
        camera.add(mirrorlessCameras2);

        for (Camera elements : camera) {

            System.out.println(elements.takePhoto());
        }

        System.out.println(" ");
        camera.stream()
                .filter(i -> i.getBrand() == "Cannot")
                .forEach(System.out::println);


        camera.stream()
                .filter(i -> i.getModel() == "FX-34")
                .forEach(System.out::println);


    }


}
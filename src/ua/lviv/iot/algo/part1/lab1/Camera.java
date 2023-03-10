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
public static Camera getInstance() {
    return instance ;
}

public void resetZoom(){

    setZoom(1.0d);
}

public void savePhoto(){
    setPhotosCount(photosCount+1);

}

public void eraseMemory(){
    setPhotosCount(0) ;
}

public void changeSettings(String resolution, double zoom){
    setResolution(resolution ) ;
    setZoom(zoom) ;
}

@Override
public String toString(){
    return " model is : " + model +
     " \n resolution is : " + resolution;
    }

public static void main(String [] args){
    Camera[] cameras = new Camera [4];
    cameras[0] = new Camera ("CanonEos60d","1024х768",5.7d,"SD",1234);
    cameras[1] = new Camera();
    cameras[2] = Camera.getInstance();
    cameras[3] = Camera.getInstance();



    for (int i = 0; i < cameras.length ; i++){
    System.out.println(cameras[i].toString() );
    }


}


}

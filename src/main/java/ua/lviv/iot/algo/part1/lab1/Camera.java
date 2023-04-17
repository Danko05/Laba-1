package ua.lviv.iot.algo.part1.lab1;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
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

public String getHeaders(){
    return "brand,model,lens";
}

public String toCSV(){
    return brand + "," + model + "," + lens;

}

}


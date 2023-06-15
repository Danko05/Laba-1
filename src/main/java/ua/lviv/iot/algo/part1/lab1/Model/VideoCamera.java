package ua.lviv.iot.algo.part1.lab1.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ua.lviv.iot.algo.part1.lab1.Model.Camera;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class VideoCamera extends Camera {

    private String videoFormat;
    private int matrixSize;

    public VideoCamera(final String brand, final String model, final String lens,
                final String videoFormats, final int matrixSize) {
        super(brand, model, lens);
        this.videoFormat = videoFormats;
        this.matrixSize = matrixSize;

    }

    @Override
    public String takePhoto() {
        return videoFormat + matrixSize;
    }

    public String getHeaders(){
        return super.getHeaders() + "," + "videoFormat,matrixSize";
    }

    public String toCSV(){
    return super.toCSV() + "," + videoFormat + "," + matrixSize;
    }


}

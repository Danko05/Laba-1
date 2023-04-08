package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter

public class MirrorlessCameras extends Camera {
    private int weight;
    private String videoFormats;

    MirrorlessCameras(final String brand, final String model, final String lens,
                      final int weight, final String videoFormats) {
        super(brand, model, lens);
        this.weight = weight;
        this.videoFormats = videoFormats;

    }

    @Override
    public String takePhoto() {
        return weight + videoFormats;
    }
}

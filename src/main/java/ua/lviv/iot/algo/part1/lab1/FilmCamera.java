package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class FilmCamera extends Camera {

    private String filmType;
    private int filmISO;

    FilmCamera(final String brand, final String model, final String lens,
               final String filmType, final int filmISO) {
        super(brand, model, lens);
        this.filmType = filmType;
        this.filmISO = filmISO;

    }

    @Override
    public String takePhoto() {
        return filmType + filmISO;
    }


    public String getHeaders(){
        return super.getHeaders() + "," + "filmType,filmISO";
    }

    public String toCSV(){
        return super.toCSV() + "," + filmType + "," + filmISO;
    }
}

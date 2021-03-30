package be.thomasmore.glamarie.model;


import javax.persistence.*;

@Entity
public class Color {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Color_generator")
    @SequenceGenerator(name = "Color_generator", sequenceName = "Color_seq", allocationSize = 1)
    @Id
    private int id;
    private String colorName;

    public Color(int id, String colorName) {
        this.id = id;
        this.colorName = colorName;
    }

    public Color() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}

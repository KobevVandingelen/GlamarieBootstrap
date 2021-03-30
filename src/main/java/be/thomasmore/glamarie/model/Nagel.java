package be.thomasmore.glamarie.model;

import javax.persistence.*;

@Entity
public class Nagel {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Nagel_generator")
    @SequenceGenerator(name = "Nagel_generator", sequenceName = "Nagel_seq", allocationSize = 1)
    @Id
    private int id;
    private String stringPath;

    @ManyToOne(fetch = FetchType.LAZY)
    private  Portfolio portfolio;

    @ManyToOne
    private Color color;

    @ManyToOne
    private NagelDetail nagelDetail;



    public Nagel(int id, String stringPath) {
        this.id = id;
        this.stringPath = stringPath;
    }

    public Nagel() {

    }



    public int getId() {
        return id;
    }



    public String getStringPath() {
        return stringPath;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void stringPath(String stringPath) {
        this.stringPath = stringPath;
    }

    public void setStringPath(String stringPath) {
        this.stringPath = stringPath;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public NagelDetail getNagelDetail() {
        return nagelDetail;
    }

    public void setNagelDetail(NagelDetail nagelDetail) {
        this.nagelDetail = nagelDetail;
    }
}

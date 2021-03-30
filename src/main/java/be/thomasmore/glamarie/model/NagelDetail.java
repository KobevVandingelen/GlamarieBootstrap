package be.thomasmore.glamarie.model;


import javax.persistence.*;

@Entity
public class NagelDetail {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Nageldetail_generator")
    @SequenceGenerator(name = "Nageldetail_generator", sequenceName = "Nageldetail_seq", allocationSize = 1)
    @Id
    private int id;
    private String behandeling;
    private double prijs;
    private String duur;

    public NagelDetail(int id, String behandeling, double prijs, String duur) {
        this.id = id;
        this.behandeling = behandeling;
        this.prijs = prijs;
        this.duur = duur;
    }

    public NagelDetail() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBehandeling() {
        return behandeling;
    }

    public void setBehandeling(String behandeling) {
        this.behandeling = behandeling;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getDuur() {
        return duur;
    }

    public void setDuur(String duur) {
        this.duur = duur;
    }
}

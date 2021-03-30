package be.thomasmore.glamarie.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Portfolio {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Portfolio_generator")
    @SequenceGenerator(name = "Portfolio_generator", sequenceName = "Portfolio_seq", allocationSize = 1)
    @Id
    private int id;
    @NotBlank
    private String portfolioName;

    public Portfolio(int id, String portfolioName) {
        this.id = id;
        this.portfolioName = portfolioName;
    }

    public Portfolio() {

    }


    public int getId() {
        return id;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }
}

package be.thomasmore.glamarie.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Afspraak {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Afspraak_generator")
    @SequenceGenerator(name = "Afspraak_generator", sequenceName = "Afspraak_seq", allocationSize = 1)
    @Id
    private int id;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @NotNull
    private Date date;

    @NotNull
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
    private Date time;
    private String behandeling;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Afspraak(int id, Date date, Date time, String behandeling) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.behandeling = behandeling;
    }

    public Afspraak() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getBehandeling() {
        return behandeling;
    }

    public void setBehandeling(String behandeling) {
        this.behandeling = behandeling;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
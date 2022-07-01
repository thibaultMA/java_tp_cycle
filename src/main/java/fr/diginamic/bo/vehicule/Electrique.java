package fr.diginamic.bo.vehicule;

import fr.diginamic.bo.Vehicule;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.time.LocalDate;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Electrique extends Vehicule {
    private Integer autonomie;

    protected Electrique() {
    }

    public Integer getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(Integer autonomie) {
        this.autonomie = autonomie;
    }

    public Electrique(Integer autonomie) {
        this.autonomie = autonomie;
    }

    public Electrique(String marque, String modele, LocalDate dateAchet, Integer autonomie) {
        super(marque, modele, dateAchet);
        this.autonomie = autonomie;
    }
}

package fr.diginamic.bo.vehicule;

import fr.diginamic.bo.Vehicule;

import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
public class Velo extends Vehicule {
    private Integer nbrPLateau;
    private Integer nbrPignon;
    private Integer tarif = 490;
    public Velo() {
        setTarif(tarif);
    }

    public Velo(Integer nbrPLateau, Integer nbrPignon) {
        super();
        this.nbrPLateau = nbrPLateau;
        this.nbrPignon = nbrPignon;
        setTarif(tarif);
    }

    public Velo(String marque, String modele, LocalDate dateAchet, Integer nbrPLateau, Integer nbrPignon) {
        super(marque, modele, dateAchet);
        this.nbrPLateau = nbrPLateau;
        this.nbrPignon = nbrPignon;
        setTarif(tarif);
    }

    public Integer getNbrPLateau() {
        return nbrPLateau;
    }

    public void setNbrPLateau(Integer nbrPLateau) {
        this.nbrPLateau = nbrPLateau;
    }

    public Integer getNbrPignon() {
        return nbrPignon;
    }

    public void setNbrPignon(Integer nbrPignon) {
        this.nbrPignon = nbrPignon;
    }

    @Override
    public int compareTo(Vehicule o) {
        return this.getModele().compareTo(o.getModele());
    }
}

package fr.diginamic.bo.vehicule.electrique;

import fr.diginamic.bo.Vehicule;
import fr.diginamic.bo.vehicule.Electrique;

import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
public class gyroroue extends Electrique {
    private Integer tarif = 1890;
    public gyroroue() {
        setTarif(tarif);
    }

    public gyroroue(Integer autonomie) {
        super(autonomie);
        setTarif(tarif);
    }

    public gyroroue(String marque, String modele, LocalDate dateAchet, Integer autonomie) {
        super(marque, modele, dateAchet,  autonomie);
        setTarif(tarif);
    }
    @Override
    public int compareTo(Vehicule o) {
        return this.getModele().compareTo(o.getModele());
    }
}

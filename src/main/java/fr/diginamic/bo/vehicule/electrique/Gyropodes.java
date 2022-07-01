package fr.diginamic.bo.vehicule.electrique;

import fr.diginamic.bo.Vehicule;
import fr.diginamic.bo.vehicule.Electrique;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Gyropodes extends Electrique {
    Integer tailleMinimal;
    int tarif = 2990;

    public Gyropodes() {
        setTarif(tarif);
    }

    public Gyropodes(Integer autonomie, Integer tailleMinimal) {
        super(autonomie);
        this.tailleMinimal = tailleMinimal;
        setTarif(tarif);

    }

    public Gyropodes(String marque, String modele, LocalDate dateAchet, Integer autonomie, Integer tailleMinimal) {
        super(marque, modele, dateAchet, autonomie);
        this.tailleMinimal = tailleMinimal;
        setTarif(tarif);
    }

    public Integer getTailleMinimal() {
        return tailleMinimal;
    }

    public void setTailleMinimal(Integer tailleMinimal) {
        this.tailleMinimal = tailleMinimal;
    }

    @Override
    public int compareTo(Vehicule o) {
        return this.getModele().compareTo(o.getModele());
    }
}

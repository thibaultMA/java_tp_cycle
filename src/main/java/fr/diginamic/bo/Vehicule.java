package fr.diginamic.bo;



import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicule implements Comparable<Vehicule>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String marque;
    private String modele;
    private LocalDate dateAchet;
    private int tarifParHeure;
    private boolean Dispo;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "location_id")
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDispo() {
        return Dispo;
    }

    public void setDispo(Boolean dispo) {
        Dispo = dispo;
    }

    public Vehicule() {
    }

    public int getTarif() {
        return tarifParHeure;
    }

    public void setTarif(int tarif) {
        this.tarifParHeure = tarif;
    }

    public Vehicule(String marque, String modele, LocalDate dateAchet) {
        this.marque = marque;
        this.modele = modele;
        this.dateAchet = dateAchet;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public LocalDate getDateAchet() {
        return dateAchet;
    }

    public void setDateAchet(LocalDate dateAchet) {
        this.dateAchet = dateAchet;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", dateAchet=" + dateAchet +
                '}';
    }
    public String toStringChild() {
        return "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", dateAchet=" + dateAchet ;
    }


}

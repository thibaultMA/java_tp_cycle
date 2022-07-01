package fr.diginamic.bo;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
    private String preNom;
    private Integer taille;
    private Long portefeuille;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "client_id")
    private Set<Vehicule> vehiculesList = new LinkedHashSet<>();

    public Set<Vehicule> getVehiculesList() {
        return vehiculesList;
    }

    public void setVehiculesList(Set<Vehicule> vehicules) {
        this.vehiculesList = vehicules;
    }
    public void addVehicules(Vehicule vehicules) {
        this.vehiculesList.add(vehicules);
    }
    public void removeVehicules(Vehicule vehicules) {
        this.vehiculesList.remove(vehicules);
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPreNom() {
        return preNom;
    }

    public void setPreNom(String preNom) {
        this.preNom = preNom;
    }

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) {
        this.taille = taille;
    }

    public Long getPortefeuille() {
        return portefeuille;
    }

    public void setPortefeuille(Long portefeuille) {
        this.portefeuille = portefeuille;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

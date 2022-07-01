package fr.diginamic.bo;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Location() {
    }

    public Location(Set<Vehicule> vehicules, Client client) {
        this.setVehicules(vehicules);
        this.client = client;
    }
    public Location(Vehicule vehicules, Client client) {
        this.addVehicules(vehicules);
        this.client = client;
    }

    @OneToMany(mappedBy = "location", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private Set<Vehicule> vehicules = new LinkedHashSet<>();

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "client_id")
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(Set<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }
    public void addVehicules(Vehicule vehicules) {
        this.vehicules.add(vehicules);
    }
    public void removeVehicules(Vehicule vehicules) {
        this.vehicules.remove(vehicules);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

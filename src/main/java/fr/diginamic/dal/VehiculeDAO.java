package fr.diginamic.dal;

import fr.diginamic.bo.Vehicule;

import javax.persistence.EntityManager;

public class VehiculeDAO{
    private final EntityManager em;

    public VehiculeDAO(EntityManager em) {
        this.em = em;
    }

    public void saveEntity(Vehicule vehicule) {
        em.getTransaction().begin();
        em.persist(vehicule);
        em.getTransaction().commit();
    }
}

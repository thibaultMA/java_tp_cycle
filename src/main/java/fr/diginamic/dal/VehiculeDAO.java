package fr.diginamic.dal;

import fr.diginamic.bo.Vehicule;

import javax.persistence.EntityManager;

public class VehiculeDAO extends EntityDAOFactory<Vehicule>{

    public VehiculeDAO(EntityManager em) {
        super(em);
    }
}

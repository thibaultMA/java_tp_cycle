package fr.diginamic.dal;

import fr.diginamic.bo.Location;

import javax.persistence.EntityManager;

public class LocationDAO extends EntityDAOFactory<Location>{
    public LocationDAO(EntityManager em) {
        super(em);
    }
}

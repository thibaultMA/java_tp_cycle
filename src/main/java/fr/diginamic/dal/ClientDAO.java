package fr.diginamic.dal;

import fr.diginamic.bo.Client;
import fr.diginamic.bo.Vehicule;

import javax.persistence.EntityManager;

public class ClientDAO extends EntityDAOFactory<Client>{
    public ClientDAO(EntityManager em) {
        super(em);
    }
}

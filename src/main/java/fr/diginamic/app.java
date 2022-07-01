package fr.diginamic;

import fr.diginamic.bll.LocationService;
import fr.diginamic.bo.Client;
import fr.diginamic.bo.Location;
import fr.diginamic.bo.vehicule.Velo;
import fr.diginamic.dal.LocationDAO;
import fr.diginamic.dal.VehiculeDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class app {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-JPA");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        VehiculeDAO veloHibernateDao = new VehiculeDAO(em);
        LocationDAO locationDAO = new LocationDAO(em);
        
        Velo velo = new Velo();
        Client client1 = new Client();

        LocationService locationService = new LocationService();
        Location location = locationService.reserver(client1, velo, 25);
        veloHibernateDao.saveEntity(velo);

        locationDAO.saveEntity(location);
        System.out.println(velo.getTarif());
    }
}

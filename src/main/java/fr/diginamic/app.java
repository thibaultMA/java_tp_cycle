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
        LocationDAO locationDAO = new LocationDAO(em);
        LocationService locationService = new LocationService(locationDAO);

        Velo velo = new Velo();
        velo.setNbrPignon(3);
        velo.setNbrPLateau(8);

        Client client1 = new Client();
        Location location = locationService.reserver(client1, velo, 25);

        System.out.println(velo);
    }
}

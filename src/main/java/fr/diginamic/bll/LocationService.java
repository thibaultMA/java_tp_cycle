package fr.diginamic.bll;

import fr.diginamic.bo.Client;
import fr.diginamic.bo.Location;
import fr.diginamic.bo.Vehicule;
import fr.diginamic.bo.vehicule.electrique.Gyropodes;
import fr.diginamic.dal.LocationDAO;

import javax.persistence.EntityManager;

public class LocationService {
    private final LocationDAO locationDAO;

    public LocationService(LocationDAO locationDAO) {
        this.locationDAO = locationDAO;
    }

    public Location reserver(Client client, Vehicule vehicule, int nombreHeure){
        boolean if1 = vehicule.getDispo() && client.getPortefeuille() > (long) vehicule.getTarif() * nombreHeure;
        boolean if2 =  if1 && vehicule instanceof Gyropodes && client.getTaille() >= ((Gyropodes) vehicule).getTailleMinimal();
        if ( if2 || if1){
            vehicule.setDispo(false);
            Location loc = new Location(vehicule,client);
            locationDAO.saveEntity(loc);
            return loc;
        }
        return null;
    }
}

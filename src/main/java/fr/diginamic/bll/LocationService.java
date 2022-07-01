package fr.diginamic.bll;

import fr.diginamic.bo.Client;
import fr.diginamic.bo.Location;
import fr.diginamic.bo.Vehicule;
import fr.diginamic.bo.vehicule.electrique.Gyropodes;

public class LocationService {

    public Location reserver(Client client, Vehicule vehicule, int nombreHeure){
        boolean if1 = vehicule.getDispo() && client.getPortefeuille() > (long) vehicule.getTarif() * nombreHeure;
        boolean if2 =  if1 && vehicule instanceof Gyropodes && client.getTaille() >= ((Gyropodes) vehicule).getTailleMinimal();
        if ( if2 || if1){
            vehicule.setDispo(false);
            return new Location(vehicule,client);
        }
        return null;
    }
}

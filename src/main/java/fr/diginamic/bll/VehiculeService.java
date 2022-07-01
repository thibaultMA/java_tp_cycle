package fr.diginamic.bll;

import fr.diginamic.bo.Client;
import fr.diginamic.bo.Vehicule;
import fr.diginamic.bo.vehicule.electrique.Gyropodes;

public class VehiculeService {

    public boolean reserver(Client client, Vehicule vehicule,int nombreHeure){
        boolean if1 = client.getPortefeuille() > (long) vehicule.getTarif() * nombreHeure;
        boolean if2 = client.getTaille() >= ((Gyropodes) vehicule).getTailleMinimal();
        if (vehicule.getDispo()&& if1){
            if (if2){

            client.addVehicules(vehicule);
            }

            return true;
        }
        return false;

    }
}

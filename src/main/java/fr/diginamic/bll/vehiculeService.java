package fr.diginamic.bll;

import fr.diginamic.bo.Vehicule;
import fr.diginamic.dal.VehiculeDAO;

public class vehiculeService {
    private final VehiculeDAO veiculeDAO;

    public vehiculeService(VehiculeDAO veiculeDAO) {
        this.veiculeDAO = veiculeDAO;
    }

    public void save(Vehicule vehicule){
        veiculeDAO.saveEntity(vehicule);

    }
}

package fr.diginamic;

import fr.diginamic.bo.vehicule.Velo;
import fr.diginamic.dal.VehiculeDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class app {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-JPA");
    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        VehiculeDAO veloHibernateDao = new VehiculeDAO(em);
        Velo velo = new Velo();
        veloHibernateDao.saveEntity(velo);
        System.out.println(velo.getTarif());
    }
}

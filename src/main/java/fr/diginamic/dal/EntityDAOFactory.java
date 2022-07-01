package fr.diginamic.dal;

import fr.diginamic.bo.Client;

import javax.persistence.EntityManager;

public abstract class EntityDAOFactory<T> {
    private final EntityManager em;

    public EntityDAOFactory(EntityManager em) {
        this.em = em;
    }

    public void saveEntity(T entity) {
        this.em.getTransaction().begin();
        this.em.persist(entity);
        this.em.getTransaction().commit();
    }
}

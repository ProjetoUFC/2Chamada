package br.com.segchamada.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.segchamada.model.Discipline;

@Stateless
public class DisciplineService {
	
    @PersistenceContext
    private EntityManager em;

    public void persist(Discipline discipline) {
        em.persist(discipline);
    }
 
    public List<Discipline> findAll() {
        return em.createQuery("select d from Discipline d order by d.name", Discipline.class).getResultList();
    }

}
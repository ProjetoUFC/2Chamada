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
    
    public void persist (Discipline discipline){
    	em.persist(discipline);	
    }
    
    public void remove (Discipline discipline){
    	em.remove(discipline);
    }
    
    public Discipline edit (Discipline discipline){
		return em.merge(discipline);	
    }
    
    public Discipline findWithID (long id){
    	return em.find(Discipline.class, id);
    }
    
    @SuppressWarnings("unchecked")
	public List<Discipline> findAll() {
        return em.createQuery("select u from Discipline u").getResultList();
    }

}

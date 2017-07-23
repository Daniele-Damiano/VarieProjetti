/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.esame.javaee;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


@Stateless
/**
 * Aggiunto LocalBean
 */
@LocalBean
/**
 * Cambiato il nome Della Classe da pdbd in EjbA
 */
public class EjbA implements EjbRemote{

   @Inject
   private EntityManager em;
   
   public List<pdbd> findAutore(){
        TypedQuery<pdbd> aut = em.createNamedQuery("autore", pdbd.class);
        return aut.getResultList();
    }
   public List<pdbd> findTitolo(){
        TypedQuery<pdbd> tit = em.createNamedQuery("titolo", pdbd.class);
        return tit.getResultList();
    }
   public List<pdbd> fintScaffale(){
        TypedQuery<pdbd> sc = em.createNamedQuery("scaffale", pdbd.class);
        return sc.getResultList();
    }
   public pdbd inserisci(pdbd p){
        em.persist(p);
        return p;
    }
    
}

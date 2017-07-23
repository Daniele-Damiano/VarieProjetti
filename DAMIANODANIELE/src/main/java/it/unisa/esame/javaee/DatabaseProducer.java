/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.esame.javaee;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * Cambiato il nome dell atributo unitName da jdbc/PdEsameDs in jdbc/PdEsamePu
 */
public class DatabaseProducer {
    @Produces
    @PersistenceContext(unitName = "jdbc/PDEsamePU")
    private EntityManager em;
    
}

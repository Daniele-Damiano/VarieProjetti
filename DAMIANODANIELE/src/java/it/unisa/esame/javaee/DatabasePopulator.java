/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.esame.javaee;

import javax.annotation.PostConstruct;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author House
 */
@Singleton
@Startup
@DataSourceDefinition(
        /**
         * Aggiunto Attributo ClassName ed Url
         */
        className = "org.apache.derby.jdbc.EmbeddedDataSource",
        name = "java:global/jdbc/PDEsameDS",
        user = "APP",
        password = "APP",
        databaseName = "pdbd",
        url = "jdbc:derby://localhost:1527/pdbd",
        properties = {"connectionAttributes=;create=true"}
        
)
public class DatabasePopulator {
    /**
     * Inject di Ejba invece di EntityManager
     */
   @Inject
   private EjbA ejbA;
  
   private pdbd uno;
   private pdbd due;
   
   @PostConstruct
   public void createDatabase(){
       uno = new pdbd("Purgatorio", "Dante", "A", "10", "5","100");
       due = new pdbd("Divina Commedia", "Dante", "B", "5","10","18");
       
       ejbA.inserisci(uno);
       ejbA.inserisci(due);
       
   }
    
     
}

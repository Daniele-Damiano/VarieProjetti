/**
 *
 * @author Daniele Damiano
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esame.damianodanieleesame;

import javax.annotation.PostConstruct;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Singleton
@Startup
@DataSourceDefinition(
        className = "org.apache.derby.jdbc.ClientDataSource40",
        name = "jdbc/BookDS",
        databaseName = "BookDBEsame",
        user = "app",
        password = "app",
        properties = {"conectionAttributes=;create=true"})
public class BookSing {

    @Inject
    private EntityManager em;

    @PostConstruct
    public void createBook() {
        Book_1 b = new Book_1("1", "Gesu", "Dio", 40);
        em.persist(b);
    }

}

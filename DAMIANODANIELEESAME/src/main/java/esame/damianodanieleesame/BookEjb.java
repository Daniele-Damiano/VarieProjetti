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

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Stateless
@LocalBean
public class BookEjb implements QueryCom{

    @Inject
    private EntityManager em;

    @AroundInvoke
    public Object log(InvocationContext ic) throws Exception {
        System.out.println("Entrando" + ic.getTarget().toString() + ic.getMethod().getName());

        try {
            return ic.proceed();
        } finally {
            System.out.println("Uscendo" + ic.getTarget().toString() + ic.getMethod().getName());
        }
    }
    
    

    @Override
    public List<Book_1> findId(String id) {
        Query q = em.createQuery("Select b FROM Book_1 b WHERE b.id = :id");
        q.setParameter("id", id);
        List<Book_1> b = q.getResultList();
        return b;
    }

    @Override
    public List<Book_1> findAutore(String autore) {
        Query q = em.createQuery("Select b FROM Book_1 b WHERE b.autore = :autore");
        q.setParameter("autore", autore);
        List<Book_1> b = q.getResultList();
        return b;
    }

    @Override
    public List<Book_1> printAll() {
        Query q = em.createQuery("Select b FROM Book_1 b");
        List<Book_1> b = q.getResultList();
        return b;
    }

}

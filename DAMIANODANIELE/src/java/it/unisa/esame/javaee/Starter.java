/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.esame.javaee;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Starter {


    public static void main(String[] args) throws NamingException {

        Context ctx = new InitialContext();
        EjbRemote a = (EjbRemote) ctx.lookup("java:global/dist/DAMIANODANIELE/EjbA!it.unisa.esame.javaee.EjbRemote");

        List<pdbd> tit = a.findTitolo();
        for(pdbd f : tit){
            System.out.println(f.getTitolo());
        }
        List<pdbd> aut = a.findAutore();
        for (pdbd au : aut) {
            System.out.println(au.getAutore());
        }

        List<pdbd> sc = a.fintScaffale();
        for (pdbd s : sc) {
            System.out.println(s.getScaffale());
        }
        /**
         * Aggiunto Inserimento dati in database
         */
        pdbd ww = new pdbd("Purgatorio", "Dante", "A", "10", "5", "100");
        pdbd qq = new pdbd("Divina Commedia", "Dante", "B", "5", "10", "18");
        a.inserisci(ww);
        a.inserisci(qq);

       
        
    }

}

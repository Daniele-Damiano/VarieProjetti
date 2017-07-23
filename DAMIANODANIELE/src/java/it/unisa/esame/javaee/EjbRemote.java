/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.esame.javaee;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author House
 */
@Remote
public interface EjbRemote {
    List<pdbd> findAutore();
    List<pdbd> findTitolo();
    List<pdbd> fintScaffale();
    pdbd inserisci(pdbd p);
}

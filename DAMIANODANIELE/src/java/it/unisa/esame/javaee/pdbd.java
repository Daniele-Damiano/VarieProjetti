/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.esame.javaee;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Agiunto campo prezzo
 *
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "titolo", query = "select c from pdbd c where c.titolo = 'Purgatorio'")
    ,
    @NamedQuery(name = "autore", query = "select c from pdbd c  where c.autore = 'Dante'")
    ,
    @NamedQuery(name = "scaffale", query = "select c from pdbd c  where c.scaffale = 'A'")
})
public class pdbd implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private String titolo;
    private String autore;
    private String scaffale;
    private String numPagine;
    private String giacenza;
    private String prezzo;

    public pdbd() {
    }

    public pdbd(String titolo, String autore, String scaffale, String numPagine, String giacenza, String prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.scaffale = scaffale;
        this.numPagine = numPagine;
        this.giacenza = giacenza;
        this.prezzo = prezzo;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getScaffale() {
        return scaffale;
    }

    public void setScaffale(String scaffale) {
        this.scaffale = scaffale;
    }

    public String getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(String numPagine) {
        this.numPagine = numPagine;
    }

    public String getGiacenza() {
        return giacenza;
    }

    public void setGiacenza(String giacenza) {
        this.giacenza = giacenza;
    }

}

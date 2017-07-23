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

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author House
 */
@Entity
public class Book_1 implements Serializable {
    
    @Id
    private String id;
    private String titolo;
    private String autore;
    private int prezzo;

    public Book_1() {
    }
   
    
    public Book_1(String id, String titolo, String autore, int prezzo) {
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }

    public String getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    
    
}

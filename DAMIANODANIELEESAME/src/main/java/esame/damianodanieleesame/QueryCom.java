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
import javax.ejb.Remote;

@Remote
public interface QueryCom {
    List<Book_1> findId(String id);
    List<Book_1> findAutore(String autore);
    List<Book_1> printAll();
    
}

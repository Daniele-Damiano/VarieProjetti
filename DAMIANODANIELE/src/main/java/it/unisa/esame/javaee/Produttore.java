/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.esame.javaee;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Topic;



/**
 *
 * @author House
 */
@Stateless
public class Produttore {
	@Resource(lookup = "jms/PDEsameConnectionFactory")
	private ConnectionFactory connectionFactory;
	@Resource(lookup = "jms/PDEsameTopic")
	/**
	 * Aggounto modificatore private a Topic
	 */
	private Topic topic;

	/**
	 * Eliminato parametro Message dal metodo sendMesage
	 * Ed Aggiunto JMSCOntext
	 */
	
	public int sendMessage(int a){

		JMSContext context = connectionFactory.createContext();
		context.createProducer().setProperty("prezzo", a).send(topic,a);
		return a;
	}

}



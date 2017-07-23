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
public class Consumatore  {

	@Resource(lookup = "jms/PDEsameConnectionFactory")
	private ConnectionFactory connectionFactory;
	/**
	 * Aggiunto modificatore private a Topic
	 */
	@Resource(lookup = "jms/PDEsameTopic")
	private Topic topic;

	
	public void cons(int a) {
		JMSContext context = connectionFactory.createContext();
		pdbd aPdbd = context.createConsumer(topic).receiveBody(pdbd.class);
		if(Integer.valueOf(aPdbd.getPrezzo()) >a) {
			System.out.println(aPdbd.getTitolo());
		}
	}


}

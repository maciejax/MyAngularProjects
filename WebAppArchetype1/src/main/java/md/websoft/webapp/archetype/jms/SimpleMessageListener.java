package md.websoft.webapp.archetype.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SimpleMessageListener implements MessageListener {

	final static Logger LOG = LoggerFactory.getLogger(SimpleMessageListener.class);
	
	@Override
	public void onMessage(Message msg) {
		
		if(msg instanceof TextMessage){
			LOG.info("A TextMessage was recieved by SimpleMessageListener");
			
			String message;
			try {
				
				message = ((TextMessage) msg).getText();
				LOG.info("contain:\n" + message);
				
			} catch (JMSException e) {
				LOG.info("Dupa blada.... znowu nie posz³o");
				return;
			}
		}
	}

	
}

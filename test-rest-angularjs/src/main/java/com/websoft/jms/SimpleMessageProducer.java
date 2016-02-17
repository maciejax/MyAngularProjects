package com.websoft.jms;

import com.websoft.service.SecondService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by Maciej on 2016-02-16.
 */
@Service
public class SimpleMessageProducer {

    final static Logger LOG = LoggerFactory.getLogger(SimpleMessageListener.class);
    private JmsTemplate jmsTemplate;
    private Destination destination;

    @Inject
    public SecondService secondService;

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }
    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
    public Destination getDestination() {
        return destination;
    }
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public void timerTask(){
        final String msg ="New Records Found";

        final int size = secondService.getMessagesFromDB().size();

        // CHeck db and send if updated
        if(size>0){
            jmsTemplate.send(destination, new MessageCreator() {
                public Message createMessage(Session session) throws JMSException {
                    return session.createTextMessage(msg + ": " + size);
                }});
            System.out.println("Producer sends " + msg + ": " + size);
            secondService.clearList();
        }



    }
}

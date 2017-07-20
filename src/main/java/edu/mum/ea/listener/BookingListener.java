package edu.mum.ea.listener;

import edu.mum.ea.domain.WrapUser;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 * Created by darith on 7/19/17.
 */
public class BookingListener implements MessageListener {

    public void onMessage(Message message) {

        ObjectMessage objectMessage = (ObjectMessage) message;
        WrapUser wrapUser = null;
        try {
            wrapUser = (WrapUser) objectMessage.getObject();

            System.out.println("User: " + wrapUser.getUser().getFirstName() + " " + wrapUser.getUser().getLastName());
            System.out.println("Free Breakfast!!!");
        } catch (JMSException e) {

            e.printStackTrace();
        }


    }
}

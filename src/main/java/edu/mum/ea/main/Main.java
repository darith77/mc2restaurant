package edu.mum.ea.main;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by darith on 7/19/17.
 */
public class Main {

    public static void main(String[] args) {
        new GenericXmlApplicationContext("classpath:/context/jms-context.xml");

    }


}

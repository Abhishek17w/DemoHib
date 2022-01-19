package com.abhishek.DemoHib;

import org.hibernate.Transaction;

import org.hibernate.service.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienName an = new AlienName();
        Alien telusko = new Alien();
        telusko.setAid(101);
        telusko.setColor("green");
        
        an.setFname("Abhishek");
        an.setLname("Gupta");
        an.setMname("Kumar");
        
        telusko.setAn(an);
        
        Configuration confg = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(confg.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = confg.buildSessionFactory(reg);
        Session session = sf.openSession();
         
        Transaction ts = session.beginTransaction();
        
        session.save(telusko);
        //telusko = (Alien) session.get(Alien.class,101);
        		
        ts.commit();
        
        System.out.println(telusko);
    }
}

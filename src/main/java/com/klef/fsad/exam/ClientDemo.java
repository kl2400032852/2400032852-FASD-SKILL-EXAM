package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class ClientDemo {

public static void main(String[] args) {

SessionFactory sf = new Configuration().configure().buildSessionFactory();
Session session = sf.openSession();

Transaction tx = session.beginTransaction();

Department d = new Department("CSE","Computer Science",new Date(),"Active");

session.save(d);

tx.commit();

System.out.println("Record Inserted");

session.close();
sf.close();

}
}
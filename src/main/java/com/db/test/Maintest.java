package com.db.test;

import com.db.entity.*;
import com.db.utils.DBConnectionUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Maintest {

    public static void main(String args[]){
        FirstChild firstChild = new FirstChild();
        firstChild.setName("First Child");
        firstChild.setType("C1");

        SecondChild secondChild = new SecondChild();
        secondChild.setName("Second Child");
        secondChild.setType("C2");
        secondChild.setCity("BLR");
        SessionFactory sessionFactory=DBConnectionUtils.getSessionFactory();
        Session session=sessionFactory.openSession();
        session.getTransaction().begin();
        int id = (int) session.save(firstChild);
        session.save(secondChild);

        FirstChild f1 = (FirstChild) session.get(FirstChild.class,id);
        System.out.print(f1.getType());

        FirstChild f2 = (FirstChild) session.get(FirstChild.class,id);
        System.out.print(f2.getType());
        session.getTransaction().commit();
        session.close();

        session=sessionFactory.openSession();
        session.getTransaction().begin();


        FirstChild f3 = (FirstChild) session.get(FirstChild.class,id);
        System.out.print(f3.getType());

        FirstChild f4 = (FirstChild) session.get(FirstChild.class,id);
        System.out.print(f4.getType());
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}

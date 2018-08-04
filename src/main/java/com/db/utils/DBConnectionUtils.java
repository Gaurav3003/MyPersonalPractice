package com.db.utils;

import com.db.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class DBConnectionUtils {

    private static Configuration configuration;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){

        if(sessionFactory==null){
            if(configuration==null){
                configuration = new Configuration();
                configuration.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
                configuration.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521/ormetb");
                configuration.setProperty("hibernate.connection.username", "LOCALDB");
                configuration.setProperty("hibernate.connection.password", "password");
                configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
                configuration.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.internal.NoCacheProvider");
                configuration.setProperty("hibernate.show_sql", "true");
                configuration.setProperty("hibernate.hbm2ddl.auto", "create");
                configuration.addAnnotatedClass(Person.class);
                configuration.addAnnotatedClass(PermanentEmployee.class);
                configuration.addAnnotatedClass(ContractualEmployee.class);
                configuration.addAnnotatedClass(Parent.class);
                configuration.addAnnotatedClass(FirstChild.class);
                configuration.addAnnotatedClass(SecondChild.class);
            }
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return  sessionFactory;
    }
}

package com.db.utils;

import com.db.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class DBConnectionUtils {

    private static Configuration configuration;
    private static SessionFactory sessionFactory;
    /*
        Java based configuration.
        Adding manually everything
     */
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
    /*
        Java Based Configuration
        loading data from property file
        adding annotated classes dynamically
     */
    public static SessionFactory getSessionFactoryFromProperties()throws Exception{
        if(sessionFactory==null){
            if(configuration==null){
                configuration = new Configuration();
                Properties prop = new Properties();
                prop.load(DBConnectionUtils.class.getResourceAsStream("/hibernate.properties"));
                configuration.setProperties(prop);
                List<Class<?>> annotatedClassNames = getEntityClassesFromPackage("com.db.entity");
                for (Class className:
                     annotatedClassNames) {
                    configuration.addAnnotatedClass(className);
                }
            }
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return  sessionFactory;
    }
    /*
        getting file name from the package
     */
    public static List<Class<?>> getEntityClassesFromPackage(String packageName) throws ClassNotFoundException, IOException, URISyntaxException {
        List<String> classNames = getClassNamesFromPackage(packageName);
        List<Class<?>> classes = new ArrayList<>();
        for (String className : classNames) {
            Class<?> cls = Class.forName(packageName + "." + className);
            Annotation[] annotations = cls.getAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof javax.persistence.Entity) {
                    classes.add(cls);
                }
            }
        }
        System.out.println(classes);
        return classes;
    }
    public static ArrayList<String> getClassNamesFromPackage(String packageName) throws IOException, URISyntaxException, ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        ArrayList<String> names = new ArrayList<>();

        packageName = packageName.replace(".", "/");
        URL packageURL = classLoader.getResource(packageName);

        URI uri = new URI(packageURL.toString());
        File folder = new File(uri.getPath());
        File[] files = folder.listFiles();
        for (File file: files) {
            String name = file.getName();
            name = name.substring(0, name.lastIndexOf('.'));  // remove ".class"
            names.add(name);
        }
        return names;
    }
}

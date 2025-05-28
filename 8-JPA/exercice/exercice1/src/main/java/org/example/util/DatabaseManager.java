package org.example.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");


    public EntityManager getConnection() throws SQLException {
        return emf.createEntityManager();
    }
}

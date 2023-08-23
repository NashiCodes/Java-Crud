package com.crud.javacrud.dao;

import com.crud.javacrud.db.MySqlConnection;
import com.crud.javacrud.model.Client;

import java.sql.Connection;
import java.util.List;

public class ClientDao implements CRUD {

    private static Connection connection = MySqlConnection.getConnection();
    private static final String SQL_INSERT = "INSERT INTO clients (name, code, birth_date, situation) VALUES (?, ?, ?, ?)";
    public static void create(Client client) {

    }

    static List<Client> find(String query) {
        return null;
    }

    static void delete(int id) {

    }

    static Client findByPk(int id) {
        return null;
    }

    static void update(Client client) {

    }

}
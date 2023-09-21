package com.crud.javacrud.dao;

import com.crud.javacrud.db.MySqlConnection;
import com.crud.javacrud.model.Client;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ClientDao implements CRUD {

	private static  Connection connection;
	private static String sql;

	public static void create(Client client) {
		connection = MySqlConnection.createConnection();
		sql = "INSERT INTO clients VALUES (null, ?, ?, ?, ?)";
		try {
			assert connection != null;
			var preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, client.getName());
			preparedStatement.setString(2, client.getCode());
			preparedStatement.setString(3, client.getBirthDate());
			preparedStatement.setString(4, client.getSituation());
			preparedStatement.executeUpdate();

			System.out.println("Client created successfully!");
		} catch (SQLException e) {
			System.out.println("Error creating client: " + e.getMessage());
		}
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
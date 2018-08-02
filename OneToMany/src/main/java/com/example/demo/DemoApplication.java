package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		System.out.println("http://localhost:8080");

		String url = "jdbc:postgresql://localhost:5432/music";
		Properties props = new Properties();
		// use these properties if you need to provide a username or password.
		//props.setProperty("user","fred");
		//props.setProperty("password","secret");
		//props.setProperty("ssl","true");

		try {
			Connection conn = DriverManager.getConnection(url, props);
			ResultSet results = conn.createStatement().executeQuery("SELECT * FROM artists");
			while (results.next()) {
				int id = results.getInt("id");
				String name = results.getString("name");
				Date createdAt = results.getDate("createdAt");
				Date updatedAt = results.getDate("updatedAt");

				System.out.println("id: " + id + " artist: " + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB error.");
		}
	}
}

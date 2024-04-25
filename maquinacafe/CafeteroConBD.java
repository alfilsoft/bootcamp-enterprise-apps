package maquinacafe;

import com.mongodb.client.*;
import org.bson.Document;

import java.util.Scanner;

public class CafeteroConBD {

    public static void main(String[] args) {

        String connectionString = "mongodb://localhost:9090";
        String databaseName = "Prueba";

        MongoClient mongoClient = MongoClients.create(connectionString);
        MongoDatabase database = mongoClient.getDatabase(databaseName);

        MongoCollection<Document> collection = database.getCollection("Cafes");

        FindIterable<Document> documents = collection.find();
        for (Document document : documents) {
            System.out.println(document.toJson()); // Print each document
        }
    }
}

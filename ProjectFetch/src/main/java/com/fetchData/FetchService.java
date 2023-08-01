package com.fetchData;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public class FetchService {

    public static void main(String[] args) {
        // Example usage: Fetch data and process it
        List<Map<String, Object>> fetchedData = fetchDataFromDatabase();
        processFetchedData(fetchedData);
    }

    public static List<Map<String, Object>> fetchDataFromDatabase() {
        Connection connection = ConnectionSoGet.DbConnect();
        ClassFetchDao fetchDao = new ClassFetchDao();
        fetchDao.setConnection(connection);

        List<Map<String, Object>> fetchedData = fetchDao.fetchData();

        // Close the connection when done
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fetchedData;
    }

    public static void processFetchedData(List<Map<String, Object>> data) {
        // Process the fetched data as needed
        for (Map<String, Object> row : data) {
            // For example: String name = (String) row.get("name");
            System.out.println(row);
        }
    }
}

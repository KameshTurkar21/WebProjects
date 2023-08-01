package com.posh.deployable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PoshDao {
    public List<String> select() throws SQLException 
    {
        List<String> ls = new ArrayList<>();
        String query = "SELECT * FROM mh_data.may WHERE cluster_city LIKE 'surat'";

        Connection connection = CPosh.connectionPosh();
       
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) 
        {
           long id = rs.getLong(1); // Replace "id" with the actual column name for the ID.
            String cityName = rs.getNString(2); // Replace "city_name" with the actual column name for the city name.

            // Concatenate ID and City Name into a single string and add it to the list.
            String data =id+ " - " + cityName;
            ls.add(data);
        }

        return ls;
    }

    public int update(String leadId, String newStatus) {
        String query = "UPDATE mh_data.may SET status_name = ? WHERE lead_id = ?";

        try (Connection connection = CPosh.connectionPosh();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, newStatus);
            preparedStatement.setString(2, leadId);

            int rowsUpdated = preparedStatement.executeUpdate();
            return rowsUpdated;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    // ... (other methods)
}



package queryJson;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

import java.sql.*;
import java.lang.*;

public class queryJson {
    public static void main(String args[]) {
        // JDBC driver name and database URL
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:3306/gas_online";

        final String USER = "root";
        final String PASS = "";
        final String driver = "com.mysql.jdbc.Driver";

        Connection connection = null;
        Statement statement = null;
        String sql = "";

        try {
            // step 2: register JDBC driver
            Class.forName(driver);

            // step 3: open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            // step 4: execute a query
            System.out.println("Creating statement...");
            statement = connection.createStatement();

            sql = "select o.date, o.billCode, concat(o.address,', ', o.ward) as address, c.brand, c.size, c.price, o.status from user u, gas_order o, gas_cylinder c WHERE u.username = 'vuong34' and u.phoneNumber = o.phoneNumber and o.gasCode = c.code ORDER BY o.date ASC;";

            System.out.println(sql);

            ResultSet rs = statement.executeQuery(sql);

            JsonArray data = new JsonArray();

            while (rs.next())
            {
                JsonObject row = new JsonObject();
                row.addProperty("date", rs.getString("date"));
                row.addProperty("billCode", rs.getString("billCode"));
                row.addProperty("address", rs.getString("address"));
                row.addProperty("brand", rs.getString("brand"));
                row.addProperty("size", rs.getString("size"));
                row.addProperty("price", rs.getString("price"));
                row.addProperty("status", rs.getString("status"));
                data.add(row);
            }

            String jsonString = data.toString();
            System.out.println(jsonString);

            rs.close();
            connection.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

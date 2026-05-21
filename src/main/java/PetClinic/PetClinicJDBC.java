package PetClinic;


import java.sql.*;

public class PetClinicJDBC {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/PETCLINIC?serverTimezone=UTC";
        String username = "root";
        String password  = "ROOT_ALICIA_2802";

        try {
            Connection connection = DriverManager.getConnection(url, username,password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM OWNERS");

            while (resultSet.next()){
                System.out.println(resultSet.getString("id") + " | "+ resultSet.getString("first_name ")+ " | "+resultSet.getString("last_name "));
            }
            connection.close();
            statement.close();
            resultSet.close();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}

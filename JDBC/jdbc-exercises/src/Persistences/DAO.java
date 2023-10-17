package Persistences;

import java.sql.*;

public abstract class DAO {

    protected Connection connection;
    protected ResultSet resultSet;
    protected Statement statement;
    private final String USER = "root";
    private final String PASSWORD = "root";
    private String database;

    public DAO() {
    }

    public DAO(String database) {
        this.database = database;
    }

    protected void connectDB() throws SQLException {
        try{

            String urlDB = String.format("jdbc:mysql://localhost:3306/%s", database);
            connection = DriverManager.getConnection(urlDB, USER, PASSWORD);

        }catch (SQLException ex){
            throw ex;
        }
    }

    protected void closeConnectionDB() throws SQLException {
        try {
            if (resultSet != null){
                resultSet.close();
            }
            if (statement != null){
                statement.close();
            }
            if (connection != null){
                connection.close();
            }
        }catch (SQLException ex){
            throw ex;
        }
    }

//    Create Update Delete
    protected void cudDB(String query) throws SQLException {
        try{
            connectDB();
            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex){
            throw ex;
        }finally {
            closeConnectionDB();
        }
    }

    protected void readDB(String query) throws SQLException {
        try{
            connectDB();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }catch (SQLException ex){
            throw ex;
        }
    }

    protected void checkNotNull (Object object) throws Exception {
        if (object == null) {
            throw new Exception("Object must not be null");
        }
    }

}

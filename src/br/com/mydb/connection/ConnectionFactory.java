package br.com.mydb.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String user = "root";
    private static final String password = "";
    private static final String databaseUrl = "jdbc:mysql://localhost:3306/mydb";

    public static Connection createConnection(){
        //Carrega classe pela JVM
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Cria conexão com o banco
            Connection con = DriverManager.getConnection(databaseUrl, user, password);
            return con;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main() throws SQLException {
        //Recupera conexão
        Connection con = createConnection();
        //Verifica se esta ativa
        if(con != null){
            System.out.println("Conexão obtida!");
            con.close();
        }
    }
}

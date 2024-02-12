package aula3_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class exercicioJDBC {

    public static void main(String[] args) throws SQLException {

        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost", "root", "#Eliane99");
            ResultSet rsAlunos = conexao.createStatement().executeQuery("Select * from sys.alunos");
            while (rsAlunos.next()) {
                System.out.println("Nome do Aluno: " + ((ResultSet) rsAlunos).getString("nomealunos") );
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do Banco de dados não localizado!");

        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao acessar o banco: " + e.getMessage());
        } finally {
           if (conexao != null ) {
               try {
                   conexao.close();
               } catch (SQLException e) {
                   throw new RuntimeException(e);
               }
           }
        }

    }

}

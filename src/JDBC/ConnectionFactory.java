package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author <Gabriel Mello de Oliveira
 */

public class ConnectionFactory
{
     public static Connection getConnection()
    {
        Connection conexao_BD = null;
        
        try{
            //Procura o Banco de Dados
            //A Variavel 'Nome_Banco_Dados' tras o nome do banco de dados criado 
            conexao_BD = DriverManager.getConnection("jdbc:postgresql://localhost/" + Nome_Banco_Dados, "postgres", "aluno");
        }
            catch(SQLException ex)
            {
                System.out.println("Erro: ConnectionFactory" + ex.getMessage());
            }
        
        return conexao_BD;
    }
}

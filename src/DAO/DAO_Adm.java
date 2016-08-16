package DAO;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author <Gabriel Mello de Oliveira
 */

public class DAO_Adm
{
    private static Connection conexao_BD;
    
    public DAO_Adm()
    {
        DAO_Adm.conexao_BD = ConnectionFactory.getConnection();
    }
    
    public static void Insert()
    {
        String sql = "INSERT INTO Funcionario" + "(Nome, Telefone, Salario, Cargo, Sexo, Data_)"
                + "VALUES(?,?,?,?,?,?);";
        
        try{
            
            PreparedStatement stat = conexao_BD.prepareStatement(sql);
            
            //stat.setString(1, func.getNome());      
            stat.execute();
            stat.close();
            
        }
            catch(SQLException ex)
            {
                System.out.println("Erro: DAO_Adm - Insert" + ex.getMessage());
            }
    }
    
    public static void Select()
    {
        String sql = "SELECT * FROM " + Nome_Tabela;
        
        try{
            
            PreparedStatement stat = conexao_BD.prepareStatement(sql);
            
            //stat.setString(1, func.getNome());      
            stat.execute();
            stat.close();
            
        }
            catch(SQLException ex)
            {
                System.out.println("Erro: DAO_Adm - Select" + ex.getMessage());
            }
    }
}

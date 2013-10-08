/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoconfeccao.model.persistencia;

import br.com.projetoconfeccao.model.Pessoa;
import br.com.projetoconfeccao.model.persistencia.dao.PessoaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo_lourenco
 */
public class PessoaDAOJDBC implements PessoaDAO {
    
    private static final String LIST = "select * from pessoa";
    
    public List<Pessoa> listAll() {
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Pessoa> pessoas = new ArrayList<>();
        
        try {
            
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LIST);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Pessoa p = new Pessoa();
                p.setCodigo(rs.getInt("codigo"));
                p.setNome(rs.getString("nome"));
                p.setTelefone(rs.getString("telefone"));                
                pessoas.add(p);
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro ao listar as pessoas" + e.getMessage());
            
        } finally {
            
            try {
                
                ConnectionFactory.closeConnection(con, pstm, rs);
                
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão. " + e.getMessage());
                
            }
        }
        return pessoas;
    }
}

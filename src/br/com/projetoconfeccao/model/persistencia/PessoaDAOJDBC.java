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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo_lourenco
 */
public class PessoaDAOJDBC implements PessoaDAO {

    private static final String LIST = "select * from pessoa";
    private static final String INSERT = "insert into pessoa (nome, telefone) values (?, ?)";

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

    @Override
    public int insert(Pessoa p) {
        Connection con = null;
        PreparedStatement pstm = null;

        int resposta = -1;

        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, p.getNome());
            pstm.setString(2, p.getTelefone());
            pstm.execute();
            try (ResultSet rs = pstm.getGeneratedKeys()) {
                if (rs.next()) {
                    resposta = rs.getInt(1);
                    rs.close();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir uma pessoa. " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão. " + e.getMessage());
            }
        }
    }
}

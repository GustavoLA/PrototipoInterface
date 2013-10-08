/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoconfeccao.controller;

import br.com.projetoconfeccao.model.Pessoa;
import br.com.projetoconfeccao.model.persistencia.PessoaDAOJDBC;
import br.com.projetoconfeccao.model.persistencia.dao.PessoaDAO;
import java.util.List;

/**
 *
 * @author gustavo_lourenco
 */
public class PessoaController {
    public List<Pessoa> listAll(){
        PessoaDAO dao = new PessoaDAOJDBC();
        return dao.listAll();
    }
    
    public int inserir(Pessoa p){
        PessoaDAO dao = new PessoaDAOJDBC();
        return dao.insert(p);
    }
    
}

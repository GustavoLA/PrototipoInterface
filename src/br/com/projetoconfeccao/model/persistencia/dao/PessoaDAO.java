/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoconfeccao.model.persistencia.dao;

import br.com.projetoconfeccao.model.Pessoa;
import java.util.List;

/**
 *
 * @author gustavo_lourenco
 */
public interface PessoaDAO {

    public List<Pessoa> listAll();
}

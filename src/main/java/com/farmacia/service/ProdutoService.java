/**
 * 
 */
package com.farmacia.service;

import java.util.List;

import com.farmacia.model.Produto;

/**
 * @author LEANDRO
 *
 */
public interface ProdutoService {
  Produto buscaProduto(Long id);
  List<Produto> listaProdutos();
}

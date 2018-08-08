/**
 * 
 */
package com.demo.angular.service;

import java.util.List;

import com.demo.angular.model.Produto;

/**
 * @author LEANDRO
 *
 */
public interface ProdutoService {
  Produto buscaProduto(Long id);
  List<Produto> listaProdutos();
}

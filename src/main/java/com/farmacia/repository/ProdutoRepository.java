/**
 * 
 */
package com.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.model.Produto;

/**
 * @author LEANDRO
 *
 */
public interface ProdutoRepository  extends JpaRepository<Produto, Long>{

}

/**
 * 
 */
package com.demo.angular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.angular.model.Produto;

/**
 * @author LEANDRO
 *
 */
public interface ProdutoRepository  extends JpaRepository<Produto, Long>{

}

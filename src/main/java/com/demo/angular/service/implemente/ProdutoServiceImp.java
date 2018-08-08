/**
 * 
 */
package com.demo.angular.service.implemente;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.angular.model.Produto;
import com.demo.angular.repository.ProdutoRepository;
import com.demo.angular.service.ProdutoService;

/**
 * @author LEANDRO
 *
 */
@Service
public class ProdutoServiceImp implements ProdutoService{

	private final ProdutoRepository produtoRepository;
	
	
	public ProdutoServiceImp(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	@Override
	public Produto buscaProduto(Long id) {
		// TODO Auto-generated method stub
		return this.produtoRepository.getOne(id);
	}

	@Override
	public List<Produto> listaProdutos() {
		// TODO Auto-generated method stub
		return this.produtoRepository.findAll();
	}

}

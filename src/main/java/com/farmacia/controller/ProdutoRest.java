/**
 * 
 */
package com.farmacia.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.model.Produto;
import com.farmacia.service.implemente.ProdutoServiceImp;

/**
 * @author LEANDRO
 *
 */
@RestController
@RequestMapping(ProdutoRest.URL_BASE)
public class ProdutoRest {

	public static final String URL_BASE="/api/produto";
	private final ProdutoServiceImp produtoService;

	public ProdutoRest(ProdutoServiceImp produtoService) {
		this.produtoService = produtoService;
	}
	
	@RequestMapping("/listaProduto")
	@GetMapping
	public List<Produto> listaProdutos() {
		return this.produtoService.listaProdutos();
	}
	
	@RequestMapping("/buscaPorId")
	@PostMapping
	public Produto produto(Long id) {
		return this.produtoService.buscaProduto(id);
	}
	
	
}

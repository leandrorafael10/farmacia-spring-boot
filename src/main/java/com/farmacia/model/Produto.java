/**
 * 
 */
package com.farmacia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author LEANDRO
 *
 */
@Entity
@Data
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="nome")
	private String nome;
	//@JoinColumn(name="id")
	//private Classe IdClasse;
	
	
	public Produto(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		
	}	
	
}

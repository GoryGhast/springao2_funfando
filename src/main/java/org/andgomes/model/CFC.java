package org.andgomes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CFC")
public class CFC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "ENDERECO")
	private String endereco;
	
	@Column(name = "TEL")
	private Integer tel;
	
	public CFC(){
	}
	
	public CFC(String nome, String endereco, Integer tel){
		this.nome = nome;
		this.endereco = endereco;
		this.tel = tel;
	}
	
	////////////////////////////////
	/////////////GETTERS AND SETTERS
	////////////////////////////////
	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getEndereco() {return endereco;}
	public void setEndereco(String endereco) {this.endereco = endereco;}
	public Integer getTel() {return tel;}
	public void setTel(Integer tel) {this.tel = tel;}
}

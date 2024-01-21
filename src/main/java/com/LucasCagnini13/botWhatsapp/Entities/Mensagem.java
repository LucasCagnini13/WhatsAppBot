package com.LucasCagnini13.botWhatsapp.Entities;


import java.util.Set;

import jakarta.persistence.Entity;


public class Mensagem {
	private Set<String> contatos;
    private String conteudo;
    
    public Mensagem() {}

	public Mensagem(Set<String> contatos, String conteudo) {
		
		this.contatos = contatos;
		this.conteudo = conteudo;
	}

	public Set<String> getContatos() {
		return contatos;
	}

	public void setContatos(Set<String> contatos) {
		this.contatos = contatos;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	};
}

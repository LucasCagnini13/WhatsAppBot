package com.LucasCagnini13.botWhatsapp.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LucasCagnini13.botWhatsapp.Entities.Mensagem;
import com.LucasCagnini13.botWhatsapp.Services.WhatssapBot;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/zap")
@Slf4j
public class mensagemController {

	@Autowired
	private WhatssapBot whatssapBot;
	
	@PostMapping
	public void Enviarmensagem(@RequestBody Mensagem mensagem) {
		
		whatssapBot.receberMensagem(mensagem);
	}
	
}

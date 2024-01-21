package com.LucasCagnini13.botWhatsapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LucasCagnini13.botWhatsapp.Entities.Mensagem;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


@Service
public class WhatssapBot {

	@Autowired
	private WebDriver webDriver;

	public void receberMensagem(Mensagem mensagem) {

		for (String contato : mensagem.getContatos()) {
			try {
				var elementoContato = findContato(contato);
				elementoContato.click();

				var caixaMensagem = findCaixaTexto();
				caixaMensagem.sendKeys(mensagem.getConteudo());
				caixaMensagem.sendKeys(Keys.RETURN);
			} catch (Exception e) {
				System.out.println("Não foi possível enviar a mensagem para o contato {}" + contato + " " + e);
			}
		}
	}

	private WebElement findContato(String nomeContato) {
		var xPathContato = "//*[@id=\"pane-side\"]/*//span[@title='" + nomeContato + "']";
		return webDriver.findElement(By.xpath(xPathContato));
	}

	private WebElement findCaixaTexto() {
		var xPathCaixaTexto = "//*[@id=\"main\"]/footer//*[@role='textbox']";
		return webDriver.findElement(By.xpath(xPathCaixaTexto));
	}
}

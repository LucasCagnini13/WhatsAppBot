package com.LucasCagnini13.botWhatsapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BotWhatsappApplication {

	public static void main(String[] args) {

		System.setProperty("webdreiver.chrome.driver", "C:\\Users\\Lucas Gabriel\\Desktop\\programação\\chromeDriver");
		SpringApplication.run(BotWhatsappApplication.class, args);
	}

	@Bean
	public WebDriver webDriver() {
		System.out.println("Instanciando o Seleniun webdriver");
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless=new");
		var webDriver = new ChromeDriver(options);
		webDriver.get("https://web.whatsapp.com/");
		return webDriver;
	}

}

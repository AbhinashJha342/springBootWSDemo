package com.example.microservices.currencyexchangeservice;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("currency-exchange-service")
public class Configuration {

	private int euroToInrRate;
	
	
	public Configuration(int euroToInrRate) {
		super();
		this.euroToInrRate = euroToInrRate;
	}


	public int getEuroToInrRate() {
		return euroToInrRate;
	}


	public void setEuroToInrRate(int euroToInrRate) {
		this.euroToInrRate = euroToInrRate;
	}
	
	
}

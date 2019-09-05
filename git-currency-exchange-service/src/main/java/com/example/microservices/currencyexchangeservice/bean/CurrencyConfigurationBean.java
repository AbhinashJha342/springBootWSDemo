package com.example.microservices.currencyexchangeservice.bean;

public class CurrencyConfigurationBean {

	private int euroToInrRate;
	
	protected CurrencyConfigurationBean() {
		super();
	}

	public CurrencyConfigurationBean(int euroToInrRate) {
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

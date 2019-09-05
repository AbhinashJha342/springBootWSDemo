package com.example.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.currencyexchangeservice.bean.ExchangeRate;



@RestController
public class CurencyExchangeController {
	
	/*
	 * @Autowired Configuration limitConfigBean;
	 */
	
	@Autowired
	Environment environment;
	
	@Autowired
	ExchangeRateRepository exchangeRate;

	/*
	 * @GetMapping("/currencyExchange/euro-to-inr") public CurrencyConfigurationBean
	 * euroToInrCurrencyRate() {
	 * 
	 * int serverPort =
	 * Integer.parseInt(environment.getProperty("local.server.port")); return new
	 * CurrencyConfigurationBean(limitConfigBean.getEuroToInrRate());
	 * 
	 * }
	 */
	
	@GetMapping("/currencyExchange/{from}/to/{to}")
	public ExchangeRate getCurrencyExchangerate(@PathVariable String from, @PathVariable String to) {
		
		int serverPort =Integer.parseInt(environment.getProperty("local.server.port"));
		//ExchangeRate er = new ExchangeRate(new Long(1001), from, to, new BigDecimal(75), serverPort);
		ExchangeRate er = exchangeRate.findByFromAndTo(from, to);
		er.setPort(serverPort);
		return er;
	}
	
}

package com.example.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.microservices.currencyexchangeservice.bean.ExchangeRate;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long>{

	public abstract ExchangeRate findByFromAndTo(String from, String to);
}

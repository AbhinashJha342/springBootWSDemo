package com.example.microservices.limitsservices;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("limits-service")
public class Configuration {

	private int maximum;
	private int minimum;
	
	public Configuration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
}

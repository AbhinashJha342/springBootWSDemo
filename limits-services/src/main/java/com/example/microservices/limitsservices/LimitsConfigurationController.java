package com.example.microservices.limitsservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.limitsservices.bean.LimitConfigurationBean;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration limitConfigBean;
	
	@GetMapping("/getLimits")
	public LimitConfigurationBean getLimits() {
		return new LimitConfigurationBean(1000, 1);
	}
	
	@GetMapping("/getLimitsWithConfig")
	public LimitConfigurationBean getLimitsWithConfig() {
		return new LimitConfigurationBean(limitConfigBean.getMaximum(), limitConfigBean.getMinimum());
	}
	

}

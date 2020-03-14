package com.example.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.client.proxy.MicroserviceOneProxy;
import com.example.client.proxy.MicroserviceThreeProxy;
import com.example.client.proxy.MicroserviceTwoProxy;

@Service
public class CallMicroserviceService {

	@Autowired
	private MicroserviceOneProxy microserviceOneProxy;
	
	@Autowired
	private MicroserviceTwoProxy microserviceTwoProxy;
	
	@Autowired
	private MicroserviceThreeProxy microserviceThreeProxy;
	
	
	public String callMicroserviceThree() {
		return microserviceThreeProxy.callMicroserviceThree();
	}

	public String callMicroserviceTwo() {
		return microserviceTwoProxy.callMicroserviceTwo();
	}

	public String callMicroserviceOne() {
		return microserviceOneProxy.callMicroserviceOne();
	}

	
	

	
}

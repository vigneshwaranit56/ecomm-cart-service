package com.ecom.cart.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/carts")
public class CartServiceController {

    final Logger log = LoggerFactory.getLogger(CartServiceController.class);

	@GetMapping
	public String testController() {
        log.info("test controller");

		return "hello cart Service";
	}
	
}

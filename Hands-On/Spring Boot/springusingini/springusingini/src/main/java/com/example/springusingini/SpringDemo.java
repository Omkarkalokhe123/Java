package com.example.springusingini;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class SpringDemo {
	
	@GetMapping("/hi")
	public String spring()
	{
		return "ANP-C1496 \n"
				+ "Omkar Kalokhe \n"
				+"Advanced Java Programmung";
	}

}

package com.thawanaulas.aula;

import com.thawanaulas.aula.entities.Order;
import com.thawanaulas.aula.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Order order = new Order(2282,150.00,20.00);
		System.out.println("Codigo do pedido : " + order.getBasic());
		System.out.printf("Valor total : %.2f%n ",orderService.total(order));

	}
}

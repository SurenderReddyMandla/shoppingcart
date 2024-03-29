package com.shopping.cart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.shopping.cart")
public class ShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
	}
	
	    @Bean
	    public CommandLineRunner initData(ShoppingCartRepository shoppingCartRepository) {
	        return args -> {
	            // Inserting sample data
	            Item item1 = new Item();
	            item1.setName("Shoe");
	            shoppingCartRepository.save(item1);

	            Item item2 = new Item();
	            item2.setName("Jeans");
	            shoppingCartRepository.save(item2);
	        };
	    }

}

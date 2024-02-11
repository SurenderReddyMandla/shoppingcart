package com.shopping.cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

	    
	    private final ShoppingCartRepository shoppingCartRepository;
	    
	    @Autowired
	    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
	        this.shoppingCartRepository = shoppingCartRepository;
	    }
	 	
	    public List<Item> getItems() {
	        return shoppingCartRepository.findAll();
	    }

	    public void addItem(Item item) {
	        shoppingCartRepository.save(item);
	    }

	    public void removeItem(Long itemId) {
	        shoppingCartRepository.deleteById(itemId);
	    }
}

package com.shopping.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cart")
public class ShoppingCartController {
	
	 @Autowired
	    private ShoppingCartService shoppingCartService;

	    @GetMapping("/list")
	    public List<Item> listItems() {
	        return shoppingCartService.getItems();
	    }

	    @PostMapping("/add")
	    public void addItem(@RequestBody Item item) {
	        shoppingCartService.addItem(item);
	    }

	    @DeleteMapping("/remove/{itemId}")
	    public void removeItem(@PathVariable Long itemId) {
	        shoppingCartService.removeItem(itemId);
	    }

}

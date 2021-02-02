package com.techelevator.application;

import java.util.List;

import com.techelevator.models.Product;
import com.techelevator.services.AuthenticationService;
import com.techelevator.services.ProductService;
import com.techelevator.views.UserOutput;

public class VendingMachine
{
	AuthenticationService authenticationService;
	ProductService productService;

	public VendingMachine(String baseUrl)
	{
		authenticationService = new AuthenticationService(baseUrl);
		productService = new ProductService(baseUrl);
	}

	public void run()
	{
		int menuSelection = 0;
		
		UserOutput.displayWelcome();
		
		if(menuSelection == 1)
		{
			displayProducts();
		}
		else if (menuSelection == 2)
		{
			selectProduct();
		}
		else if (menuSelection == 0)
		{
			break;
		}
		else
		{
			System.out.println("Please select a valid option");
		}
		System.out.println("Goodbye");
	}
	
	private void displayProducts()
	{
		List<Product> products = productService.getAllProducts();
		
		UserOutput.displayProducts(products);
	}

	private void selectProduct()
	{
		List<Product> products = productService.getAllProducts();
		UserOutput.displayProducts(products);
		
		// get selection from user
		int productId = UserInput.getProductSelection(products);
		
		// call the api to get the product
		Product selectedProduct = productService.getProductById(productId);
		
		// display the product details of the selected product
		UserOutput.displayProductDetails(selectedProduct);
	}

}

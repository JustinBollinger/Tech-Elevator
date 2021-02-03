package com.techelevator.application;

import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.asn1.x509.UserNotice;

import com.techelevator.exceptions.AuthenticationServiceException;
import com.techelevator.models.AuthenticatedUser;
import com.techelevator.models.Product;
import com.techelevator.models.UserCredentials;
import com.techelevator.services.AuthenticationService;
import com.techelevator.services.ProductService;
import com.techelevator.views.UserInput;
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
    	 
    	 UserOutput.displayWelcome();

         while (true) 
         {   
        	 int menuSelection = UserInput.getHomeMenuOption();  
        	 
        	 if(menuSelection == 1)
        	 {
        		 displayProducts();
        	 }
        	 else if(menuSelection == 2)
        	 {
        		 selectProduct();
        	 }
        	 else if(menuSelection == 3)
        	 {
        		 deleteProduct();
        	 }
        	 else if(menuSelection == 4)
        	 {
        		 userLogin();
        	 }
        	 else if(menuSelection == 0)
        	 {
        		 // exit
        		 break;
        	 }
        	 else 
        	 {
        		 // invalid selection
        		 System.out.println("Please select a valid option");
			 }
         }
         
         System.out.println("Goodbye");	 
    }
    
    private void displayProducts()
    {
    	// TODO: get a list of products from the api
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
    
	private void deleteProduct()
	{
		List<Product> products = productService.getAllProducts(); 
		UserOutput.displayProducts(products);
		// get selection from user
		int productId = UserInput.getProductDeletion(products);
		// call api
		productService.getProductById(productId);
		UserOutput.displayProductDeletionMessage();
	}
	
	private void userLogin()
	{
		// figure this out
		UserCredentials credentials = UserInput.getUserCredentials();
		AuthenticatedUser user = null;
		
		try
		{
			user = authenticationService.login(credentials);
			productService.AUTH_TOKEN = user.getToken();
			System.out.println("Login Successful");
		}
		 catch (AuthenticationServiceException e)
		{
			e.printStackTrace();
		}
	}
    
}

package com.techelevator.application;

import com.techelevator.models.CashRegister;
import com.techelevator.models.Inventory;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

/**
 * The store class is the main application.
 * 
 * Responsibilities:
 *      manage the flow of the application
 * 
 * Dependencies:
 *      Inventory
 *      ShoppingCart
 *      CashRegister
 * 
 *      UI:
 *      UserInput
 *      UserOutput
 * 
 *      Utility:
 *      Logger - used to log errors and transactions
 */
public class Store 
{
	
	private UserInput userInput = new UserInput();
	
	private Inventory inventory = new Inventory();
	
    public void run()
    {

        while(true)
        {
            // display main menu and get their selection
            String option = userInput.getHomeScreenOption();
            

            if(option.equals("add"))
            {
                // do add item task
            	addToCart();
            }
            else if(option.equals("pay"))
            {
            	
                // go to cash register to check out
            	checkOut();
                break;
            }
            else if (option.equals("cart"))
			{
            	
				// display the cart
            	showCart();
			}
            else if (option.equals("quit"))
            {
            	break; //means they quit the program
            }	
            else
            {
                // invalid option try again
            }

        }

    }
    
    public void addToCart()
    {
    	// show the products
    	UserOutput.displayInventory(inventory);
    	
    	// prompt user for input
    }
    
    public void checkOut()
    {
    	// 
    }
    
    public void showCart()
    {
    	
    }
    
  
}

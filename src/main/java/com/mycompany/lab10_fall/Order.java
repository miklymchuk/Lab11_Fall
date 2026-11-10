/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab10_fall;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 6312398
 */
public class Order {
    public static final double CHICKEN_SALAD_PRICE = 6.50;
    public static final double TURKEY_SANDWICH_PRICE = 6.75;
    public static final double VEGETABLE_WRAP_PRICE = 6.00;
    public static final double GRILLED_CHEESE_PRICE = 5.00;
    
    public static final double COFFEE_PRICE = 1.50;
    public static final double TEA_PRICE = 1.50;
    public static final double SODA_PRICE = 2.00;
    public static final double JUICE_PRICE = 1.75;
    
    public String entree = "";
    public String drink = "";
    public Boolean water = false;
    public String specialRequest = "";
    
    public Order() {
        
    }

    public String getEntree() {
        return entree;
    }

    public void setEntree(String entree) {
        this.entree = entree;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public Boolean getWater() {
        return water;
    }
   
    public String getWaterToString() {
        if (water == false) {
            return "No";
        }
        return "Yes";
    }

    public void setWater(Boolean water) {
        this.water = water;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }
    
    public Order(String entree, String drink, Boolean water, String specialRequest) {
        this.entree = entree;
        this.drink = drink;
        this.water = water;
        this.specialRequest = specialRequest;
    }
    
    public double getCost() {
        double cost = 0;
        
        switch(entree) {
            case "Chicken Salad": cost+= CHICKEN_SALAD_PRICE; break;
            case "Turkey Sandwich": cost+= TURKEY_SANDWICH_PRICE; break;
            case "Vegetable Wrap": cost+= VEGETABLE_WRAP_PRICE; break;
            case "Grilled Cheese": cost+= GRILLED_CHEESE_PRICE; break;
            default:
        }
        
        switch(drink) {
            case "Coffee": cost+= COFFEE_PRICE; break;
            case "Tea": cost+= TEA_PRICE; break;
            case "Soda": cost+= SODA_PRICE; break;
            case "Juice": cost+= JUICE_PRICE; break;
            default:
        }
        
        return cost;
    }
    
    public double getCost(String item) {
        switch(item) {
            case "Chicken Salad": return CHICKEN_SALAD_PRICE;
            case "Turkey Sandwich": return TURKEY_SANDWICH_PRICE; 
            case "Vegetable Wrap": return VEGETABLE_WRAP_PRICE; 
            case "Grilled Cheese": return GRILLED_CHEESE_PRICE; 
            case "Coffee": return COFFEE_PRICE; 
            case "Tea": return TEA_PRICE; 
            case "Soda": return SODA_PRICE; 
            case "Juice": return JUICE_PRICE; 
            default: return 0;
        }
    }
}

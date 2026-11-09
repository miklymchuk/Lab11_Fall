/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab10_fall;

/**
 *
 * @author 6312398
 */
public class Order {
    public static final double CHICKEN_SALAD_PRICE = 6.50;
    public static final double TURKEY_SANDWICH_PRICE = 6.75;
    public static final double VENEGTABLE_WRAP_PRICE = 6.00;
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
            case "Chicken Salad": cost+= 6.50; break;
            case "Turkey Sandwich": cost+= 6.75; break;
            case "Vegetable Wrap": cost+= 6.00; break;
            case "Grilled Cheese": cost+= 5.00; break;
            default:
        }
        
        switch(drink) {
            case "Coffee": cost+= 1.50; break;
            case "Tea": cost+= 1.50; break;
            case "Soda": cost+= 2.00; break;
            case "Juice": cost+= 1.75; break;
            default:
        }
        
        return cost;
    }
}

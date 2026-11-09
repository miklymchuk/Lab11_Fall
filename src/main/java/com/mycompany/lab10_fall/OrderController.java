/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab10_fall;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
/**
 * FXML Controller class
 *
 * @author 6312398
 */
public class OrderController implements Initializable {


    @FXML
    private Pane root;
    @FXML
    private VBox rootBox;
    @FXML
    private MenuBar menu;
    @FXML
    private Menu fileMenu;
    @FXML
    private MenuItem placeOrderItem;
    @FXML
    private MenuItem clearOrderItem;
    @FXML
    private MenuItem exitItem;
    @FXML
    private Menu editMenu;
    @FXML
    private MenuItem clearEntreeItem;
    @FXML
    private MenuItem clearDrinkItem;
    @FXML
    private MenuItem clearSpecialRequestsItem;
    @FXML
    private Menu helpMenu;
    @FXML
    private MenuItem aboutItem;
    @FXML
    private HBox entreeDrinkBox;
    @FXML
    private ListView<String> entrees;
    @FXML
    private VBox drinkSelectionBox;
    @FXML
    private Label drinkSelectionLabel;
    @FXML
    private RadioButton coffeeBtn;
    @FXML
    private RadioButton teaBtn;
    @FXML
    private RadioButton sodaBtn;
    @FXML
    private RadioButton juiceBtn;
    @FXML
    private CheckBox requestFreeWater;
    @FXML
    private Label specialRequestsLabel;
    @FXML
    private TextField specialRequestsText;
    @FXML
    private GridPane orderInfoPane;
    @FXML
    private Label currentOrderLabel;
    @FXML
    private Label totalCostLabel;
    @FXML
    private Button placeOrderBtn;
    @FXML
    private Button clearOrderBtn;
    @FXML
    private Label entreeSelectionLabel;
    @FXML
    private ToggleGroup drinks;
    
    @FXML 
    private void placeOrder(ActionEvent event) {
        
    }
    
    @FXML
    private void clearOrder(ActionEvent event) {
        clearEntree(event);
        clearDrink(event);
        requestFreeWater.setSelected(false);
        clearSpecialRequests(event);
        currentOrderLabel.setText("Current Order:");
        totalCostLabel.setText("Total Cost: $0.00");
    }
    
    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    private void clearEntree(ActionEvent event) {
        entrees.getSelectionModel().clearSelection();
    }
    
    @FXML
    private void clearDrink(ActionEvent event) {       
        drinks.getToggles().clear();
    }
    
    @FXML
    private void clearSpecialRequests(ActionEvent event) {
        specialRequestsText.setText("");
    }
    
    @FXML
    private void displayAbout(ActionEvent event) {
    
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        entrees.getItems().addAll("Chicken Salad", "Turkey Sandwich", "Vegetable Wrap", "Grilled Cheese");
          
        coffeeBtn.setToggleGroup(drinks);
        teaBtn.setToggleGroup(drinks);
        sodaBtn.setToggleGroup(drinks);
        juiceBtn.setToggleGroup(drinks);
        
        double cost = 0;
        
        entrees.selectionModelProperty().addListener((cl, oldSelected, newSelected) -> {
            if (entrees.getSelectionModel().getSelectedItem().equals("Chicken Salad")) {
                
            }
        });
    }    
    
}

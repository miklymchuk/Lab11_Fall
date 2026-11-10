package com.mycompany.lab10_fall;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mikly
 */
public class OrderSummaryController implements Initializable {

    @FXML
    private GridPane root;
    @FXML
    private Label orderSummaryText;
    @FXML
    private Label entreeLabel;
    @FXML
    private Label drinkLabel;
    @FXML
    private Label waterLabel;
    @FXML
    private Label specialRequestsLabel;
    @FXML
    private Label entree;
    @FXML
    private Label drink;
    @FXML
    private Label water;
    @FXML
    private Label specialRequests;
    @FXML
    private Label entreeCost;
    @FXML
    private Label drinkCost;
    @FXML
    private Separator orderSummarySeparator;
    @FXML
    private Label totalCostLabel;
    @FXML
    private Label totalCost;
    @FXML
    private Button closeBtn;
    
    @FXML
    public void closeWindow(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    
    public void setEntree(String text, double cost) {
        entree.setText(text);
        String formattedCost = String.format("%.2f", cost);
        entreeCost.setText("$" + formattedCost);
    }
    
    public void setDrink(String text, double cost) {
        drink.setText(text);
        String formattedCost = String.format("%.2f", cost);
        drinkCost.setText("$" + formattedCost);
    }
    
    public void setWater(String text) {
        water.setText(text);
    }
    
    public void setSpecialRequests(String text) {
        specialRequests.setText(text);
    }
    
    public void setTotalCost(double cost) {
        String formattedCost = String.format("%.2f", cost);
        totalCost.setText("$" + formattedCost);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

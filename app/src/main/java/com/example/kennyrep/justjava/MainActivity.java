package com.example.kennyrep.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    int quantity = 0;
    public void submitOrder(View view) {


        int price = calculatePrice();
        String priceMessage = createOrderSummary(price);
        displayMessage(priceMessage);

      }

    /**
     * This method calculate the price of coffee.
     */

      private int calculatePrice(){
        int price = quantity * 5;
        return price;
      }
    /**
     * This method gives the summary of the order made by a customer.
     */
      private String createOrderSummary(int price){
          String priceMessage = "Name: Audu Kehinde" + "\n" + "Quantity: " + quantity + "\n";
          String summary = priceMessage +  "Amount Due is: #"+ price + "\nThank You!";
          return summary;
      }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int numberofcoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberofcoffees);
    }
//    private void disply(String value) {
//        TextView quantityTextView = (TextView) findViewById(R.id.thank_you);
//        quantityTextView.setText("" + value);
//    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }
    public void decrement(View view) {

        quantity = quantity - 1;
        display(quantity);
    }



}

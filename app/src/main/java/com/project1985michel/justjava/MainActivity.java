package com.project1985michel.justjava;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    public int quantity =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method quantity++
     *
     * @param view
     */
    public void increment(View view) {

        //int quantity = 3;
        quantity++;
        //display(quantity);
        this.submitOrder(view);

    }

    /**
     * This method -- the variable quantity
     *
     * @param view
     */
    public void decrement(View view) {

        // int quantity = 1;
        quantity--;
        if (quantity < 0)
            quantity = 0;

        //display(quantity);
        this.submitOrder(view);

    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String priceMessage= ((quantity == 0) ? "   Free!   " : (" "+NumberFormat.getCurrencyInstance().format(quantity*5)+" "));
        //" "+NumberFormat.getCurrencyInstance().format(number)+" "

//        if(quantity==0)
//            priceMessage = " Free! ";
//        else
//            priceMessage = ""+(quantity * 5);

        displayMessage(priceMessage);

        display(quantity);
//        displayPrice(quantity * 5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(" "+NumberFormat.getCurrencyInstance().format(number)+" ");
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
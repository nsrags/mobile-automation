package com.works.client;
import com.works.service.StockService;

/**
 * Created by raghavan on 4/25/15.
 */
public class StockClient {
    public static void main(String[] args) {
        double price = StockService.getPrice("AMZN");
        System.out.println("The stock Price for AMAZON:"+price);
    }
}

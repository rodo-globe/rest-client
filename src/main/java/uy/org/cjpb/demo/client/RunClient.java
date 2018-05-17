/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.org.cjpb.demo.client;

import uy.org.cjpb.demo.client.dto.OrderDto;

/**
 *
 * @author rodo
 */
public class RunClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OrdersClient client = new OrdersClient();
        OrderDto order = client.getOrderById(1);
        
        System.out.println(" Order id: " + order.getId() + ",Customer:  " + order.getCustomerName() + ", Ammount " + order.getAmount());
        
        
    }
    
}

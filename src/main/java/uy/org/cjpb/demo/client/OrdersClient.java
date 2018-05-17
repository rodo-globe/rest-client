/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.org.cjpb.demo.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import uy.org.cjpb.demo.client.dto.OrderDto;

/**
 *
 * @author rodo
 */
public class OrdersClient {
     
    public OrderDto getOrderById(int id){
     
        Client client = ClientBuilder.newClient();
        OrderDto order = client
                .target("http://localhost:8080/cjpb-server/rest/orders")
                .path("{oid}")
                .resolveTemplate("oid", 1)
                .request(MediaType.APPLICATION_JSON)
                .get(OrderDto.class);
        
        return order;
    }
    
}

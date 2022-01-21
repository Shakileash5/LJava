package com.mycompany.proxy;

import java.util.List;

public class OrderFulfillment implements IOrder {
    private List<Warehouse> warehouses;
    
    public void fulfillOrder(Order order) {
        /* For each item in a customer order, check each
        warehouse to see if it is in stock.
        If it is then create a new Order for that warehouse.
        Else check the next warehouse.
        Send all the Orders to the warehouse(s) after you finish
        iterating over all the items in the original Order. */
        for (Item item: order.itemList) {
            for (Warehouse warehouse: warehouses) {
                if (warehouse.currentInventory(item) > 0) {
                    Order newOrder = new Order();
                    newOrder.itemList.add(item);
                    warehouse.fulfillOrder(newOrder);
                }
            }
        }
        return;
    }
}
        
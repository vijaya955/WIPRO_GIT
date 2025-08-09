package com.example.inventoryservice.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryConsumer {

    @KafkaListener(topics = "order-events", groupId = "inventory-group")
    public void listen(String message) {
        System.out.println("📦 Inventory Service received: " + message);
        // TODO: add real inventory processing logic here
    }
}

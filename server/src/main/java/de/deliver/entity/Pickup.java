package de.deliver.entity;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class Pickup {
    CollectionType collectionType;

    // scheduledFor;
    ZonedDateTime scheduledFor;
    // completedAt;
    ZonedDateTime completedAt;

    public boolean isCompleted() { return null != completedAt;}

    User provider;
    User beneficiary;

    public Pickup(List<Item> items, ZonedDateTime initialSchedule) {
        // [2] enrich Order/Pickup
        if (items.stream().anyMatch(item -> ItemType.PRODUCT.equals(item.getItemType()))) {
            collectionType = CollectionType.PRODUCT;
        }
        if (items.stream().anyMatch(item -> ItemType.SERVICE.equals(item.getItemType()))) {
            collectionType = CollectionType.SERVICE;
            if(collectionType == CollectionType.PRODUCT) {
                collectionType = CollectionType.HYBRID;
            }
        }
        scheduledFor = initialSchedule;

        // Set beneficiary from logged-in user principal
    }
}
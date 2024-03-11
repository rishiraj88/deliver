package de.deliver.entity;

import de.deliver.entity.enums.CollectionType;
import de.deliver.entity.enums.ItemType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@Entity
public class Pickup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private CollectionType collectionType;

    // scheduledFor;
    private ZonedDateTime scheduledFor;
    // completedAt;
    private ZonedDateTime completedAt;
    @JdbcTypeCode(SqlTypes.JSON)
    private User provider;
    @JdbcTypeCode(SqlTypes.JSON)
    private User beneficiary;
    public Pickup(List<Item> items, ZonedDateTime initialSchedule) {
        // [2] enrich Order/Pickup
        if (items.stream().anyMatch(item -> ItemType.PRODUCT.equals(item.getItemType()))) {
            collectionType = CollectionType.PRODUCT;
        }
        if (items.stream().anyMatch(item -> ItemType.SERVICE.equals(item.getItemType()))) {
            collectionType = CollectionType.SERVICE;
            if (collectionType == CollectionType.PRODUCT) {
                collectionType = CollectionType.HYBRID;
            }
        }
        scheduledFor = initialSchedule;

        // Set beneficiary from logged-in user principal
    }

    public boolean isCompleted() {
        return null != completedAt;
    }
}
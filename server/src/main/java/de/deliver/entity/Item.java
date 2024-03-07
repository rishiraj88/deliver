package de.deliver.entity;

import lombok.Data;

@Data
public abstract class Item {
    private Integer id;
    private String code;
    private String label;
    private ItemCategory category;
    private ItemType itemType;
}

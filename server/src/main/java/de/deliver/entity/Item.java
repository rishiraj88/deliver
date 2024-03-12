package de.deliver.entity;

import de.deliver.entity.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Item {
    private Integer id;
    private String code;
    private String label;
    private ItemCategory category;
    private ItemType itemType;
}

package de.deliver.entity;

import de.deliver.entity.enums.ItemType;
import de.deliver.entity.enums.ProductFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product extends Item{
    @Id long id;
    private ProductFormat form;

    public Product(String itemCode,String itemLabel,String cat,ProductFormat format) {
        super(1,itemCode,itemLabel,new ItemCategory(cat), ItemType.PRODUCT);
        this.form = format;
    }

}
/*
 volatile : flags
 AtomicInteger, AtomicLong : counters
 AtomicReference : caches and non-blocking algos
 */
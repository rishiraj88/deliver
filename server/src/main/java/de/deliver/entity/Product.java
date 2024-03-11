package de.deliver.entity;

import de.deliver.entity.enums.ProductFormat;

public class Product extends Item{
    private ProductFormat form;
}
/*
 volatile : flags
 AtomicInteger, AtomicLong : counters
 AtomicReference : caches and non-blocking algos
 */
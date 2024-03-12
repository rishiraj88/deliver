package de.deliver.entity;

import de.deliver.entity.enums.ItemType;
import de.deliver.entity.enums.ServiceDomain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Service extends Item  {
    @Id
    private ServiceDomain type;

    
    public Service(String itemCode,String itemLabel,String cat, ServiceDomain domain) {
        super(1,itemCode,itemLabel,new ItemCategory(cat), ItemType.PRODUCT);
        type = domain;
    }

}

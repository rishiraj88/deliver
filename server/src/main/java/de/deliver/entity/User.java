package de.deliver.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identifier")
    private Long identifier;

    private String name;

    private String currentRole;
    private String desiredRole;
    private String nextRole;
}

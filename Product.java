package com.itvedant.grocerystore.entities;
import java.time.Instant;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Integer id;

    @Column(unique = true,nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;
    private String description;

    private String imageUrl;

    @CreatedDate
    @Column(updatable = false)
    private Instant createdAt;
    @LastModifiedDate
    private Instant updatedAt;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToMany
    @JoinTable(name = "product_order", joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
                    inverseJoinColumns = @JoinColumn (name = "order_id" , referencedColumnName = "id"))
                    private List<Order>orders;   

}



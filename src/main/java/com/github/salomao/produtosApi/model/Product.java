package com.github.salomao.produtosApi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Override
    public String toString() {
        return "Produto{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", description = '" + description + '\'' +
                ", price = " + price +
                '}';
    }
}

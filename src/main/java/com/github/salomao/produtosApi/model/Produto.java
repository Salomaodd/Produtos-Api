package com.github.salomao.produtosApi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {

    private int id;
    private String name;
    private String description;
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

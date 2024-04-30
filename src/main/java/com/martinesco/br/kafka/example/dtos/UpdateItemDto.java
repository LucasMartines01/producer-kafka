package com.martinesco.br.kafka.example.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateItemDto {
    private String name;
    private String description;
    private Double price;
    private Integer quantityInStock;
}
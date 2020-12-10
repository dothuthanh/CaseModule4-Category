package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}

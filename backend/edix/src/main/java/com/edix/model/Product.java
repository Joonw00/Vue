package com.edix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Getter
public class Product {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    private String title;
    private String imageName;
    private String content;

    public Product() {
        // 기본 생성자
    }

    public Product(String title, String imageName, String content) {
        this.title = title;
        this.imageName = imageName;
        this.content = content;
    }
}

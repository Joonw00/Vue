package com.edix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Getter
@Builder
public class About {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    private String title;
    private String content;

    public About() {
        // 기본 생성자
    }

    @Builder
    public About(UUID id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public void updateDetails(String title, String content) {
        this.title = title;
        this.content = content;
    }

}

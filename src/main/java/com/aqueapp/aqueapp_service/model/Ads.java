package com.aqueapp.aqueapp_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Date;

@Entity
@Getter
@Setter

public class Ads {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Arrays images;
    private String createdBy;
    private Date createdAt;
    private Date updatedAt;
}

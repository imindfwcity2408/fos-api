package com.aa.fos_api.model;

import lombok.Data;

import java.util.UUID;

@Data
public class User {
    private String name;
    private String city;
    private UUID id;
}

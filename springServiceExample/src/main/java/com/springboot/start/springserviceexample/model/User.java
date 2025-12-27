package com.springboot.start.springserviceexample.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public User(){

    }
}

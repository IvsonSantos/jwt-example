package com.example.jwtdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="users")
public class User {

    @Id
    private String userName;
    private String password;
    public User() {
    }
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}

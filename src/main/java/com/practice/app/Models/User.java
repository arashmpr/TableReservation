package com.practice.app.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String role;
    private String username;
    private String password;
    private String email;
    private Address address;
}



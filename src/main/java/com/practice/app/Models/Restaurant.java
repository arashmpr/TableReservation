package com.practice.app.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private String name;
    private String managerUsername;
    private String type;
    private String startTime;
    private String endTime;
    private String description;
    private Address address;
}

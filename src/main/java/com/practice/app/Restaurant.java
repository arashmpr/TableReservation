package com.practice.app;

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
    private int startTime;
    private int endTime;
    private String description;
    private String address;
}

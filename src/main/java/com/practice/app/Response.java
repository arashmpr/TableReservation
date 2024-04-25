package com.practice.app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {
    private boolean success;
    private String data;

    public Response(boolean success, String data) {
        this.success = success;
        this.data = data;
        }
    }
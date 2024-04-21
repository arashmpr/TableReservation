package com.practice.app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Context {
    private UserManager userManager;

    public Context() {
        this.userManager = new UserManager();
    }
}

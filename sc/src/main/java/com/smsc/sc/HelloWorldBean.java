package com.smsc.sc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
public class HelloWorldBean {
    public HelloWorldBean(String message) {
        this.message = message;
    }

    private String message;
}

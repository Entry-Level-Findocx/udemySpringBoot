package com.practice2code.springboot.one.notsocoolapp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDaily() {
        return "Please return this text";
    }
}

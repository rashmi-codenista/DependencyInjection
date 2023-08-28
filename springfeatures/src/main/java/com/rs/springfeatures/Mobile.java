package com.rs.springfeatures;

import org.springframework.stereotype.Component;

@Component("o")
public class Mobile implements Provider{
    public void get(){
        System.out.println("mobile");
    }
}
